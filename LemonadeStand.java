import java.util.Scanner;

public class LemonadeStand {

    public static void main(String[] args){
        int lemonades;
        int snacks;
        double cost;
        double pay;
        double change;
        Scanner user_input = new Scanner(System.in);

        System.out.println("How many glasses do you want: ");
        lemonades = user_input.nextInt();

        System.out.println("How many snacks do you want: ");
        snacks = user_input.nextInt();

        cost = lemonades*1.25 + snacks*1.5;
        System.out.println("Your total is: " +cost);

       System.out.println("Enter pay: ");
        pay =  user_input.nextInt();
        change = pay-cost;

        System.out.println("Your change is: " + change);
    }
}
