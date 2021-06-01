package OopLecture;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class UserTools {
    public static Scanner scanner = new Scanner(System.in);


    public static void login(@NotNull User u) {
        System.out.println("Please enter your password: ");

        String userPassword = scanner.nextLine();

        if(userPassword.equals(u.getPassword())){
            System.out.println("You have successfully loged in!");
        } else {
            System.out.println("That password is incorrect");
        }

    }

    public static void logOut(User u){
        System.out.println("Are you sure you want to log out? (Y/N)");

        String userChoice = scanner.nextLine();

        if(userChoice.equalsIgnoreCase("Y")) {
            System.out.println("You have successfully logged out!");
        } else {
            System.out.println("We will keep you logged in.");
        }
    }

    public static void changePassword(User u) {
        if(!u.isLoggedIn()) {
            System.out.println("Sorry, you are currently logged out. Please log in.");
            login(u);
        } else {
            System.out.println("Please enter your current password: ");
            String currentPassword = scanner.nextLine();
            if(u.getPassword().equals(currentPassword)) {
                System.out.println("Please enter a new password: ");
                String newPassword = scanner.nextLine();
                u.setPassword(newPassword);
                System.out.println("Congratulations, your password is now " + newPassword);
            } else {
                System.out.println("Sorry, that password is incorrect.");
            }
        }
    }

    public static void main(String[] args) {
        User testuser = new User();
        testuser.id = 1;
        testuser.username = "jayman";
        testuser.setPassword("password");
        testuser.email = "jayman@email.com";
        login(testuser);

        System.out.println("Password: " + testuser.getPassword());

        UserTools.login(testuser);
        changePassword(testuser);

    }
}
