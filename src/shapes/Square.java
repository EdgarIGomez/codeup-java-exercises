package shapes;

public class Square extends Quadrilateral implements Measurable{

    public Square(int sides) {
        super(sides, sides);
    }

    public double getPerimeter() {
        return (4 * length);
    }

    public double getArea() {
        return length * width;
    }

    public int setLength(int length) {
        this.length = length;
        this.width = length;
        return this.length;
    }

    public int setWidth(int width) {
        this.width = width;
        this.length = width;
        return this.width;
    }


//    public Square(int sides){
//        super(sides, sides);
//    }

//    public int getPerimeter(){
//        System.out.println("Perimeter of a Square");
//        return 4 * this.width;
//    }
//
//    public double getArea(){
//        System.out.println("Area of a Square");
//        return Math.pow(this.length, 2);
//    }
}
