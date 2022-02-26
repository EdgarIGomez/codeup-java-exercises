package shapes;

public class Rectangle {

    protected int length;

    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getPerimeter(){
        System.out.println("Perimeter of a Rectangle");
        return (this.length * 2) + (this.width * 2);
    }

    public double getArea(){
        System.out.println("Area of a Rectangle");
        return this.length * this.width;
    }
}
