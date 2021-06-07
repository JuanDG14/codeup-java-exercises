package shapes;
public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }
    public double getPerimeter() {
        return 4 * length;
    }

    public double getArea(){
        return length * length;
    }

    public double setLength(double side){
        return this.length = side;
    }

    public double setWidth(double side){
        return this.width = side;
    }

//    protected double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//
//    public double getArea(){
//        System.out.println("this is getting overwritten");
//        return (side * side);
//    }
//
//    public double getPerimeter(){
//        System.out.println("this is getting overwritten");
//        return (4 * side);
//    }
}
