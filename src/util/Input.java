package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Input a sentence");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter Yes or No");
        String userResponse = this.scanner.next();
        if (userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("ya")){
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userResponse = this.scanner.next();
        if (userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("ya")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt (int min, int max) {
        System.out.printf("Please enter a number between %d and %d%n", min, max);
        int userInput = this.scanner.nextInt();
        if (userInput > min && userInput < max) {
            return userInput;
        } else {
            System.out.println("Please enter a number in the given range");
            return getInt(min, max);
        }

    }

    public int getInt(){
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf(String.format("Enter a number between %f and %f%n", min, max));
            double userInput3 = this.scanner.nextDouble();
            if (userInput3 > min && userInput3 < max) {
                return userInput3;
            } else {
                System.out.println("Please enter a number in the given range");
                return getDouble(min, max);
        }
    }

    public double getDouble() {

        return this.scanner.nextDouble();
    }

}
