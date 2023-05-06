package Peter;

import Ali.Employee;
import Ali.TransactionManagement;
import Saif.Car;
import Saif.Customer;

import java.util.Arrays;

public class Admin {
    private Employee[] employees = defaultEmployees();
    private Customer[] customers = new Customer[3];
    private Car[] cars = defaultCars();
    private TransactionManagement transactionManagement = new TransactionManagement();

    private Employee[] defaultEmployees() {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Thorfinn");
        employees[1] = new Employee("Musashi");
        employees[2] = new Employee("Fushi");
        return employees;
    }

    private Car[] defaultCars() {
        Car[] cars = new Car[2];
        cars[0] = new Car("BMW", 1232000, 1755);
        cars[1] = new Car("MERCEDES", 1848000, 2156);
        return cars;
    }

    private void resizeEmployee() {
        int increaseBy = 5;
        Employee[] temp = new Employee[employees.length + increaseBy];
        System.arraycopy(employees, 0, temp, 0, employees.length);
        employees = temp;
    }


    private void resizeCustomer() {
        int increaseBy = 5;
        Customer[] temp = new Customer[customers.length + increaseBy];
        System.arraycopy(customers, 0, temp, 0, customers.length);
        customers = temp;
    }

    private void resizeCar() {
        int increaseBy = 5;
        Car[] temp = new Car[cars.length + increaseBy];
        System.arraycopy(cars, 0, temp, 0, cars.length);
        cars = temp;
    }
    private int findAvailableIndex(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return i;
            }
        }

        if (arr instanceof Employee[]) {
            resizeEmployee();
        } else if (arr instanceof Car[]) {
            resizeCar();
        } else if (arr instanceof Customer[]) {
            resizeCustomer();
        }

        return arr.length-1;
    }


}








