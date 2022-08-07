public class Invoice_EX6 {

    private int id;
    private Customer_EX6 customer;
    private double amount;

    public Invoice_EX6(int id, Customer_EX6 customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer_EX6 getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer_EX6 customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerID(){
        return customer.getId();
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public int getCustomerDiscount(){
        return this.customer.getDiscount();
    }
    public double getAmountAfterDiscount(){

        return amount-(amount*getCustomerDiscount())/100;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + customer.toString() +
                ", amount=" + amount +
                '}';
    }
}
