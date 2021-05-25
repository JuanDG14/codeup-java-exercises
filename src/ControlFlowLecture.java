import java.util.Scanner;

public class ControlFlowLecture {
    public static void main(String[] args) {
//        int x = 5;
//
//        if(x == 5) {
//            System.out.println("if you are reading this then x is equaled to 5");
//        }
//        System.out.println("on the other hand , this says nothing about x, because it runs regardless of what x is");

//        int y = 2;
//        if (y == 2) {
//            System.out.println("ive carried out a conditional test and i can confirm the statement 'y == 2' is true");
//        } else {
//            System.out.println("i have tested to see if 'y == 2' is true, and it's not. its false");
//        }

//        short z = -5;
//        z = 12;
//        z = 32000;
//        // z =
//        if (z < 0){
//            System.out.println("the variable z contains a negative number value");
//        } else if (z >= 0 && z < 30000) {
//            System.out.println("the variable z contains a positive number value");
//        } else {
//            System.out.println("the variable z contains a numeric value that is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }

//        String customerChoice = "chocolate";
//
//        switch (customerChoice){
//            case "vanilla":
//                System.out.println("One vanilla comming up");
//                break;
//            case "chocolate":
//                System.out.println("One chocolate coming up");
//                break;
//            case "strawberry":
//                System.out.println("One strawberry coming up");
//                break;
//            default:
//                System.out.println("We dont have that at the moment, Sorry.");
//                break;
//        }

        // Logical Operators
        // you can do && or &, also || or |

//        // short circuit operator
//        int c = 0, d = 100, e = 50;
//
//        if (c == 1 && e++ < 100) {
//
//        }
//        System.out.println("e = " + e);
//
//        if (c == 0 && e++ < 100) {
//
//        }
//        System.out.println("e = " + e);
//
//        // non short circuit operator
//        if (c == 1 & e++ < 100) {
//
//        }
//        System.out.println("e = " + e);

//        boolean existence = true;
//        boolean solipsism = false;
//        boolean weAllLiveInSomeonesDream = false;
//        boolean thisDeskIsRealNotAProjectionOfMyMind = true;
//
//        if (thisDeskIsRealNotAProjectionOfMyMind | weAllLiveInSomeonesDream) {
//            System.out.println("common sense is victorious");
//        } else {
//            System.out.println("im really confused now");
//        }
//
//        if (solipsism | weAllLiveInSomeonesDream) {
//            System.out.println("common sense is victorious");
//        } else {
//            System.out.println("im really confused now");
//        }

//        boolean a, b;
//
//        Operation     Meaning                       Note
//                ---------     -------                       ----
//                a && b     logical AND                    short-circuiting
//        a || b     logical OR                     short-circuiting
//        a &  b     boolean logical AND            not short-circuiting
//        a |  b     boolean logical OR             not short-circuiting
//        a ^  b     boolean logical exclusive OR
//        !a          logical NOT
//
//        short-circuiting        (x != 0) && (1/x > 1)   SAFE
//        not short-circuiting    (x != 0) &  (1/x > 1)   NOT SAFE
        // Comparison Operator
        // there is no strict equality operator


//        // these are stored in a string pool
//        String myName = "juan";
//        String anotherName = "juan";
//        String juan = new String("juan");
//
//        System.out.println(myName == anotherName);
//        System.out.println(myName == juan);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("what is your name?");
//        String userInput = scanner.next();
//        if (userInput == myName){
//            System.out.println("hello, me!");
//        } else {
//            System.out.println("you are not me liar");
//        }

        // Loops
//        int i = 1;
//        while (i < 10){
//            System.out.println("now im in the loop. i has not incremented yet and its value " + i);
//            i++;
//            System.out.println("im still in the loop, but i has incremented now, and its value is " + i);
//        }

    }
}
