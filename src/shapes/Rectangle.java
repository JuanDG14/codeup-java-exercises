package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea(){
        return length * width;
    }

    public double setLength(double length){
        return this.length = length;
    }

    public double setWidth(double width){
        return this.width = width;
    }
//    protected double length;
//
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
}
