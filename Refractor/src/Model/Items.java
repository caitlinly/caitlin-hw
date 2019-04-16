package Model;

public abstract class Items {
    //initiate variables
    private String name;
    protected double price;

    //Constructors
    Items(){
        name = "";
        price = 0;
    }

    public Items(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // returns the price of specific item
    public abstract double getCost();

}
