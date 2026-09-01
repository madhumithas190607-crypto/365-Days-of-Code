class Student {

    String name;
    int age;

    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Madhumitha", 20);
        Student student2 = new Student("Rahul", 21);

        student1.displayDetails();
        student2.displayDetails();
    }
}
