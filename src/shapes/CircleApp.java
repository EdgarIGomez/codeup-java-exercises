package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        double radius = Input.getDouble("Input the radius for a circle.");
        Circle circle = new Circle(radius);
    }
}
