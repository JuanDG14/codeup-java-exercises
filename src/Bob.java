import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, my name is Bob... i heard you wanted to talk to me...");
        String response = "";
        while(!response.equalsIgnoreCase("Fine")) {
            System.out.println("What do you want?");
            response = scanner.nextLine();
            if (response.isEmpty()) {
                System.out.println("Fine, be that way!");
            } else if (response.endsWith("?")) {
                System.out.println("Sure");
            } else if (response.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever");
            }
        }
        System.out.println("I'm out of here!");
    }
}
