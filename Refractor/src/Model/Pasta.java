package Model;

public class Pasta extends Items {
    //initiate variables
    boolean isDelux;

    //Constructors
    public Pasta(){
        super();
        isDelux = false;
    }

    Pasta(String name, double price, boolean delux){
        super(name, price);
        this.isDelux = delux;
    }

    @Override
    public double getCost() {
        //if isDelux is true, add 2 bucks
        if(isDelux == true){
            this.price += 2;
        }
        return this.price;
    }

    //Returns the pasta ordered
    public String toString() {
        return "Pasta, Price: " + this.price;
    }
}