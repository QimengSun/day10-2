package exer2;

/**
 * @author: sqm
 * @date: 2020/8/10 17:03
 * @description:
 */
public class Account {
    private double balance;

    public Account(double int_balance) {
        this.balance = int_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amt) {//存钱
        if (amt > 0) {
            balance += amt;
            System.out.println("成功存入" + amt + "元");
            return;
        }
        System.out.println("异常，存款失败");
    }

    public void withdraw (double amt){//取钱
        if (balance < amt) {
            System.out.println("余额不足，取款失败");
            return ;
        }
        balance -= amt;
        System.out.println("成功取出" + amt + "元");

    }


}
