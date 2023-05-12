package Peter;

import Ali.Employee;
import Ali.Transaction;
import Saif.Car;
import Saif.Customer;

public class Admin {
    private static Employee[] employees = defaultEmployees();
    private static Customer[] customers = new Customer[3];
    private static Car[] cars = defaultCars();
    

    private static Employee[] defaultEmployees() {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Thorfinn");
        employees[1] = new Employee("Musashi");
        employees[2] = new Employee("Fushi");
        return employees;
    }

    private static Car[] defaultCars() {
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

        return findAvailableIndex(arr);
    }
    public void addEmployee(String name) {
        Employee newEmployee = new Employee(name);
        int index = findAvailableIndex(employees);

        employees[index] = newEmployee;
    }
    public void addCustomer(String name) {
        Customer newCustomer = new Customer(name);
        int index = findAvailableIndex(customers);

        customers[index] = newCustomer;
    }

    public void addCar(String model, double price, double rent) {
        Car newCar = new Car(model, price, rent);
        int index = findAvailableIndex(cars);

        cars[index] = newCar;
    }
    public void removeEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                employees[i] = null;
                break;
            }
        }
    }
    public void removeCustomer(String name) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getName().equals(name)) {
                customers[i] = null;
                break;
            }
        }
    }
    public void removeCar(String model) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getName().equals(model)) {
                cars[i] = null;
                break;
            }
        }
    }
    public Car getCar(String model) throws IllegalArgumentException {
        for (Car car : cars) {
            if (car != null && car.getName().equals(model)) {
                return car;
            }
        }
        return null;
    }
    public Car getCar(int id)throws IllegalArgumentException {
        for (Car car : cars) {
            if (car != null && car.getId() == id) {
                return car;
            }
        }
        return null;
    }
    public Car[] getCars() {
        return cars;
    }
    public Employee getEmployee(String name) throws IllegalArgumentException {
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public Employee getEmployee(int id) throws IllegalArgumentException{
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public Employee[] getEmployees() {
        return employees;
    }
    public Customer getCustomer(String name) throws IllegalArgumentException{
        for (Customer customer : customers) {
            if (customer != null && customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public Customer getCustomer(int id)throws IllegalArgumentException {
        for (Customer customer : customers) {
            if (customer != null && customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public Customer[] getCustomers() {
        return customers;
    }

}








