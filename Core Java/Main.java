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

        // Conditional Statement
        // If statement
        int xIf = 8;
        if (xIf > 10) {
            System.out.println("x is greater than 10");
        }

        // If-Else statement
        int yIfElse = 5;
        if (yIfElse % 2 == 0) {
            System.out.println("y is even");
        } else {
            System.out.println("y is odd");     
        }

        // if-else-if ladder
        int score = 85;
        if (score >= 90) {      
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Nested If statement
        int zNestedIf = 15;
        if (zNestedIf > 10) {       
            if (zNestedIf < 20) {
                System.out.println("z is between 10 and 20");
            }
        }

        // Ternary Operator
        int aTernary = 12;
        String resultTernary = (aTernary % 2 == 0) ? "a is even" : "a is odd";
        System.out.println(resultTernary);

        // Switch Statement
        int day = 3;
        switch (day) {      
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Loops
        // For Loop
        for (int i = 1; i <= 5; i++) {      
            System.out.println("For Loop iteration: " + i);
        }       

        // Multiple Initialization and Update in For Loop
        for (int i = 1, j = 5; i <= 5 && j >= 1; i++, j--) {      
            System.out.println("i: " +      i + ", j: " + j);   
        }   

        // Ways to write For Loop
        // 1. Standard For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Standard For Loop iteration: " + i);
        }       

        // 2. Enhanced For Loop (For-Each Loop)
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {   
            System.out.println("Enhanced For Loop number: " + num);     
        }

        // While Loop
        int j = 1;
        while (j <= 5) {    
            System.out.println("While Loop iteration: " + j);
            j++;
        }

        // Do-While Loop
        int k = 1;
        do {      
            System.out.println("Do-While Loop iteration: " + k);
            k++;
        } while (k <= 5);

        // Class and Object
        // Syntax:
        // ClassName objectName = new ClassName();
        Calculator calc = new Calculator();

        int sum = calc.add(10, 20);
        System.out.println("Sum from Calculator class: " + sum);

        // Creating Object of Computer class
        Computer myComputer = new Computer();

        myComputer.playMusic();

        String pen = myComputer.getMeAPen();
        System.out.println(pen);

        // Method Overloading
        int sumTwo = calc.add(5, 10);
        int sumThree = calc.add(5, 10, 15);

        System.out.println("Sum of two numbers: " + sumTwo);       // Output: 15
        System.out.println("Sum of three numbers: " + sumThree);   // Output: 30

        // Reference variable
        Calculator calc2 = new Calculator(); // calc2 is a reference variable pointing to a Calculator object
        // calc2 will refer to the new Calculator object created in heap memory
        // Stack will store the address of the object created in heap memory

        // Arrays
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);     
        }

        // Dynamic Array Creation
        int nums[] = new int[5]; // Declaration and instantiation {0,0,0,0,0}
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        System.out.println("Nums array elements:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]); 
        }

        // Multi-dimensional Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int f = 0; f < matrix[i].length; f++) {
                System.out.print(matrix[i][f] + " ");
            }
            System.out.println();
        }

        int numsMulti[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int f = 0; f < 3; f++) {
                numsMulti[i][f] = i + f;
            }
        }

        System.out.println("NumsMulti elements:");
        for (int i = 0; i < numsMulti.length; i++) {
            for (int f = 0; f < numsMulti[i].length; f++) {
                System.out.print(numsMulti[i][f] + " ");    

            }
            System.out.println();
        }   
    }
}

// Object Oriented Programming:

// Object - Properties and Behaviors
// - Each object has its own state and behaviors.
// - Example: Dog object
//   - Properties: breed, color, age
//   - Behaviors: bark(), fetch()   

// To create object, we need a Class first (Object are created by JVM)

class Calculator {
    // Properties or instance variables
    int num1;
    int num2;

    // Methods here a and b are local variables
    // Note: Every method will have its own stack memory
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method for double parameters
    public double add(double a, double b) {
        return a + b;
    }   

    // Note: Method Overloading - Same method name with different parameters
    // We can have different number of parameters or different types of parameters
    // We call this method overloading, we have method with same name but different signatures
}

class Computer {

    // Methods
    public void playMusic() {
        System.out.println("Playing music...");
    }

    public String getMeAPen() {
        return "Here is a pen.";
    }
}

