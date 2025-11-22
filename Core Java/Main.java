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

        int binaryNum = 0b1010; // Binary literal for 10
        int hexNum = 0x1A;    // Hexadecimal literal for 26
        int formatNum = 1_000_000; // Using underscores for better readability
        double scientificNum = 12e10; // Scientific notation for 1.2E11

        System.out.println("Binary Number: " + binaryNum);
        System.out.println("Hexadecimal Number: " + hexNum);
        System.out.println("Formatted Number: " + formatNum);
        System.out.println("Scientific Notation Number: " + scientificNum);
    }
}