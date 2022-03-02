package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(int length, int width) {
        super(length, width);
    }
//
//    protected int length;
//
//    protected int width;

//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }

//    public int getPerimeter(){
//        System.out.println("Perimeter of a Rectangle");
//        return (this.length * 2) + (this.width * 2);
//    }
//
//    public double getArea(){
//        System.out.println("Area of a Rectangle");
//        return this.length * this.width;
//    }

    public int setLength(int length){
        this.length = length;
        return this.length;
    }

    public int setWidth(int width){
        this.width = width;
        return this.width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea(){
        return length * width;
    }
}
