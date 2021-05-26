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

        int userInt = 0;
        do {


            System.out.print("What number would you like see on the table? (-1 cancels ends the loop)");
            userInt = scanner.nextInt();
            System.out.println("");

            if(userInt == -1) {
                System.out.println("thank you come again!");
            } else {
                System.out.println("Here is your table!");
                System.out.println("");
                System.out.println("number | squared | cubed");
                System.out.println("------ | ------- | -----");
                for (int i = 1; i <= userInt; i++) {
                    System.out.println(i + "\t   | " + (i * i) + "\t     |" + "  " + (i * i * i));
                }
            }
        }
        while (userInt != -1);


// question 4


//        for (int i = 0; 1 <= 8; i++) {
//            System.out.println("Enter your grades (0 - 100) for this period.");
//            int gradeInput = scanner.nextInt();
//        }


    }
}
