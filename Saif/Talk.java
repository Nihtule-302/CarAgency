package Saif;

import Peter.Admin;
import Saif.Identification;
import Ali.Transaction;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Talk {
    private Customer cust = new Customer();
    private Car op = new Car();
    private Admin manager = new Admin();
    Scanner input = new Scanner(System.in);
    private String decision;
    private String paymentType;

    public void howCanIHelp(){ 
        try{
            System.out.println("Buy or rent?");
            decision = input.next();
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }

        if(decision.equals("buy") || decision.equals("rent")){
            if(decision.equals("buy")){
                System.out.println("Cash or installments?");
                paymentType = input.next();
                if(paymentType.equals("cash") || paymentType.equals("installments"))
                Transaction.buy(Car car, paymentType)
            } else if(decision.equals("rent")){
                paymentType = "cash";
                decision = this.decision;
            }
            
        } else {
            System.out.println("please enter a valid operation");
        }
    }

    public void thatWillBe(String decision){
        System.out.println("Customer: " + cust.getName());
        System.out.println("Model: " + op.getName());
        System.out.println("Operation: " + decision);
        System.out.println("Payment type: " + paymentType);
        System.out.println("Price: " + op.getPrice());
    }
}
