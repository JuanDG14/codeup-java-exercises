import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your favorite number?");
        int num = scanner.nextInt();
        System.out.printf("Your number: %d%n", num);

        System.out.println("Please enter 3 words");
        String fWord = scanner.next();
        String sWord = scanner.next();
        String tWord = scanner.next();
        System.out.printf("%s\n%s\n%s\n", fWord, sWord, tWord);

        System.out.println("Please enter a sentence");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.printf("You put: %s%n", sentence);

        System.out.println("Please enter the length, width, and height of the class?");
        String lengthWidth = scanner.nextLine();
        String[] stringArray = lengthWidth.split(" ",3);
        double length = Double.parseDouble(stringArray[0]);
        double width = Double.parseDouble(stringArray[1]);
        double height = Double.parseDouble(stringArray[2]);
        System.out.println("the value of the perimeter is: " + ((length * 2) +(width *2)) + "\nthe value of the area is: " + (length * width) + "\nthe value of the volume is: " + (length * width * height));
    }
}
