//Write several methods in Main class that can create
// subLIsts of your main array broken down by class

import java.util.ArrayList;

public abstract class Employee {
    String name;
    int hireYear;

    //Default constructor
    Employee() {
        name = "";
        hireYear = 0;
    }

    Employee(String name, int hireYear) {
        this.name = name;
        this.hireYear = hireYear;
    }

    //object constructor
    Employee(Employee ob){
        name = ob.name;
        hireYear = ob.hireYear;
    }

    public String getName() {
        return name;
    }

    public int getHireYear() {
        return hireYear;
    }


    @Override
    public String toString() {
        return "Name: " + name + "\nYear hired: " + hireYear;
    }

    abstract double annualSalary();

    abstract double monthlySalary();
}