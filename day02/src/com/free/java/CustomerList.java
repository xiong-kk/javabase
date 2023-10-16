package com.free.java;

/**用户管理
 * @author free
 * @create 2023-04-23-14:43
 */
public class CustomerList {
    private Customer[] customers;//客户对象数组
    private int total=0;//记录已保存的客户的数量

    //指定客户数组的长度
    public CustomerList(int totalCustomer){
        customers=new Customer[totalCustomer];
    }
    //添加指定客户到数组中，添加成功返回true，失败返回false
    public boolean addCustomer(Customer customer){
        if(total>=customers.length){
            return false;
        }
        customers[total++]=customer;
        return true;
    }

    //修改指定位置的客户信息，添加成功返回true,失败返回false
    public boolean replaceCustomer(int index,Customer cust){
        if(index<0||index>=total){
            return false;
        }
        customers[index]=cust;

        return true;
    }

    //删除指定位置的客户，删除成功返回true,删除失败返回false
    public boolean deleteCustomer(int index){
        if(index<0||index>=total){
            return false;
        }
        for(int i=index;i<total-1;i++){
            customers[i]=customers[i+1];
        }
        customers[--total]=null;
        return true;
    }

    //获取用户数组
    public Customer[] getAllCustomers(){
        Customer[] custs=new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i]=customers[i];
        }
        return custs;
    }

    //获取指定位置的客户信息，如果当前位置找不到，返回null
    public Customer getCustomer(int index){
        if(index<0||index>=total){
            return null;
        }
        return customers[index];
    }

    //获取客户数量
    public int getTotal(){
        return total;
    }

}
