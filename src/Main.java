public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1 ---");
        Circle_EX1 circle1=new Circle_EX1(10,"red");
        System.out.println(circle1.toString());
        System.out.println("area="+circle1.getArea());

        Cylinder_EX1 cylinder=new Cylinder_EX1(10,"blue",15);
        System.out.println(cylinder.toString());
        System.out.println("Area="+cylinder.getArea());
        System.out.println("volume="+cylinder.getVolume());

        System.out.println("Exercise 2 ---");
       // Test constructor and toString()
        Account_Ex2 a1 = new Account_Ex2("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account_Ex2 a2 = new Account_Ex2("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);

        System.out.println("Exercise 3 ---");
        Circle_EX3 circle3=new Circle_EX3(15);
        System.out.println(circle3.toString());
        System.out.println("perimeter="+circle3.getPerimeter());
        System.out.println("Area="+circle3.getArea());
        ResizableCircle_EX3 r= new ResizableCircle_EX3(10);
        r.resize(10);
        System.out.println(r.toString());

        System.out.println("Exercise 4 ---");
        MovablePoint_EX4 mp=new MovablePoint_EX4(10,3,11,4);
        System.out.println(mp.toString());

        MovableCircle_EX4 mc=new MovableCircle_EX4(5,4,1,2,15);
        System.out.println(mc.toString());

        System.out.println("Exercise 5 ---");
        Customer_EX5 cus5=new Customer_EX5(144,"Haya",'f');
        Account_EX5 ac5=new Account_EX5(144,cus5,15.122121 );
        System.out.println(ac5.toString());
        Account_EX5 acc=ac5.withdraw(10);
        System.out.println(acc.toString());
        Account_EX5 acc2=ac5.deposit(10);
        System.out.println(acc2.toString());
        Customer_EX6 cus6=new Customer_EX6(123,"Haya",10);
        System.out.println(cus6.toString());
        System.out.println("Exercise 6 ---");
        Invoice_EX6 invoice=new Invoice_EX6(124,cus6,100);
        System.out.println(invoice.toString());
        System.out.println("Amount after discount= "+ invoice.getAmountAfterDiscount());

        System.out.println("Exercise 7 ---");
        Rectangle_EX7 rectangle =new Rectangle_EX7(10,10,"Red",true) ;
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square_EX7 square=new Square_EX7(11,"blue",false);
        System.out.println(square.toString());
        System.out.println(square.getArea());

        Circle_EX7 circle7=new Circle_EX7("yellow",false,15);
        circle7.setRadius(5);

        System.out.println(circle7.toString());
        System.out.println(circle7.getArea());
        System.out.println(circle7.getPerimeter());

    }
}
