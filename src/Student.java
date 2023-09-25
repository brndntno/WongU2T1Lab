public class Student {
    private String name;
    private double gpa;

    public Student(String studentName, double studentGPA) {
        name = studentName;
        gpa = studentGPA;
    }

    public void introduce() {
        System.out.println("Hi my name is " + name);
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }
}
