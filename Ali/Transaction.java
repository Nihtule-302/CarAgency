package Ali;

import Peter.Admin;
import Saif.Car;
import Saif.Customer;

public class Transaction extends TransactionManagement {
    private Employee employee;
    private Customer customer;
    private Car car;
    private String paymentType;
    private Admin manager = new Admin();

    public void setEmployeeAndCustomer(Employee employee, Customer customer) {
        this.employee = employee;
        this.customer = customer;
    }

    public void buy(Car car, String cashOrInstallments){
        this.paymentType = cashOrInstallments;
        this.car = car;
        employee.increasePayCheck(1000);
        manager.removeCar(car.getName());
    }

    public void rent(Car car){
        this.paymentType = "Rent";
        this.car = car;
        employee.increasePayCheck(100);
        manager.removeCar(car.getName());
    }

    public void saveTransaction(){
        Transaction[] transactions = getTransactions();
        int availableIndex = findAvailableIndex();
        transactions[availableIndex] = this;
    }

    private int findAvailableIndex(){
        Transaction[] transactions = getTransactions();
        for (int i = 0; i < transactions.length; i++) {
            if(transactions[i] == null)
                return i;
        }
        //if the array is full, resize array
        //and return the last index
        resizeArray();
        return transactions.length -1;

    }

    private void resizeArray(){
        Transaction[] temp = new Transaction[getTransactions().length + 1];
        System.arraycopy(getTransactions(), 0, temp, 0, getTransactions().length);
        setTransactions(temp);
    }
}

