package CIE;

public class Student {
    public String usn;
    public String name;
    public int sem;

    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }
}

public class Internals {
    public int[] internalMarks = new int[5];

    public Internals(int[] marks) {
        if (marks.length == 5) {
            System.arraycopy(marks, 0, internalMarks, 0, 5);
        } else {
            throw new IllegalArgumentException("Exactly 5 marks are required for internal marks.");
        }
    }
}

// Package SEE: Contains External class
package SEE;

import CIE.Student;

public class External extends Student {
    public int[] externalMarks = new int[5];

    public External(String usn, String name, int sem, int[] marks) {
        super(usn, name, sem);
        if (marks.length == 5) {
            System.arraycopy(marks, 0, externalMarks, 0, 5);
        } else {
            throw new IllegalArgumentException("Exactly 5 marks are required for SEE marks.");
        }
    }
}

// Main Program: Computes final marks
import CIE.*;
import SEE.*;
import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        External[] students = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Enter USN: ");
            String usn = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Semester: ");
            int sem = scanner.nextInt();

            System.out.println("Enter Internal Marks (5 courses):");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = scanner.nextInt();
            }

            System.out.println("Enter SEE Marks (5 courses):");
            int[] externalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                externalMarks[j] = scanner.nextInt();
            }
            scanner.nextLine();

            Internals internals = new Internals(internalMarks);
            students[i] = new External(usn, name, sem, externalMarks);

            System.out.println("\nCalculating final marks for student...");
        }

        System.out.println("\nFinal Marks for all students:");
        for (External student : students) {
            System.out.println("\nUSN: " + student.usn);
            System.out.println("Name: " + student.name);
            System.out.println("Semester: " + student.sem);
            System.out.println("Final Marks:");
            for (int j = 0; j < 5; j++) {
                int finalMark = (student.externalMarks[j] / 2) + student.internalMarks[j];
                System.out.println("Course " + (j + 1) + ": " + finalMark);
            }
        }

        scanner.close();
    }
}
