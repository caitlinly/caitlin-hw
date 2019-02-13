import java.util.ArrayList;

public class Main {
    String name;
    int hireYear;
    public ArrayList<ArrayList> Employees = new ArrayList<>();
    public ArrayList<HourlyEmployee> HEs = new ArrayList<>();
    public ArrayList<SalaryEmployee> SEs = new ArrayList<>();
    public ArrayList<PartTime> PTs = new ArrayList<>();
    public ArrayList<FullTime> FTs = new ArrayList<>();

    public void addEmployee(){
        for( int n = 0; n<= Employees.size(); n ++){

        }
    }

    public static void main(String[] args) {
        Employee kelly = new SalaryEmployee("Kelly", 2001, 1000000);
        System.out.println(kelly);
        System.out.println(((SalaryEmployee) kelly).hasBenifits);
        System.out.println(kelly.annualSalary());
        System.out.println(kelly.monthlySalary());
    }
}
