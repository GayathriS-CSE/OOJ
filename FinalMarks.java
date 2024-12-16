// CIE/Student.java
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
// CIE/Internals.java
package CIE;

public class Internals {
public int[] internalMarks = new int[5];

public Internals(int[] marks) {
for (int i = 0; i < 5; i++) {
 internalMarks[i] = marks[i];
        }
    }
}

// SEE/External.java
package SEE;
import CIE.Student;

public class External extends Student {
    public int[] seeMarks = new int[5];

    public External(String usn, String name, int sem, int[] marks) {
        super(usn, name, sem);
        for (int i = 0; i < 5; i++) {
            seeMarks[i] = marks[i];
        }
    }
}

// Main.java
import CIE.*;
import SEE.External;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

 System.out.print("Enter the number of students: ");
int n = sc.nextInt();

for (int i = 0; i < n; i++) {
sc.nextLine();  

 System.out.print("Enter USN: ");
 String usn = sc.nextLine();

System.out.print("Enter Name: ");
String name = sc.nextLine();

 System.out.print("Enter Semester: ");
int sem = sc.nextInt();

int[] internalMarks = new int[5];
System.out.println("Enter 5 internal marks:");
 for (int j = 0; j < 5; j++) {
internalMarks[j] = sc.nextInt();
}
sc.nextLine();
int[] seeMarks = new int[5];
System.out.println("Enter 5 SEE marks:");
for (int j = 0; j < 5; j++) {
seeMarks[j] = sc.nextInt();
            }
sc.nextLine();

Internals internal = new Internals(internalMarks);
External external = new External(usn, name, sem, seeMarks);

 System.out.println("\nFinal Marks for Student: " + name + " (USN: " + usn + ")");
for (int j = 0; j < 5; j++) {
int finalMark = internal.internalMarks[j] + (seeMarks[j] / 2);
 System.out.println("Course " + (j + 1) + ": " + finalMark);
}
System.out.println();
}
 sc.close();
    }
}
