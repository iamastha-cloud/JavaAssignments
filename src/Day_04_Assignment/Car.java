package Day_04_Assignment;

public class Car {

        String brand;
        int year;
        double price;

        public void displayDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Year: " + year);
            System.out.println("Price: ₹" + price);

        }

        public static void main(String[] args) {
            Car car1 = new Car();
            car1.brand = "Toyota Hilux ";
            car1.year = 2020;
            car1.price = 370000;

            Car car2 = new Car();
            car2.brand = "Tata Harrier";
            car2.year = 2022;
            car2.price = 350000;

            car1.displayDetails();
            car2.displayDetails();
        }
    }


