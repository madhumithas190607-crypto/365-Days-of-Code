public class StringMethods {
    public static void main(String[] args) {

        String text = "Java Programming";

        System.out.println("Text: " + text);
        System.out.println("Contains Java: " + text.contains("Java"));
        System.out.println("Starts with Java: " + text.startsWith("Java"));
        System.out.println("Ends with Programming: " + text.endsWith("Programming"));
        System.out.println("After replace: " + text.replace("Java", "Python"));
    }
}