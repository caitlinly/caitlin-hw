import java.util.ArrayList;

public class SalaryEmployee extends Employee{
    int annualSalary;
    boolean hasBenifits;

    //default salary employee
    SalaryEmployee(){
        super();
        annualSalary = 0;
        hasBenifits = true;
    }

    //parameterized constructor
    SalaryEmployee(String name, int hireYear, int annualSalary){
        super(name, hireYear);
        this.annualSalary = annualSalary;
        this.hasBenifits = true;
    }

    public boolean hasBenifits(){
        return hasBenifits;
    }

    SalaryEmployee(SalaryEmployee ob){
        super(ob);
        annualSalary = ob.annualSalary;
        hasBenifits = ob.hasBenifits;
    }

    public double annualSalary(){
        return annualSalary;
    }

    public double monthlySalary(){
        return annualSalary/4;
    }

}
