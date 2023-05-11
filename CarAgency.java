import Ali.Management;
import Saif.Talk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarAgency {
    public static void main(String[] args){
        System.out.println("             ASP Car Agency             ");
        System.out.println("------------------------------------");
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Hello! Welcome to The ASP Car Agency ");
            System.out.println("\nAre you an Admin or a Customer?");
            System.out.print("(0 -> Admin), (1 -> Customer), (2 -> Exit): ");
            try {
                while (true) {
                    int choice = input.nextInt();
                    if (choice >= 0 && choice <= 2){
                        if(choice == 0) {
                            Management management = new Management();
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            management.start();
                            break;
                        } else if (choice == 1){
                            Talk talk = new Talk();
                            //use the Talk class
                        }
                        else
                            System.out.println("Thank you for Visiting The ASP Car Agency \nBye");
                        System.exit(0);
                    }
                    else
                        System.out.println("Try again. Enter (0 -> Admin), (1 -> Customer), (2 -> Exit): ");
                    input.nextInt();
                }
            }catch (InputMismatchException ime){
                System.out.print("Enter an integer, try again: ");
            }
        }
    }
}
