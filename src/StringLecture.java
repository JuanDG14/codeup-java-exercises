import java.util.Scanner;

public class StringLecture {
    public static void main(String[] args) {
        char character = 'd';
        System.out.println(character == 'd');

        Scanner scanner = new Scanner(System.in);
        String bob = "Uncle Bob";
        System.out.println("Hey Juan, who is your favorite surviving uncle?");
        String maybeBob = scanner.nextLine();
        System.out.println("User answered with correct answer AND capitalization: " + bob.equals(maybeBob));
        System.out.println("User answered with correct answer: " + bob.equalsIgnoreCase(maybeBob));

        // Compare the start and end of Strings
        String david = "David";
        String dad = "Dad";
        System.out.println("David and Dad start with the same letter?" + dad.startsWith(david));
    }
}
