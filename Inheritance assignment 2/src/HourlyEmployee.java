import java.util.ArrayList;

public abstract class HourlyEmployee extends Employee{
    double hoursPerWeek;
    double hourlyWage;
    boolean hasBenifits;

    //default hourly employee
    HourlyEmployee(){
        super();
        hoursPerWeek = hoursPerWeek;
        hourlyWage = hourlyWage;
        hasBenifits = true;
    }

    //parameterized constructor
    HourlyEmployee(String name, int hireYear, double hourlyWage , double hoursPerWeek ){
        super(name, hireYear);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.hasBenifits = hasBenifits;
    }

    //Object constructor
    HourlyEmployee(HourlyEmployee ob){
        super(ob);
        hourlyWage = ob.hourlyWage;
        hoursPerWeek = ob.hoursPerWeek;
        hasBenifits = ob.hasBenifits;

    }

    abstract boolean hasBenifits();

}