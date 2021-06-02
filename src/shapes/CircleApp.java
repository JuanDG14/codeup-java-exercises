package shapes;

import util.Input;

import java.text.DecimalFormat;

public class CircleApp {
    public static void main(String[] args) {
        Input test = new Input();
        Circle circle = new Circle(test.getDouble());
        DecimalFormat f = new DecimalFormat("0.00");
        System.out.println("The area of the circle is: " + f.format(circle.getArea()));
        System.out.println("The circumference of the circle is: " + f.format(circle.getCircumference()));
    }
}
