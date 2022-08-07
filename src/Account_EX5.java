import java.text.DecimalFormat;

public class Account_EX5 {

    private int id;
    private Customer_EX5 customer;
    private double balance=0.0;

    public Account_EX5(int id, Customer_EX5 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account_EX5(int id, Customer_EX5 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer_EX5 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return  customer.getName() +
                "(" + customer.getID() +
                ") balance="+df.format(balance);
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account_EX5 deposit(double amount){
        double balance=this.balance+amount;
        Account_EX5 account=new Account_EX5(this.id,this.customer,balance);
        return account;
    }

    public Account_EX5 withdraw(double amount){
        Account_EX5 account=new Account_EX5(this.id,this.customer,this.balance);
        if (amount<=this.balance){
            double balance=this.balance-amount;
            account=new Account_EX5(this.id,this.customer,balance);
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return account;
    }
}
