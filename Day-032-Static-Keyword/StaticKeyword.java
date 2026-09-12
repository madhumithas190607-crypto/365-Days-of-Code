class Student {

    static String college = "ABC College";

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

public class StaticKeyword {

    public static void main(String[] args) {

        Student student1 = new Student("Madhumitha");
        Student student2 = new Student("Anu");

        student1.display();
        student2.display();
    }
}