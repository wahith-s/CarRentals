package controll;

import java.util.Scanner;

import CarRentalSystem.mainApp;
import service.adminService;

public class adminController {
  adminService admin = new adminService();
    Scanner sc=new Scanner (System.in);
    int choice=0;
    public void adminLogin()  {
  do{
    System.out.println("ADMIN LOGIN");
    System.out.println("1. Add the Car from the inventory");
    System.out.println("2. View Cars");
    System.out.println("3. Update the Available Cars");
    System.out.println("4. Delete Car");
    System.out.println("5. Logout & go to main menu");
    System.out.print("Enter choice: ");
    choice = sc.nextInt();

    switch (choice) {
        case 1 -> admin.addCar();
        case 2 -> admin.viewCars();
        case 3 -> admin.updateCar();
        case 4 -> admin.deleteCar();
        case 5 -> {
            System.out.println("Logging out and returning to main menu...");
            // Call logic to go back to main app/menu
            // For example:
            new mainApp().mainMenu();
        }
        default -> System.out.println("Invalid choice.");
    }
  } while (choice != 5);
    }

}
