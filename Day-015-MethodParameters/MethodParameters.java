public class MethodParameters {

    static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {

        greet("Madhumitha");
        addNumbers(10, 20);
    }
}
