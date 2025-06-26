package CarRentalSystem;


import java.util.Scanner;
// Import adminLogin if it exists in another package, e.g.:
import controll.adminController;
import controll.userController;


public class mainApp {
    adminController system = new adminController();
        userController system1 = new userController();
    public static void main(String[] args) {
        
        mainApp app = new mainApp();
        app.mainMenu();
        System.out.println("Thank you for using the Car Rental System!");
    }
    

    public void mainMenu() {
        // TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("\n===== Car Rental System =====");
            System.out.println("1.Admin Login:");
            System.out.println("2.User Login:");
            System.out.println("3.Exit");
        
            
        System.out.print("Enter choice: ");
        choice = sc.nextInt();      
        switch (choice) {
            case 1 -> system.adminLogin();
            case 2 -> system1.userLogin();
            case 3 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid choice.");
        }
    } while (choice != 3);
    sc.close();
    }
        
        // do {
        //     System.out.println("\n===== Car Rental System =====");
        //     System.out.println("1. Add the Car from the inventory");
        //     System.out.println("2. View Cars");
        //     System.out.println("3. Update the Available Cars");
        //     System.out.println("4. Delete Car");
        //     System.out.println("5. Book Car and Generate Invoice");
        //     System.out.println("6. Return Car");
        //     System.out.println("7. Exit");
        //     System.out.print("Enter choice: ");
        //     choice = sc.nextInt();

        //     switch (choice) {
        //         case 1 -> system.addCar();
        //         case 2 -> system.viewCars();
        //         case 3 -> system.updateCar();
        //         case 4 -> system.deleteCar();
        //         case 5 -> system.bookCar();
        //         case 6 -> system.returnCar();
        //         case 7 -> System.out.println("Exiting...");
        //         default -> System.out.println("Invalid choice.");
        //     }

        // } while (choice != 7);

    }

    

