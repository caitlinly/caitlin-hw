package Tools;

import Model.Items;
import Tools.Time.Time;

import java.util.ArrayList;

public class Order {
    //initiate variables
    ArrayList<Items> customerOrder = new ArrayList<>();
    Time start;
    Time end;
    boolean out;
    boolean complete;

    //Constructors
    public Order(ArrayList<Items> items, Time start){
        //if not in inventory add 10 minutes to order
        customerOrder = items;
        this.start = start;
        end = new Time(start);
        for(int i = 0; i < 20;i++){
            end.tick();
        }
        out = false;
        complete = false;
    }

    public ArrayList<Items> getCustomerOrder() {
        return customerOrder;
    }

    public void deliveryInProgross(){
        out = true;
    }
    public void delivered(){
        complete = true;
    }

    //returns total price of all the items
    public double getTotalPrice(){
        double total = 0;
        for(int n = 0; n < customerOrder.size(); n ++){
            total += customerOrder.get(n).getCost();
        }
        return total;
    }

    @Override
    public String toString() {
        String l = "";
        if (complete){
            l = "yes";
        }
        if(out) {
            l = "Delivery in progress";
        }
        else {
            l = "no";
        }
        return "Ordered Items: " + customerOrder + " Total price: " + getTotalPrice() + "\nTime: " + start + "\nDelivered: " + l;
    }
}