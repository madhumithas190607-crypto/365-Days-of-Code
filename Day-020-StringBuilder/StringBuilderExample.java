public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("Java");

        text.append(" Programming");
        text.insert(5, "Language ");
        text.replace(0, 4, "Python");

        System.out.println("Final text: " + text);
    }
}