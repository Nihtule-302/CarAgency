package Ali;

import Peter.Admin;

import java.util.Scanner;

public class AdminInterface {
    private Admin manager = new Admin();

    Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Hello Admin");
        chooseEmployeeCustomerCarOrTransactionManagement();
    }

    private void chooseEmployeeCustomerCarOrTransactionManagement(){
        System.out.println("| Employee | Customer | Car | TransactionManagement |");
        System.out.print("Choose from the list above the part of the system to access: ");
        String choice = input.next();
        switch (choice) {
            case "Employee": employeeOptions();
            break;
            case "Customer": customerOptions();
            break;
            case "Car": carOptions();
            break;
        }
    }
    private void employeeOptions(){
        System.out.println("| Hire | Fire | Search | Display |");
        System.out.print("Choose from the list above the part of the system to access: ");

    }
    private void customerOptions(){
        System.out.println("| Add | Remove | Search | Display |");
        System.out.print("Choose from the list above the part of the system to access: ");

    }
    private void carOptions(){
        System.out.println("| add | remove | Search | Display |");
        System.out.print("Choose from the list above the part of the system to access: ");

    }


}
