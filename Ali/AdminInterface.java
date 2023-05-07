package Ali;

import Peter.Admin;

import java.util.Scanner;

public class AdminInterface {
    private Admin manager = new Admin();

    Scanner input = new Scanner(System.in);
    public void chooseEmployeeCustomerCarOrTransactionManagement(){
        System.out.println("| Employee | Customer | Car | TransactionManagement |");
        System.out.print("Choose from the list above the part of the system to access: ");

    }
    public void employeeOptions(){
        System.out.println("| Hire | Fire | Search | Display |");
        System.out.print("Choose from the list above the part of the system to access: ");

    }
    public void customerOptions(){
        System.out.println("| Add | Remove | Search | Display |");
        System.out.print("Choose from the list above the part of the system to access: ");

    }
    public void carOptions(){
        System.out.println("| add | remove | Search | Display |");
        System.out.print("Choose from the list above the part of the system to access: ");

    }


}
