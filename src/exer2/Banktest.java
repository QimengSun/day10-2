package exer2;

/**
 * @author: sqm
 * @date: 2020/8/10 17:24
 * @description:
 */
public class Banktest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Jane","Smith");

        bank.getCustomer(0).setAccount(new Account(2000));

        bank.getCustomer(0).getAccount().withdraw(500);

        double balance = bank.getCustomer(0).getAccount().getBalance();

        System.out.println(balance);

        System.out.println("**************************");

        bank.addCustomer("万里","杨");

        System.out.println("客户有 " + bank.getNumberOfCustomers() +"个");
    }

}
