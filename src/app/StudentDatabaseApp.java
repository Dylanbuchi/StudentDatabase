package app;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter how many students will enroll courses: ");
        int n = in.nextInt();

        Student[] students = new Student[n];
        for (n = 0; n < students.length; n++) {
            students[n] = new Student();

            System.out.println(students[n]);

        }

    }
}