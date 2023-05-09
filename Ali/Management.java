package Ali;

import Peter.Admin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Management {
    private Admin manager = new Admin();

    Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("               (Root)                ");
        System.out.println("Hello Admin\nChoose from the list below the part of the system you want to access");
        while (true) {
            try {
                chooseEmployeeCustomerCarOrTransactionManagement();
                return;
            } catch (InputMismatchException ime) {
                System.out.print("Enter an integer, try again");
                input.nextInt();
            }
        }

    }

    private void chooseEmployeeCustomerCarOrTransactionManagement() throws InputMismatchException {
        while (true) {
            try {
                System.out.println("|(1)Employee | (2)Customer | (3)Car | (4)TransactionManagement | (5)Exit |\n");
                System.out.print("Choose the number corresponding to the part of the system to access: ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        employeeManagement();
                        break;
                    case 2:
                        customerManagement();
                        break;
                    case 3:
                        carManagement();
                        break;
                    case 4:
                        transactionManagement();
                        break;
                    case 5:
                        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                        return;
                    default:
                        System.out.print("please choose one of the options listed, try again");
                }
            } catch (InputMismatchException ime) {
                System.out.print("Enter an integer, try again");
                input.nextLine();
            }
        }
    }

    private void employeeManagement() throws InputMismatchException {
        while (true) {
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            System.out.println("              (Employee)            ");
            System.out.println("|(1)Hire | (2)Fire | (3)return to previous page");
            System.out.print("Choose from the list above the part of the system to access: ");
            boolean flag = true;
            while (flag) {
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Hired\n");
                        flag = false;
                        break;
                    case 2:
                        System.out.print("Fired\n");
                        flag = false;
                        break;
                    case 3:
                        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                        System.out.println("               (Root)                ");
                        return;
                    default:
                        System.out.print("please choose the one of the options listed, try again: ");
                }
            }
        }
    }
    private void customerManagement() throws InputMismatchException {
        while (true) {
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            System.out.println("              (Customer)            ");
            System.out.println("|(1)Add | (2)Search | (3)return to previous page");
            System.out.print("Choose from the list above the part of the system to access: ");
            boolean flag = true;
            while (flag) {
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Added\n");
                        flag = false;
                        break;
                    case 2:
                        System.out.print("Searched\n");
                        flag = false;
                        break;
                    case 3:
                        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                        System.out.println("               (Root)                ");
                        return;
                    default:
                        System.out.print("please choose the one of the options listed, try again: ");
                }
            }
        }
    }
    private void carManagement() throws InputMismatchException {
        while (true) {
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            System.out.println("              (Car)            ");
            System.out.println("|(1)Hire | (2)Fire | (3)return to previous page");
            System.out.print("Choose from the list above the part of the system to access: ");
            boolean flag = true;
            while (flag) {
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Hired\n");
                        flag = false;
                        break;
                    case 2:
                        System.out.print("Fired\n");
                        flag = false;
                        break;
                    case 3:
                        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                        System.out.println("               (Root)                ");
                        return;
                    default:
                        System.out.print("please choose the one of the options listed, try again: ");
                }
            }
        }
    }
    private void transactionManagement() throws InputMismatchException {
        while (true) {
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            System.out.println("            (transactionManagement)            ");
            System.out.println("|(1)Hire | (2)Fire | (3)return to previous page");
            System.out.print("Choose from the list above the part of the system to access: ");
            boolean flag = true;
            while (flag) {
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Hired\n");
                        flag = false;
                        break;
                    case 2:
                        System.out.print("Fired\n");
                        flag = false;
                        break;
                    case 3:
                        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                        System.out.println("               (Root)                ");
                        return;
                    default:
                        System.out.print("please choose the one of the options listed, try again: ");
                }
            }
        }
    }
}
