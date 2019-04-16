package UI;

import Model.Items;
import Model.Pizza;
import Model.Sandwich;
import Tools.Customer;
import Tools.Order;
import Tools.Restaurant;
import Tools.Time.Hour;
import Tools.Time.Minute;
import Tools.Time.Second;
import Tools.Time.Time;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Items p = new Pizza("Joshua", 12, true);
        Items a = new Pizza("Joshua", 12, false);
        Items s = new Sandwich("Joshua", Sandwich.Size.SMALL);
        ArrayList<Items> JoshuaItems = new ArrayList<>();
        JoshuaItems.add(p);
        JoshuaItems.add(a);
        JoshuaItems.add(s);
        Order joshOrder = new Order(JoshuaItems, new Time(12,30,0));
        Customer Joshua = new Customer("Joshua","123 ave", joshOrder);
        Restaurant r = new Restaurant("Restaurant 1");
        r.addCustomer(Joshua);
        System.out.println(r.orders);
        System.out.println(r.customers);
        r.makeItems();
        //System.out.println(r.itemsMade);
        //System.out.println(r.orders);

    }
}
