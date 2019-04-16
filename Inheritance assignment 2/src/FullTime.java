public class FullTime extends HourlyEmployee{
    boolean hasBenefits;

    //default constructor
    FullTime(){
        super();
        hasBenifits = true;
    }

    //parametrized constructor
    FullTime(String name, int hireYear, int hoursPerWeek, int hourlyWage){
        super(name,hireYear,hourlyWage,hoursPerWeek);
        this.hasBenefits = hasBenifits;
        if(hoursPerWeek/7 > 5){
            hasBenifits = true;
        }
    }

    //Object constructor
    FullTime(FullTime ob){
        super(ob);
        hasBenifits = ob.hasBenifits;
    }

    public boolean hasBenifits(){
        return hasBenifits;
    }

    double annualSalary() {
        return hoursPerWeek*hourlyWage*54;
    }

    double monthlySalary() {
        return hoursPerWeek*hourlyWage*4;
    }
}