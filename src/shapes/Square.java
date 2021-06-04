package shapes;

public class Square extends Rectangle {

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }


    public double getArea(){
        System.out.println("this is getting overwritten");
        return (side * side);
    }

    public double getPerimeter(){
        System.out.println("this is getting overwritten");
        return (4 * side);
    }
}
