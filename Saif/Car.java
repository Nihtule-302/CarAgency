package Saif;

public class Car extends Identification {
    private static int idCounter = 0;
    private double price;
    private double rent;

    // No-arg constructor
    public Car() {
    }

    // Constructor with model, price, and rent parameters
    public Car(String model, double price, double rent) {
        super(model);
        this.price = price;
        this.rent = rent;
        idCounter++;
        manager.addCar(model, price, rent);
    }

    // Getter for Price
    public double getPrice() {
        return price;
    }

    // Getter for Rent
    public double getRent() {
        return rent;
    }
}
