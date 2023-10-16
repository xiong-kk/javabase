package com.free.java;

/**
 * @author free
 * @create 2023-04-23-14:42
 */
public class CustomerView {
    private CustomerList customers=new CustomerList(10);
    //显示菜单界面
    public void enterMainMenu(){
        boolean isFlag=true;
        while (isFlag){
            System.out.println("\n客户信息管理软件");
            System.out.println("1.添加客户");
            System.out.println("2.修改客户");
            System.out.println("3.删除客户");
            System.out.println("4.客户列表");
            System.out.println("5.退出\n");
            System.out.println("请选择(1-5):");

            char menu=CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出(y/n):");
                    char isExit=CMUtility.readConfirmSelction();
                    if(isExit=='Y'){
                        isFlag=false;
                    }
                    break;
            }

        }

    }
    //添加客户的操作
    public void addNewCustomer(){
        System.out.println("添加客户");
        System.out.println("姓名：");
        String name = CMUtility.readString(10);
        System.out.println("性别：");
        String gender = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readNumber();
        System.out.println("电话：");
        String phone = CMUtility.readString(13);
        System.out.println("邮箱：");
        String email = CMUtility.readString(30);

        Customer customer=new Customer(name,gender,age,phone,email);
        boolean isSuccess = customers.addCustomer(customer);
        if(isSuccess){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }

    //修改客户的操作
    public void modifyCustomer(){
        System.out.println("修改客户");
        Customer cust;
        int number;
        for (;;){
            System.out.println("请选择待修改客户的编号(-1退出):");
            number=CMUtility.readNumber();
            if(number==-1){
                return;
            }
            cust = customers.getCustomer(number - 1);
            if(cust==null){
                System.out.println("无法找到指定的客户");
            }else {
                break;
            }
        }

        System.out.println("姓名("+cust.getName()+")：");
        String name = CMUtility.readString(10,cust.getName());
        System.out.println("性别("+cust.getGender()+")：");
        String gender = CMUtility.readChar(cust.getGender());
        System.out.println("年龄("+cust.getAge()+")：");
        int age = CMUtility.readNumber(cust.getAge());
        System.out.println("电话("+cust.getPhone()+")：");
        String phone = CMUtility.readString(13,cust.getPhone());
        System.out.println("邮箱("+cust.getEmail()+")：");
        String email = CMUtility.readString(30,cust.getEmail());

        Customer customer=new Customer(name,gender,age,phone,email);
        boolean isSuccess = customers.replaceCustomer(number-1,customer);
        if(isSuccess){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }

    }

    //删除客户的操作
    public void deleteCustomer(){
        System.out.println("删除客户");
        Customer cust;
        int number;
        for (;;){
            System.out.println("请选择待删除客户编号(-1退出):");
            number=CMUtility.readNumber();
            if(number==-1){
                return;
            }
            cust = customers.getCustomer(number - 1);
            if(cust==null){
                System.out.println("无法找到指定的客户");
            }else {
                break;
            }
        }

        System.out.println("确认是否删除(y/n):");
        char isDelete=CMUtility.readConfirmSelction();
        if(isDelete=='Y'){
            boolean isSuccess = customers.deleteCustomer(number-1);
            if(isSuccess){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            return;
        }


    }

    //显示客户列表的操作
    public void listAllCustomers(){
        System.out.println("客户列表");
        int total=customers.getTotal();
        if(total==0){
            System.out.println("没有客户记录");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] custs = customers.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust=custs[i];
                System.out.println((i+1)+"\t\t"+cust.getName()+"\t"+cust.getGender()+"\t\t"
                +cust.getAge()+"\t\t"+cust.getPhone()+"\t"+cust.getEmail());
            }

        }
        System.out.println("客户列表结束");
    }

    public static void main(String[] args) {
        CustomerView view=new CustomerView();
        view.enterMainMenu();
    }
}
