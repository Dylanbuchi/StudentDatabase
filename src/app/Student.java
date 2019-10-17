package app;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Student
 */
public class Student {
    // statics
    private static int uniqueID = 7580;
    private static int courseCost = 600;

    // variables
    private int balance;
    private int gradeYear;

    private String studentID;
    private String firstName;
    private String lastName;
    private String space;

    private ArrayList<String> courses;

    private Scanner in;

    /**
     * 
     */
    public Student() {

        // initiating
        this.in = new Scanner(System.in);
        this.space = " ";
        this.balance = 1500;
        this.courses = new ArrayList<String>();

        // Constructor, prompt user to enter student name and year.
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Junior\n2 - Senior\n3 - Expert\n Enter student grade level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        enrollCourse();

        // print info

    }

    // Generate ID
    private void setStudentID() {
        uniqueID++;
        this.studentID = "(" + gradeYear + ")" + uniqueID;

    };

    // Enroll in courses
    public void enrollCourse() {

        String input = "";

        // loop asking user courses to enroll
        while (!input.equals("q")) {

            System.out.println("Enter the course name to enroll: ");
            input = in.next().toLowerCase();

            // q to Q

            if (input.contains("java") || input.contains("python") || input.contains("flutter")) {

                courses.add(input);
                System.out.println(
                        "This course costs $600 and you have " + balance + "$ type yes to confirm or no to cancel");
                String response = in.next();
                if (response.equals("yes")) {
                    response.toLowerCase();
                    balance -= courseCost;
                    System.out.println("You enrolled " + input + " course " + "your balance now is: " + balance + " $");

                }

                else {
                    System.out.println("Bye");
                    break;
                }

            }

            System.out.println(courses.isEmpty() ? "No courses selected" : "Your courses: " + courses.toString());

        }
        System.out.println("See you soon");

    }

    @Override
    public String toString() {
        return "Hello" + firstName + space + lastName + space + studentID;
    }

}