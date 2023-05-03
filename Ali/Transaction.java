package Ali;

import Saif.Car;
import Saif.Customer;

public class Transaction extends TransactionManagement {
    private Employee employee;
    private Customer customer;
    private Car car;
    private String paymentType;

    public void setEmployeeAndCustomer(Employee employee, Customer customer) {
        this.employee = employee;
        this.customer = customer;
    }

    public void buy(Car car, String cashOrInstallments){
        this.paymentType = cashOrInstallments;
        this.car = car;
        employee.increasePayCheck(1000);
    }

    public void rent(Car car){
        this.paymentType = "Rent";
        this.car = car;
        employee.increasePayCheck(100);
    }

    public void saveTransaction(){
        Transaction[] transactions = getTransactions();
        int i = 0;
        boolean flag = true;
        while (i<transactions.length && flag){
            if(transactions[i] == null){
                transactions[i] = this;
                flag = false;
            }
            i++;
        }

        if(i == transactions.length -1){
            resizeArray();
            transactions[i+1] = this;
        }
    }

    private void resizeArray(){
        final int increaseBy = 1;
        Transaction[] temp = new Transaction[getTransactions().length + increaseBy];
        System.arraycopy(getTransactions(), 0, temp, 0, getTransactions().length);
        setTransactions(temp);
    }

}

