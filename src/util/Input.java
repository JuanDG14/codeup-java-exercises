package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Input a sentence");
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        return userInput;
    }

    public boolean yesNo(){
        System.out.println("Enter Yes or No");
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("ya")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt (int min, int max){
        System.out.printf("Please enter a number between %d and %d%n", min, max);
        while(true){
            int userInput1 = this.scanner.nextInt();
            if (userInput1 > min && userInput1 < max){
                return userInput1;
            }
            System.out.println("Please enter a number in the given range");
        }
    }

    public int getInt(){
        System.out.println("Please enter a number");
        int userInput2 = scanner.nextInt();
        System.out.println(userInput2);
        return userInput2;
    }

    public double getDouble(double min, double max) {
        System.out.printf(String.format("Enter a number between %,.2f and %,.2f with 2 decimal points%n", min, max));
        while (true) {
            double userInput3 = this.scanner.nextDouble();
            if (userInput3 > min && userInput3 < max) {
                return userInput3;
            }
            System.out.println("Please enter a number in the given range");
        }
    }

    public double getDouble() {
        System.out.println("Enter a number with 2 decimal points");
        double userInput4 = scanner.nextDouble();
        System.out.println(userInput4);
        return userInput4;
    }

}
