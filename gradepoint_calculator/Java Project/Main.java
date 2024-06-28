package rough;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your marks for CT1, CT2, CT3, CT4, Assignment, Mid term, Term final, and Attendance:");

        Scanner sc = new Scanner(System.in);
        int sum = 0, marks = 0;
        int numberOfMarks = 8; // Total number of marks to be entered

        // Loop to collect marks input
        for (int i = 0; i < numberOfMarks; i++) {
            while (true) {
                try {
                    marks = sc.nextInt();
                    sum += marks;
                    break; // Exit the loop if the input is valid
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer:");
                    sc.next(); // Clear the invalid input
                }
            }
        }

        sc.close(); // Close the scanner to avoid resource leak

        double gradePoint = 0;
        if (sum >= 80) {
            gradePoint = 4.00;
        } else if (sum >= 75) {
            gradePoint = 3.75;
        } else if (sum >= 70) {
            gradePoint = 3.50;
        } else if (sum >= 65) {
            gradePoint = 3.20;
        } else if (sum >= 60) {
            gradePoint = 3.00;
        } else if (sum >= 55) {
            gradePoint = 2.75;
        } else if (sum >= 50) {
            gradePoint = 2.50;
        } else if (sum >= 45) {
            gradePoint = 2.25;
        } else if (sum >= 40) {
            gradePoint = 2.00;
        }

        System.out.println("Your Grade Point is: " + gradePoint);
    }
}

