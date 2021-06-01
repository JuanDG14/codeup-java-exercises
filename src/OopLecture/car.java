package OopLecture;

import java.util.Scanner;

public class car {
    public static Scanner scanner = new Scanner(System.in);
    public String model;
    public int year;
    public String color;
    public void run() {
        System.out.println("the car is running");
    }

    public static void main(String[] args) {
        car car1 = new car();
        System.out.println(car1);

        car1.color = "Black";
        car1.year = 2009;
        car1.model = "Dodge RAM";

        System.out.println(car1.color);

        car car2 = new car();

        car2.color = "Blue";
        car2.year = 2014;
        car2.model = "Mustang GT";

        System.out.println(car2.color);
    }
}
