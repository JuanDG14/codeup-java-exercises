package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer>grades;

    public Student(String studentName){
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.studentName = studentName;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        int total = 0;
        for (Integer grade : grades) {
            total = total + grade;
        }
        int average = total / this.grades.size();

        return average;
    }

    public static void main(String[] args) {
        Student student = new Student("Juan");
        System.out.println(student.getName());
        student.addGrade(74);
        student.addGrade(80);
        student.addGrade(90);
        student.addGrade(85);
        student.addGrade(96);
        System.out.println("The average grade for this student is: " + student.getGradeAverage());

    }

}
