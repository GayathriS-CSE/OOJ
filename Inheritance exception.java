import java.util.Scanner;


class WrongAge extends Exception {
    public WrongAge() {
        super("Age cannot be negative.");
    }
}

class InvalidAgeDifference extends Exception {
    public InvalidAgeDifference() {
        super("Son's age cannot be greater than or equal to Father's age.");
    }
}

class Father {
    int age;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge();
        }
        this.age = age;
    }
}

class Son extends Father {
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge, InvalidAgeDifference {
        super(fatherAge); 
        if (sonAge < 0) {
            throw new WrongAge(); 
        }
        if (sonAge >= fatherAge) {
            throw new InvalidAgeDifference();
        }
        this.sonAge = sonAge;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Father's age: ");
            int fatherAge = scanner.nextInt();

            System.out.print("Enter Son's age: ");
            int sonAge = scanner.nextInt();

            Son son = new Son(fatherAge, sonAge);

            System.out.println("Father's age: " + son.age);
            System.out.println("Son's age: " + son.sonAge);

        } catch (WrongAge | InvalidAgeDifference e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
