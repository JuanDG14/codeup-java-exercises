package shapes;

public class ShapesTest {

    public static void main(String[] args) {
       Measurable myShape = new Rectangle(5, 4);
       Measurable myShape2 = new Square(5);
        System.out.println("The area of the rectangle is: " + myShape.getArea());
        System.out.println("The perimeter of the rectangle is: " + myShape.getPerimeter());

        System.out.println("The area of the rectangle is: " + myShape2.getArea());
        System.out.println("The perimeter of the rectangle is: " + myShape2.getPerimeter());


//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5);
//        System.out.println("The area of the rectangle is: " + box1.getArea());
//        System.out.println("The perimeter of the rectangle is: " + box1.getPerimeter());
//
//        System.out.println("The area of the rectangle is: " + box2.getArea());
//        System.out.println("The perimeter of the rectangle is: " + box2.getPerimeter());



    }
}
