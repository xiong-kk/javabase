package com.free.java;

/**
 * @author free
 * @create 2023-04-22-13:06
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoApp {
    private static Scanner scanner = new Scanner(System.in);
    private static List<TodoItem> todoList = new ArrayList<>();
    private static String filename = "待办.txt";

    public static void main(String[] args) {
        loadTodoList();

        boolean quit = false;
        while (!quit) {
            printMainMenu();
            char choice = scanner.nextLine().charAt(0);
            switch (choice) {
                case '1':
                    addTodoItem();
                    break;
                case '2':
                    showTodoList();
                    break;
                case '3':
                    markTodoItemAsDone();
                    break;
                case '4':
                    removeTodoItem();
                    break;
                case '5':
                    saveTodoList();
                    quit = true;
                    break;
                default:
                    System.out.println("找不到该选项, 请重新输入");
            }
        }
        System.out.println("再见!");
    }

    public static void printMainMenu() {
        System.out.println("----- 待办事项管理程序 -----");
        System.out.println("1. 添加新的待办事项");
        System.out.println("2. 查看所有待办事项");
        System.out.println("3. 标记待办为已完成");
        System.out.println("4. 移除待办事项");
        System.out.println("5. 保存待办列表并退出");
        System.out.print("输入你的选择：");
    }

    public static void addTodoItem() {
        System.out.print("输入新的待办事项");
        String text = scanner.nextLine();
        TodoItem item = new TodoItem(text);
        todoList.add(item);
        System.out.println("待办事项已添加!");
    }

    public static void showTodoList() {
        if (todoList.isEmpty()) {
            System.out.println("当前待办事项列表为空");
        } else {
            System.out.println("----- 待办事项列表 -----");
            int i = 1;
            for (TodoItem item : todoList) {
                System.out.printf("%d. [%s] %s\n", i++, item.isDone() ? "X" : " ", item.getText());
            }
        }
    }

    public static void markTodoItemAsDone() {
        System.out.print("输入想要标记为已完成的待办事项编号: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 1 || index > todoList.size()) {
            System.out.println("找不到该编号.");
        } else {
            TodoItem item = todoList.get(index - 1);
            if (item.isDone()) {
                System.out.println("这个事项已经是完成状态了.");
            } else {
                item.markAsDone();
                System.out.println("标记成功.");
            }
        }
    }

    private static void removeTodoItem() {
        System.out.print("输入想要移除的待办事项编号: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 1 || index > todoList.size()) {
            System.out.println("找不到该编号.");
        } else {
            todoList.remove(index - 1);
            System.out.println("移除成功.");
        }
    }

    private static void loadTodoList() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String text = parts[0];
                boolean done = Boolean.parseBoolean(parts[1]);
                TodoItem item = new TodoItem(text, done);
                todoList.add(item);
            }
        } catch (IOException e) {
            System.out.println("加载待办事项文件失败.");
        }
    }

    private static void saveTodoList() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (TodoItem item : todoList) {
                String line = String.format("%s,%b\n", item.getText(), item.isDone());
                writer.write(line);
            }
        } catch (IOException e) {
            System.out.println("保存待办事项文件失败.");
        }
        System.out.println("待办事项列表已保存.");
    }
}

class TodoItem {
    private String text;
    private boolean done;

    public TodoItem(String text) {
        this.text = text;
    }

    public TodoItem(String text, boolean done) {
        this.text = text;
        this.done = done;
    }

    public String getText() {
        return text;
    }

    public boolean isDone() {
        return done;
    }

    public void markAsDone() {
        done = true;
    }
}
