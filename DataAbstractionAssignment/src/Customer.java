//ask user for checking or savings account
//new deposit object and add to deposit list
//output:
// Deposit of: $4000.0 Date: Sun Nov 04
// 00:00:00 PDT 2018 into accounting: Checking
// Deposit of: $500.0 Date Thu Aug 16
// 10:52:17 PDT 2018 into account: saving



import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkDeposit = checkDeposit;
        this.savingDeposit = savingDeposit;
    }

    public double deposit(double amt, Date date, String account){
        //your code here
        return 0;
    }
    public double withdraw(double amt, Date date, String account){
        //your code here
        return 0;
    }
    private boolean checkOverdraft(double amt, String account){
        //your code here
        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
