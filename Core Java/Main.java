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

        // Arithmetic Operations
        int number1 = 15;
        int number2 = 20;

        int resultantAdd  = number1 + number2;
        int resultantSub  = number2 - number1;
        int resultantMul  = number1 * number2;
        int resultantDiv  = number2 / number1; // Gives quotient
        int resultantMod  = number2 % number1; // Gives remainder

        System.out.println(resultantAdd); // Output: 35
        System.out.println(resultantSub); // Output: 5
        System.out.println(resultantMul); // Output: 300        
        System.out.println(resultantDiv); // Output: 1
        System.out.println(resultantMod); // Output: 5

        number1++; // Increment by 1
        number2--; // Decrement by 1
        System.out.println("After Increment, number1: " + number1); // Output: 16
        System.out.println("After Decrement, number2: " + number2); // Output: 19

        number1 += 5; // Equivalent to number1 = number1 + 5    
        number2 -= 3; // Equivalent to number2 = number2 - 3    
        System.out.println("After Adding 5, number1: " + number1); // Output: 21
        System.out.println("After Subtracting 3, number2: " + number2); // Output: 16

        number1 = number1 * 2; // Equivalent to number1 = number1 * 2    
        number2 = number2 / 4; // Equivalent to number2 = number2 / 4    
        System.out.println("After Multiplying by 2, number1: " + number1); // Output: 42
        System.out.println("After Dividing by 4, number2: " + number2); // Output: 4

        ++number1; // Pre-increment
        --number2; // Pre-decrement
        System.out.println("After Pre-Increment, number1: " + number1); // Output: 43
        System.out.println("After Pre-Decrement, number2: " + number2); // Output: 3     
        
        // Relational Operators
        int x = 6;
        int y = 5;

        boolean resultantRelation = x < y; // Output: false
        boolean resultantRelation2 = x > y; // Output: true
        boolean resultantRelation3 = x <= y; // Output: false
        boolean resultantRelation4 = x >= y; // Output: true
        boolean resultantRelation5 = x == y; // Output: false
        boolean resultantRelation6 = x != y; // Output: true    

        System.out.println(resultantRelation);
        System.out.println(resultantRelation2);
        System.out.println(resultantRelation3);     
        System.out.println(resultantRelation4);
        System.out.println(resultantRelation5);
        System.out.println(resultantRelation6); 

        // Logical Operators
        boolean a = true;
        boolean b = false;  

        boolean andResult = a && b; // Output: false
        boolean orResult = a || b;  // Output: true
        boolean notResult = !a;     // Output: false    
        
        System.out.println(andResult);
        System.out.println(orResult);
        System.out.println(notResult);  
    }
}