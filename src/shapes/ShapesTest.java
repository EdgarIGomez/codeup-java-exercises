package shapes;

public class ShapesTest {
    public static void main(String[] args) {

//        System.out.println("Rectangle");
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println();
//
//        System.out.println("Square");
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());
        //Added some system.outs to see which one was being called for each box.

        Measurable myShape;

        myShape = new Rectangle(4, 2);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        myShape = new Square(4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
//        System.out.println(myShape.getLength());

    //9. Rectangle fails to compile if we leave off the get parameter because it is an abstract method from the Measurable
    //interface so it needs to be completed in any class that uses it.
    //10. Since myShape is made with the Measurable interface it can't use methods that were created outside of it even if
    //the class that is used to create the object has the method
    }
}
