package shapes;

import util.Input;

public class ShapesTest {

    public static void main(String[] args) {
//        Input test = new Input();
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);
        System.out.println("The area of the rectangle is: " + box1.getArea());
        System.out.println("The perimeter of the rectangle is: " + box1.getPerimeter());

        System.out.println("The area of the rectangle is: " + box2.getArea());
        System.out.println("The perimeter of the rectangle is: " + box2.getPerimeter());



    }
}
