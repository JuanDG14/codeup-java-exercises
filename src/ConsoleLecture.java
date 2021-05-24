import java.util.Scanner;

public class ConsoleLecture {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        // %s gets replaced by the string value name
        String name = "Juan";
        System.out.printf("Hello, %s%n", name);

        System.out.format("%d is %s's favorite number\nThis is a %b statement%n", 14, name, true);
        System.out.println("I'm a new line lol");

        System.out.println("Hello, " + name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey friend-o, how's it going?");
        String userInput = scanner.nextLine();
        System.out.printf("You're feeling: %s%n", userInput);

        System.out.println("Whats your favorite number?");
        int num = scanner.nextInt();

        System.out.printf("Your number: %d%n", num);
    }
}
