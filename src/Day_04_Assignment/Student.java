package Day_04_Assignment;

public class Student {
    String name;
    int rollNumber;
    float marks;

    public void showResult() {
        System.out.println("Student: " + name + " (Roll No: " + rollNumber + ")");
        if (marks >= 35) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Astha";
        s1.rollNumber = 101;
        s1.marks = 88.5f;

        Student s2 = new Student();
        s2.name = "Aditi";
        s2.rollNumber = 102;
        s2.marks = 34.9f;

        Student s3 = new Student();
        s3.name = "Tanya";
        s3.rollNumber = 103;
        s3.marks = 35.0f;

        s1.showResult();
        s2.showResult();
        s3.showResult();


    }

}
