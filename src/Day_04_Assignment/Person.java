package Day_04_Assignment;

public class Person {
        String name;
        int age;

        public void showInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age : " + age);
        }
    }
    class Teacher extends Person {
        String subject;
        public void showTeacherInfo() {
            showInfo();
            System.out.println("Subject: " + subject);
        }

        public static void main(String[] args) {
            Teacher t1 = new Teacher();
            t1.name = "Mr. Singh";
            t1.age = 40;
            t1.subject = "Mathematics";

            t1.showTeacherInfo();
            t1.showInfo();
        }
    }
