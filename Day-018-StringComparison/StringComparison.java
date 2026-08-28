public class StringComparison {
    public static void main(String[] args) {

        String name1 = "Madhumitha";
        String name2 = "Madhumitha";
        String name3 = "Java";

        System.out.println("name1 equals name2: " + name1.equals(name2));
        System.out.println("name1 equals name3: " + name1.equals(name3));

        if (name1.equals(name2)) {
            System.out.println("Both names are same");
        } else {
            System.out.println("Names are different");
        }
    }
}