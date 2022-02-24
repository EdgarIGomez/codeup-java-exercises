package shapes;

import util.Input;
public class Circle {

    private double radius;

    public static int numberOfCircles = 0;

    public Circle(double radius){
        numberOfCircles++;
        this.radius = radius;
        System.out.println(getArea());
        System.out.println(getCircumference());
        Boolean response = Input.yesNo("Would you like to make another circle");
        if(response){
            double newRadius = Input.getDouble("Input a new radius for the new circle.");
             Circle circle = new Circle(newRadius);
        }else{
            System.out.printf("You made %s circles this time.%n", numberOfCircles);
        }
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}
