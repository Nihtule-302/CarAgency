package Ali;

import Peter.Admin;
import Saif.Identification;

public class Employee extends Identification {
    private Admin manager = new Admin();
    private static int idCounter = 0;
    private double payCheck = 1000;

    public Employee(){
    }
    public Employee(String name){
        idCounter++;
        setName(name);
        setId(idCounter);
        manager.addEmployee();
    }

    public void increasePayCheck(double money){
        this.payCheck += money;
    }
}
