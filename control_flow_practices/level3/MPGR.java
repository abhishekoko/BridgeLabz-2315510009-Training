package ControlFlowPractices.Level3;

import java.util.Scanner;

public class MPGR {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        double phy = sc.nextDouble();
        System.out.print("Enter marks in Chemistry: ");
        double chem = sc.nextDouble();
        System.out.print("Enter marks in Maths: ");
        double maths = sc.nextDouble();

        double avg = (phy + chem + maths) / 3;

        String grade, remarks;

        if (avg >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (avg >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (avg >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (avg >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (avg >= 40) {
            grade = "E";
            remarks = "Level 1-, too low below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.printf("Average Marks: %.2f\nGrade: %s\nRemarks: %s\n", avg, grade, remarks);
        sc.close();
    }
}
