public class Customer_EX5 {

    private int ID;
    private String name;
    private char gender;

    public Customer_EX5(int ID, String name,char gender) {
        this.ID = ID;
        this.name = name;
        this.gender=gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name +
                "(" + ID +
                ")";
    }

}
