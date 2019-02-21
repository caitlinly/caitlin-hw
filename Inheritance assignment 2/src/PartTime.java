import java.util.ArrayList;

public class PartTime extends HourlyEmployee{
    boolean hasBenifits;

    //Default part time
    PartTime(){
        super();
        hasBenifits = false;
    }

    //parameterized
    PartTime(String name, int hireYear, int hoursPerWeek, int hourlyWage){
        super(name, hireYear,hourlyWage,hoursPerWeek);
        this.hasBenifits = hasBenifits;
        if(hoursPerWeek/7 > 5){
            hasBenifits = true;
        }
    }

    PartTime(PartTime ob){
        super(ob);
        hasBenifits = ob.hasBenifits;
    }

    public boolean hasBenifits(){
        return hasBenifits;
    }

    public double annualSalary() {
        return hoursPerWeek*hourlyWage*52;
    }

    double monthlySalary() {
        return hoursPerWeek*hourlyWage*4;
    }
}