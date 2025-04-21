package Day_04_Assignment;

public class Employee {
        String name;
        int employeeId;
        double salary;

        public Employee(String name, int employeeId, double salary) {
            this.name = name;
            this.employeeId = employeeId;
            this.salary = salary;
        }
        public void displayInfo() {
            System.out.println("Name : " + name);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Salary : ₹" + salary);
        }
        public static void main(String[] args) {

            Employee emp1 = new Employee("Kanak Mehta", 101, 10000.50);
            Employee emp2 = new Employee("Anshita Pandey", 102, 20000.75);
            emp1.displayInfo();
            emp2.displayInfo();
        }
    }


