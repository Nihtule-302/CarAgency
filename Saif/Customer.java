package Saif;

public class Customer extends Identification {
    private static int idCounter = 0;

    // No-arg constructor
    public Customer() {
    }

    // Constructor with name parameter
    public Customer(String name) {
        super(name);
        idCounter++;
        setId(idCounter);
    }


}
