import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

// question 1
//        int i = 5;
//        while(i < 15) {
//            i++;
//            System.out.println(i);
//        }

//        int i =0;
//        do{
//            i+=2;
//            System.out.println(i);
//        }
//        while (i < 100);
//        for(int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

//        do {
//            i-=5;
//            System.out.println(i);
//        }
//        while (i > -10);
//        for(int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);
//        for(long i = 2; i <= 1000000; i*=i) {
//            System.out.println(i);
//        }

// question 2
        Scanner scanner = new Scanner(System.in);
//        final int PIN = 12345;
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Please enter pin:");
//            int userInputPin = scanner.nextInt();
//            if (userInputPin != PIN) {
//                System.out.println("Incorrect, try again.");
//            } else if (userInputPin == PIN) {
//                System.out.println("Correct, welcome back.");
//                break;
//            } else if (i == 3 && userInputPin != PIN) {
//                System.out.println("Sorry but you have been locked out");
//            }
//        }
// question 3

//        int userInt = 0;
//        do {
//
//
//            System.out.print("What number would you like see on the table? (-1 cancels ends the loop)");
//            userInt = scanner.nextInt();
//            System.out.println("");
//
//            if(userInt == -1) {
//                System.out.println("thank you come again!");
//            } else {
//                System.out.println("Here is your table!");
//                System.out.println("");
//                System.out.println("number | squared | cubed");
//                System.out.println("------ | ------- | -----");
//                for (int i = 1; i <= userInt; i++) {
//                    System.out.println(i + "\t   | " + (i * i) + "\t     |" + "  " + (i * i * i));
//                }
//            }
//        }
//        while (userInt != -1);


// question 4

        String userResponse = "";

        do {
            System.out.println("Please enter a grade");
            int userInputGrade = scanner.nextInt();
            if (userInputGrade >= 88) {
                System.out.println("The grade you entered is: A");
            } else if (userInputGrade >= 80 && userInputGrade <= 87) {
                System.out.println("The grade you entered is: B");
            } else if (userInputGrade >= 67 && userInputGrade <= 79) {
                System.out.println("The grade you entered is: C");
            } else if (userInputGrade >= 60 && userInputGrade <= 66) {
                System.out.println("The grade you entered is: D");
            } else if (userInputGrade >= 0 && userInputGrade <= 59) {
                System.out.println("The grade you entered is: F");
            }
            System.out.println("Would like to continue?\nIf so enter yes or no to stop.");
            userResponse = scanner.next();
            System.out.println(userResponse);
        } while (userResponse.equals("yes"));


    }
}
