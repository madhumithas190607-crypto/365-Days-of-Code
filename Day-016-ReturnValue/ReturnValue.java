public class ReturnValue {

    static int addNumbers(int a, int b) {
        return a + b;
    }

    static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int sum = addNumbers(10, 20);
        int product = multiplyNumbers(5, 4);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
