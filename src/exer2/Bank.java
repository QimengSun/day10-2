package exer2;

/**
 * @author: sqm
 * @date: 2020/8/10 17:04
 * @description:
 */
public class Bank {
    private Customer[] customers;// 存放多个客户
    private int numberOfCustomers;//记录客户人数

    public Bank() {

        customers = new Customer[10];
        //不写此处会报错
    }

    //添加客户
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);
//        customers[numberOfCustomers] =cust;
//        numberOfCustomers += 1;
        customers[numberOfCustomers++] =cust;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    //获取指定位置客户
    public Customer getCustomer(int index){
//       return customers[index];
        if (index >= 0 && index <= numberOfCustomers) {
            return customers[index];
        }

        return null;
    }
}
