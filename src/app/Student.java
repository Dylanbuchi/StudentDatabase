package app;

import java.util.Scanner;

/**
 * Student
 */
public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses;
    private int balance;
    private int studentID;
    private int courseCost = 600;
    private Scanner in;
    private String space;

    /**
     * 
     */
    public Student() {

        this.in = new Scanner(System.in);
        this.space = " ";

        // Constructor, prompt user to enter student name and year.
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Junior\n2 - Senio\n3 - Expert: Enter student grade level: ");
        this.gradeYear = in.nextInt();

        System.out.println(firstName + space + lastName + space + gradeYear);

    }

    // TODO 2 Generate ID

    // TODO 3 Enroll in courses

    // TODO 4 view Balance

    // TODO 5 Pay tuition

    // TODO 6 Show status

}