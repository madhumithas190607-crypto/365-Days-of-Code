class Student {

    private String name = "Madhumitha";

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class AccessModifiers {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();
    }
}
