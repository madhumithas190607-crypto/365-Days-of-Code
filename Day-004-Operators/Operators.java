public class Operators {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);

        // Arithmetic Operators
        System.out.println("\nArithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators");
        System.out.println((a > b) && (a != b));
        System.out.println((a < b) || (a == b));
        System.out.println(!(a == b));
    }
}