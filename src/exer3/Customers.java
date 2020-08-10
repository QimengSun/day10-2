package exer3;

/**
 * @author: sqm
 * @date: 2020/8/10 16:47
 * @description:
 */
public class Customers {
    private String firstName;
    private String lastName;
    private Account account;

    public Customers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}



