package Saif;

public class Car extends Identification {
    private Admin manager;
    private static int idCounter = 0;
    private double price;
    private double rent;

    // No-arg constructor
    public Car() {
        idCounter++;
    }

    // Constructor with model, price, and rent parameters
    public Car(String model, double price, double rent) {
        super(model);
        this.price = price;
        this.rent = rent;
        idCounter++;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Getter for rent
    public double getRent() {
        return rent;
    }

    // Setter for manager
    public void setManager(Admin manager) {
        this.manager = manager;
    }

    // Getter for idCounter
    public static int getIdCounter() {
        return idCounter;
    }

    // Method to get a Car by model still not complete
    public static Car getCar(???) {
        //???
        //???
        //???
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Setter for rent
    public void setRent(double rent) {
        this.rent = rent;
    }
}
