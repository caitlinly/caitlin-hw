package Model;

public class Sandwich extends Items {
    //Sets price for the different sizes of sandwiches
    public enum Size{
        SMALL(6.5), MEDIUM(8.0), LARGE(10.5);
        private double price;

        Size(double d){price = d;}
        double getPrice() {return price;}
    }

    Size size;

    //Constructors
    public Sandwich(){
        super();
        size = Size.MEDIUM;
    }

    public Sandwich(String name, Size size){
        super(name,size.getPrice());
        this.size = size;
    }

    //Returns the price of the sandwich
    @Override
    public double getCost() {
        return this.price;
    }

    //Returns the sandwich ordered
    public String toString() {
        return "Sandwich" + " Price: " + this.price;
    }
}