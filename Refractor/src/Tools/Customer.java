package Tools;

public class Customer {
    //initiate variables
    private String name;
    private String address;
    Order order;

    //Constructors
    Customer(){
        name = "";
        address = "";
    }

    public Customer(String name, String address, Order order){
        this.name = name;
        this.address = address;
        this.order = order;
    }

    //Returns the persons name and address
    public String toString() {
        return "Name: " + this.name + " Address: " + this.address + " Order: " + order;
    }

}