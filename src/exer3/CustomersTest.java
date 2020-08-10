package exer3;

import sun.misc.JavaNetAccess;

/**
 * @author: sqm
 * @date: 2020/8/10 16:49
 * @description:
 */
public class CustomersTest {
    public static void main(String[] args) {
        Customers cust = new Customers("Jane","Smith");
        Account acct = new Account(1000,2000,0.0123);
        cust.setAccount(acct);

        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);




    }
}