abstract class Employee{

    static int totEmployees;

    public static int getTotEmployees() {
        return totEmployees;
    }
    private int employeeId;
    private String empName;
    private double baseSalary;


    public Employee(int id,String name,double salary){
        if(id>0){
            this.employeeId = id;
            ++totEmployees;
        }
        else{
            System.out.println("Enter a valid Id");
        }

        if(name != null){
            this.empName = name;
        }
        else{
            System.out.println("Enter a valid Name");
        }

        if(salary > 10000){
            this.baseSalary = salary;
        }
        else{
            System.out.println("Enter a valid Amount");
        }
    }

    public void displayDetails(){
        System.out.println("Id" + " "+ this.employeeId);
        System.out.println("Name" + " "+ this.empName);
        System.out.println("Base-Salary" + " "+ this.baseSalary);
    }
    abstract public double calculateSalary();

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}

class FulltimeEmployee extends Employee{
    private double finalSalary;
    private double bonus;

    public FulltimeEmployee(int id,String name,double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
       return this.finalSalary = getBaseSalary() + this.bonus;
    }
}

class PartTimeEmployee extends Employee{
    private double finalSalary;
    private double hoursWorked;
    private double hoursRate;

    public PartTimeEmployee(int id,String name,double salary,double hoursWorked, double hoursRate) {
        super(id, name, salary);

        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    @Override
    public double calculateSalary(){
      return  this.finalSalary = this.hoursWorked * this.hoursRate;
    }
}

class Intern extends Employee{
    private double finalSalary;
    private double stipend;

    public Intern(int id,String name,double salary,double stipend) {
        super(id, name, salary);
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary(){
        return  this.finalSalary = this.stipend;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        
        Employee full = new FulltimeEmployee(1,"Joseph",200000.00,10000.00);
        Employee part = new PartTimeEmployee(2,"Stalin",200000.00,15,11000.00);
        Employee intern = new Intern(3,"Seeman",200000,10000.00);

        full.displayDetails();
        part.displayDetails();
        intern.displayDetails();

        System.out.println(full.calculateSalary());
        System.out.println(part.calculateSalary());
        System.out.println(intern.calculateSalary());
    }
}
