package Tools;

import Model.Items;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    public ArrayList<Customer> customers = new ArrayList<>();
    public ArrayList<Order> orders = new ArrayList<>();
    public ArrayList<Items> itemsMade = new ArrayList<>();

    public Restaurant(String name){
        this.name = name;
        this.customers = customers;
        this.orders = orders;
        makeItems();
    }

    //do the thing where u split the order into items and then add to order list
    public void addCustomer(Customer c){
        customers.add(c);
        for (int h =0; h < c.order.customerOrder.size(); h++){
            orders.add(c.order);
        }
    }

    public void makeItems(){
        for(int i = 0 ; i< orders.size();i++){
            makePizza();
            makePasta();
            makeSandwich();
        }
    }

    private void makePizza() {
        for(int n = 0; n < orders.size(); n++){
            for(int x = 0; x < orders.get(n).getCustomerOrder().size(); x++)
                if(orders.get(n).getCustomerOrder().get(x) instanceof Pizza) {
                    //customers.remove(customers.get(n));
                    itemsMade.add(orders.get(n).getCustomerOrder().get(x));
                    orders.remove(orders.get(n).getCustomerOrder().get(x));
                }
            }
        }

    private void makePasta(){
        for(int n = 0; n < orders.size(); n++){
            for(int x = 0; x < orders.get(n).getCustomerOrder().size(); x++)
                if(orders.get(n).getCustomerOrder().get(x) instanceof Pasta) {
                    //customers.remove(customers.get(n));
                    itemsMade.add(orders.get(n).getCustomerOrder().get(x));
                    orders.remove(orders.get(n).getCustomerOrder().get(x));
                }
        }
    }

    private void makeSandwich() {
        for (int n = 0; n < orders.size(); n++) {
            for (int x = 0; x < orders.get(n).getCustomerOrder().size(); x++)
                if (orders.get(n).getCustomerOrder().get(x) instanceof Sandwich) {
                    //customers.remove(customers.get(n));
                    itemsMade.add(orders.get(n).getCustomerOrder().get(x));
                    orders.remove(orders.get(n).getCustomerOrder().get(x));
                }
        }
    }

    @Override
    public String toString() {
        return name;
    }
}