public class FullTime extends HourlyEmployee{
    Boolean hasBenefits;

    //default constructor
    FullTime(){
        super();
        hasBenifits = false;
    }

    //parametrized constructor
    FullTime(String name, int hireYear, int hoursPerWeek, int hourlyWage){
        super(name,hireYear,hourlyWage,hoursPerWeek);
        hasBenefits = true;
    }

    //Object constructor
    FullTime(FullTime ob){
        super(ob);
        hasBenifits = ob.hasBenifits;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nYear hired: " + hireYear;
    }

    @Override
    double annualSalary() {
        return 40*24*54;
    }

    @Override
    double monthlySalary() {
        return 40*24*4;
    }
}
