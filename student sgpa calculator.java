import java.util.Scanner;

public class Student {
    String usn, name;
    int[] credits, marks;

    public Student(int numSubjects) {
        credits = new int[numSubjects];
        marks = new int[numSubjects];
    }

    public void acceptDetails(Scanner scanner) {
        System.out.print("Enter USN: ");
        usn = scanner.next();
        System.out.print("Enter Name: ");
        name = scanner.next();

        for (int i = 0; i < credits.length; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public void displayDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);

        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + ": Credits = " + credits[i] + ", Marks = " + marks[i]);
        }
    }
    
    
    public double calculateSGPA() {
        double totalCredits = 0, totalGradePoints = 0;

        for (int i = 0; i < credits.length; i++) {
            double gradePoint = marks[i] / 10;

            totalCredits += credits[i];
            totalGradePoints += gradePoint * credits[i];
        }

        return totalGradePoints / totalCredits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        Student student = new Student(numSubjects);
        student.acceptDetails(scanner);
        student.displayDetails();

        System.out.println("SGPA: " + student.calculateSGPA());
    }
}
