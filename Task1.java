import java.util.scanner;

public class Task1 {
    public void main() {
        // Task 1: Calculate the area of a rectangle.
        int height = 7;
        int width = 5;
        int area = height * width;
        System.out.println(area);
        // Task 2: Output of the following code will be 5 and 7 post&pre increment.
        int x = 5;
        System.out.println(x++);
        System.out.println(++x);
        // Task 3: Find the remainder of a divided by b
        int a = 17;
        int b = 4;
        int result = a % b;
        System.out.println("The remainder of a divided by b: " + result);
        // Task 4: Check if a number is positive or negative using ternary operator.
        int num = -10;
        String checkNum = (num > 0) ? "Positive" : "Negative";
        System.out.println("Num is : " + checkNum);
        // Task 5: Check if two numbers are equal.
        int c = 5 ;
        int e = 8 ;
        System.out.println("The equality of the two numbers : " + (c==e)); 
        // Task 6: Check if age is between 18 and 30 using logical AND.
        int age = 25 ;
        System.out.println("Age is between 18 and 30 : " + (age >= 18 && age <= 30));
        // Task 7: Check if score is either above 90 or below 50 using logical OR.
        int score = 95 ;
        System.out.println("Score is between 50 and 90 : " + (score > 90 || score < 50));
        // Task 8: Reverse a boolean value using logical NOT.
        boolean isAvailable = true;
        System.out.println("Opposite of isAvailable: " + !isAvailable);
        // Task 9: Divide x by y and print Division and remainder.
        x = 50;
        int y = 3;
        int Division = x / y;
        int remainderDiv = x % y;
        System.out.println("Quotient: " + Division + ", Remainder: " + remainderDiv);
        // Task 10: Calculate expressions with and without parentheses.
        int result1 = 5 + 3 * 2;
        int result2 = (5 + 3) * 2;
        System.out.println("Without parentheses: " + result1);
        System.out.println("With parentheses: " + result2);
        // Task 11: Decrement a variable by a certain value using subtraction assignment.
        num = 10;
        num -= 3;
        System.out.println("After subtraction assignment: " + num);
        // Task 12: Compare a and b and print the result.
        a = 20;
        b = 15;
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is less than b");
        }
        // Task 13: Use assignment operators and print the result.
        x = 10;
        x += 5;
        System.out.println("After x += 5: " + x);
        x *= 2;
        System.out.println("After x *= 2: " + x);
        // Task 14: Check if score is a passing score using ternary operator.
        score = 85;
        String passStatus = (score >= 60) ? "Passing" : "Not Passing";
        System.out.println("Score is: " + passStatus);

    }
}
