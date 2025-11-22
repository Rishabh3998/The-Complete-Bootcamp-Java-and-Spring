// To run this code, first compile the code using:
// - javac {path}Main.java or make the current dir as the path in which the file is present, then write javac Main.java

// Then run the compiled code using:
// - java {Path}Main or make the current dir as the path in which the file is present, then write java Main {class name}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        // Creating Variables 
        int num1 = 10; // (Store integer values)
        int num2 = 20; // (Store integer values)
        int result = num1 + num2; // Addition of two integers

        System.out.println(result);

        // Data-types in Java
        byte age = 25;
        float marksFloat = 6.5F;
        long largeNumber = 123456789L;
        double marksDouble = 8.75;
        char grade = 'A';
        boolean isPassed = true;

        System.out.println("Age: " + age);
        System.out.println("Marks (float): " + marksFloat);
        System.out.println("Marks (double): " + marksDouble);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);
        System.out.println("Large Number: " + largeNumber);
    }
}