//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.decodelabs.project2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      STUDENT GRADE CALCULATOR");
        System.out.println("====================================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {

            int mark;

            while (true) {

                System.out.print("Enter marks for Subject " + i + " (0-100): ");
                mark = sc.nextInt();

                if (mark >= 0 && mark <= 100) {
                    break;
                }

                System.out.println("Invalid marks! Enter between 0 and 100.");
            }

            totalMarks += mark;
        }

        double average = (double) totalMarks / subjects;

        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        String result = (average >= 40) ? "PASS" : "FAIL";

        System.out.println("\n====================================");
        System.out.println("         STUDENT REPORT");
        System.out.println("====================================");
        System.out.println("Student Name : " + name);
        System.out.println("Subjects     : " + subjects);
        System.out.println("Total Marks  : " + totalMarks);
        System.out.printf("Percentage   : %.2f%%\n", average);
        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + result);
        System.out.println("====================================");

        sc.close();
    }
}