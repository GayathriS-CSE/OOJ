import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficient A:");
        double a = scanner.nextDouble();
        System.out.println("Enter coefficient B:");
        double b = scanner.nextDouble();
        System.out.println("Enter coefficient C:");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            if (discriminant == 0) {
                System.out.println("One real solution: " + root1);
            } else {
                System.out.println("Real solutions:");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            }
        } else {
            System.out.println("No real solutions.");
        }
        scanner.close();
    }
}
