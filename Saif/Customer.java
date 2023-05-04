package Saif;

public class Customer extends Identification {
    private Admin manager;
    private static int idCounter = 0;

    // No-arg constructor
    public Customer() {
        super();
        idCounter++;
        setId(idCounter);
    }

    // Constructor with name parameter
    public Customer(String name) {
        super(name);
        idCounter++;
        setId(idCounter);
    }

    // Getter for manager
    public Admin getManager() {
        return manager;
    }

    // Setter for manager
    public void setManager(Admin manager) {
        this.manager = manager;
    }

    // Getter for idCounter
    public static int getIdCounter() {
        return idCounter;
    }
}
