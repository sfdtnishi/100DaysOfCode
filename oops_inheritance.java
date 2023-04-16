class Shape{
    String color;
}

class Triangle extends Shape{
    void area(int b, int h){
        System.out.println(0.5*b*h);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Triangle t1 = new Triangle();
        t1.color="blue";

        System.out.println(t1.color);
    }
}
