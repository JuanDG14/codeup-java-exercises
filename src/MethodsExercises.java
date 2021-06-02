import java.util.Scanner;

public class MethodsExercises {

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static int Division(int num1, int num2) {
        return num1 / num2;
    }
    public static int Remainder(int num1, int num2) {
        return num1 % num2;
    }

    public static int Multiply(int num1, int num2) {
            if(num1 == 0)
                return 0;
            return Multiply(num1 - 1, num2) + num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        System.out.print("Enter a number between 1 and 10: ");
        System.out.println("");
            userInput = scanner.nextInt();
            if(userInput < min || userInput > max) {
                System.out.println("Wrong number, please try again");
                return getInteger(min, max);
            } else {
                System.out.println("Thank you, come again");
                return userInput;
            }
    }

    public static void getFactorial(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: %n", min, max);
        long userInput2 = Long.parseLong(scanner.nextLine());
        System.out.printf("You entered %d. Do you wish to see the factorial? Yes/No%n", userInput2);
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("yes")) {
            System.out.printf("Your number was %d! %d x", userInput2, userInput2);
            for (long i = userInput2 - 1; i > 1; i--) {
                System.out.printf(" %d x", i);
                userInput2 *= i;
            }
            System.out.printf(" 1 = %d", userInput2);
        }
    }

    public static void diceGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nWe are rolling two dice today!%nHow many side on the first dice?%n");
        int userInput3 = scanner.nextInt();
        System.out.printf("%nHow many side on the second dice?%n");
        int userInput4 = scanner.nextInt();
        System.out.println("When you are ready please type \"roll\" to roll the dice.");
        String userDiceConfirm = scanner.next();
        if (userDiceConfirm.equalsIgnoreCase("roll")) {
            int diceRoll1 = (int) (Math.random() * userInput3 + 1);
            int diceRoll2 = (int) (Math.random() * userInput4 + 1);
            System.out.printf("You rolled %d and %d!", diceRoll1, diceRoll2);
            System.out.println(" Would you like to roll the dice again?");
            String userConfirm2ndRoll = scanner.next();
            if (userConfirm2ndRoll.equalsIgnoreCase("yes")) {
                diceGame();
            } else {
                System.out.println("Okay. Goodbye!");
            }
        } else {
            System.out.println("Okay. Goodbye!");
        }
    }



    public static void main(String[] args) {
//        System.out.println(Addition(300, 5));
//        System.out.println(Subtraction(245, 50));
//        System.out.println(Multiplication(30, 0));
//        System.out.println(Division(90, 10));
//        System.out.println(Remainder(98, 5));
//        System.out.println(Multiply(10, 10));
//        System.out.println(getInteger(1, 10));
//        getFactorial(1,10);
        diceGame();
    }
}
