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
        do {
            userInput = scanner.nextInt();
            if(userInput < min || userInput > max) {
                System.out.println("Wrong number, please try again");
            } else {
                System.out.println("Thank you, come again");
            }
        } while (userInput < min || userInput > max);
        return userInput;
    }

    public static long getFactorial() {
        Scanner in = new Scanner(System.in);
        int num, i, fact = 1;
        System.out.println("Give me a number between 1 and 10");
        num = in.nextInt();
        String userResponse = "";
        do {


            if (num < 0 || num > 10) {
                System.out.println("This number is not applicable to what we asked");
                return num;
            } else {
                for (i = 1; i <= num; i++)
                    fact = fact * i;
                System.out.println("Factorial of " + num + " is = " + fact);
                return num;
            }
            System.out.println("Would like to continue?\nIf so enter yes or no to stop.");
            userResponse = Scanner.next();
            System.out.println(userResponse);
        }while (userResponse.equals("yes"));
    }



    public static void main(String[] args) {
//        System.out.println(Addition(300, 5));
//        System.out.println(Subtraction(245, 50));
//        System.out.println(Multiplication(30, 0));
//        System.out.println(Division(90, 10));
//        System.out.println(Remainder(98, 5));
//        System.out.println(Multiply(10, 10));
//        System.out.println(getInteger(1, 10));
        System.out.println(getFactorial());
    }
}
