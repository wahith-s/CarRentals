package service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.car;

public class adminService {
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
                System.out.print("Enter Brand: ");
                String brand = sc.nextLine();
                System.out.print("Enter Model: ");
                String model = sc.nextLine();
                System.out.print("Enter Fuel Type: ");
                String fuel = sc.nextLine();
                System.out.print("Enter Rent per Day: ");
                double rent = sc.nextDouble();

                carList.add(new car(id,model,brand,fuel,rent));
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
}
