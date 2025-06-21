

package service;

import model.car;

import java.io.FileWriter;
import java.util.*;

public class carRentalSystem {
    private final List<car> carList = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);
            public void addCar() {
                int id;
                while (true) {
                    System.out.print("Enter ID: ");
                    try {
                        id = sc.nextInt();
                        sc.nextLine();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid integer for ID.");
                        sc.nextLine(); // clear the invalid input
                    }
                }
                System.out.print("Enter Model: ");
                String model = sc.nextLine();
                System.out.print("Enter Fuel Type: ");
                String fuel = sc.nextLine();
                System.out.print("how many days you want to rent the car:");
                int days= sc.nextInt();
                System.out.print("Enter Rent per Day: ");
                double rent = sc.nextDouble();

                carList.add(new car(id, model, fuel, days, rent));
                System.out.println("Car added successfully!");
            }

    public void viewCars() {
        if (carList.isEmpty()) {
            System.out.println("No cars available.");
            return;
        }
        for (car car : carList) {
            car.displayDetails();
        }
    }

    public void updateCar() {
        
        int id;
        while(true){
            System.out.print("Enter Car ID to update: ");
            try {
                id = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for ID.");
                sc.nextLine(); // clear the invalid input
            }
        }
        for (car car : carList) {
            if (car.getId() == id) {
                sc.nextLine();
                System.out.print("Enter new Fuel Type: ");
                String fuel = sc.nextLine();
                System.out.print("Enter new Rent per Day: ");
                double rent = sc.nextDouble();
                car.setFuelType(fuel);
                car.setRentPerDay(rent);
                System.out.println("Car updated successfully!");
                return;
            }
        }
        System.out.println("Car not found.");
    }

    public void deleteCar() {
        int id;
        while(true){
            try {
                System.out.print("Enter Car ID to delete: ");
                id = sc.nextInt();
                sc.nextLine(); // clear the newline character
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for ID.");
                sc.nextLine(); // clear the invalid input
            }
        }
        
        
        Iterator<car> itr = carList.iterator();
        while (itr.hasNext()) {
            car car = itr.next();
            if (car.getId() == id) {
                itr.remove();
                System.out.println("Car deleted successfully.");
                return;
            }
        }
        System.out.println("Car not found.");
    }

    public void bookCar() {
        int id;
        while (true) {
            System.out.print("Enter Car ID to book: ");
            try {
                id = sc.nextInt();
                sc.nextLine(); // clear the newline character
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for ID.");
                sc.nextLine(); // clear the invalid input
            }
        }
        

        for (car car : carList) {
            if (car.getId() == id) {
                if (car.isRented()) {
                    System.out.println("Car already rented.");
                } else {
                    car.setRented(true);
                    System.out.println("Car booked successfully!");
                    car.invoice(); // Call the invoice method to print the invoice
                }
                return;
            }
        }
        System.out.println("Car not found.");
        // To call the invoice method from the car class, you need a car object.
        // For example, if you want to print the invoice for a specific car after booking, 
        // you should call car.invoice(); inside the booking logic, not here.
        // If you want to call invoice when the car is found and booked, do it like this:

        // Example (inside the booking loop, after car.setRented(true)):
        // car.invoice();

        // Here, since the car was not found, there is no car object to call invoice on. // Removed invalid static call to non-static method
    }

    public void returnCar() {
        int id;
        while (true) {
            System.out.print("Enter Car ID to return: ");
            try {
                id = sc.nextInt();
                sc.nextLine(); // clear the newline character
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for ID.");
                sc.nextLine(); // clear the invalid input
            }
        }
        for (car car : carList) {
            if (car.getId() == id) {
                if (!car.isRented()) {
                    System.out.println("Car is not rented.");
                } else {
                    car.setRented(false);
                    System.out.println("Car returned successfully!");
                }
                return;
            }
        }
        System.out.println("Car not found.");
    }
}
