

package service;

import model.car;
import java.util.*;

public class carRentalSystem {
    private final List<car> carList = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void addCar() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Fuel Type: ");
        String fuel = sc.nextLine();
        System.out.print("Enter Rent per Day: ");
        double rent = sc.nextDouble();

        carList.add(new car(id, model, fuel, rent));
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
        System.out.print("Enter Car ID to update: ");
        int id = sc.nextInt();
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
        System.out.print("Enter Car ID to delete: ");
        int id = sc.nextInt();
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
        System.out.print("Enter Car ID to book: ");
        int id = sc.nextInt();
        for (car car : carList) {
            if (car.getId() == id) {
                if (car.isRented()) {
                    System.out.println("Car already rented.");
                } else {
                    car.setRented(true);
                    System.out.println("Car booked successfully!");
                }
                return;
            }
        }
        System.out.println("Car not found.");
    }

    public void returnCar() {
        System.out.print("Enter Car ID to return: ");
        int id = sc.nextInt();
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
