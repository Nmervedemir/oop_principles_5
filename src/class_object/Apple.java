package class_object;

public class Apple {
    //default constructir is provided by Java to create zero arg objects

    public Apple() {
        //Each time you created a new object,this block will be execute.

        System.out.println("This is the default constructor");


        //instance variable-fields-states-
    }
        public String color = "Red"; //Red
        public double price; // 0.0
        public String taste; // null

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
