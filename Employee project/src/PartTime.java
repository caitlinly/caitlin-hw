import java.util.ArrayList;

public class PartTime extends HourlyEmployee{
    Boolean hasBenifits;

    //Default part time
    PartTime(){
        super();
        hasBenifits = false;
    }

    //parameterized
    PartTime(String name, int hireYear, int hoursPerWeek, int hourlyWage){
        super(name, hireYear,hourlyWage,hoursPerWeek);
        hasBenifits = false;
    }

    PartTime(PartTime ob){
        super(ob);
        hasBenifits = ob.hasBenifits;
    }

    @Override
    double annualSalary() {
        return hoursPerWeek*hourlyWage*52;
    }

    @Override
    double monthlySalary() {
        return hoursPerWeek*hourlyWage*4;
    }
}
