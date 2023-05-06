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
            cars[0] = new Car("BMW",1232000,1755 );
            cars[1] = new Car("MERCEDES",1848000,2156);
            return cars;
        }
    private void resizeEmployeeArray(int newSize) {
        Employee[] temp = new Employee[newSize];
        System.arraycopy(employees, 0, temp, 0, newSize);
        employees = temp;
    }

    private void resizeCustomerArray(int newSize) {
        Customer[] temp = new Customer[newSize];
        System.arraycopy(customers, 0, temp, 0, newSize);
        customers = temp;
    }

    private void resizeCarArray(int newSize) {
        Car[] temp = new Car[newSize];
        System.arraycopy(cars, 0, temp, 0, newSize);
        cars = temp;
    }
    }

