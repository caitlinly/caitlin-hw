package Model;

public class Pizza extends Items{
    //initiate variables
    boolean isDelux;

    //Constructors
    public Pizza(){
        super();
        isDelux = false;
    }

    public Pizza(String name, double price, boolean delux) {
        super(name, price);
        //if isDelux is true, then add 3 to price
        isDelux = delux;
        if(isDelux){
            setPrice(price+3);
        }
    }

    @Override
    public double getCost() {
        return price;
    }

    //Returns the pasta ordered
    public String toString() {
        return "Pizza, Price: " + price;
    }
}