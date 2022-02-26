package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        System.out.println("Rectangle");
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
        System.out.println("box1.getArea() = " + box1.getArea());
        System.out.println();

        System.out.println("Square");
        Rectangle box2 = new Square(5);
        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
        System.out.println("box2.getArea() = " + box2.getArea());
        //Added some system.outs to see which one was being called for each box.

    }
}
