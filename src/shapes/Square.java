package shapes;

public class Square extends Rectangle{

    public Square(int sides){
        super(sides, sides);
    }

    public int getPerimeter(){
        System.out.println("Perimeter of a Square");
        return 4 * this.width;
    }

    public double getArea(){
        System.out.println("Area of a Square");
        return Math.pow(this.length, 2);
    }
}
