package grades;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
//        ArrayList<Integer> JuanGrades = new ArrayList<>();
        Student Juan = new Student("Juan");
        Juan.addGrade(90);
        Juan.addGrade(87);
        Juan.addGrade(95);
        students.put("jperez4432", Juan);

        Student Diego = new Student("Diego");
//        ArrayList<Integer> DiegoGrades = new ArrayList<>();
        Diego.addGrade(75);
        Diego.addGrade(86);
        Diego.addGrade(93);
        students.put("JuanDG14", Diego);

        Student Luke = new Student("Luke");
//        ArrayList<Integer> LukeGrades = new ArrayList<>();
        Luke.addGrade(97);
        Luke.addGrade(85);
        Luke.addGrade(79);
        students.put("lukepetercurran", Luke);

        Student Joseph = new Student("Joseph");
//        ArrayList<Integer> JospehGrades = new ArrayList<>();
        Joseph.addGrade(97);
        Joseph.addGrade(79);
        Joseph.addGrade(85);
        students.put("JosephRHopkins88", Joseph);

        System.out.println("Hello, and welcome");
        System.out.println("These are the GitHub usernames of our students");
        for (String username : students.keySet()){
            System.out.print("|" + username + "| ");
        }
//        System.out.println(students.keySet());

        boolean confirm = true;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("\nPlease type a username to view a student's information: ");
            String username = scanner.nextLine();
            if (!students.containsKey(username)) {
                System.out.println("Invalid username. Please try again");
            }
            if (students.containsKey(username)) {
                Student searchResult = students.get(username);
                System.out.println("Student's Name: " + searchResult.getName() + " - " + "Github Username: " + username + " \nAverage Grade: " + searchResult.getGradeAverage() + "\n");
                System.out.println("Would you like to see all the grades for this student? yes/no");
                String allGrades = scanner.nextLine();
                if (allGrades.equalsIgnoreCase("yes")){
                    System.out.println("Grades\n" + students.get(username).getGrades());
                }

                System.out.println("Would you like to select another student? yes/no");
                String answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("yes")) {
                    System.out.println("Goodbye! and have a wonderful day!");
                    confirm = false;
                }
            }
        }
        while (confirm);


    }
}
