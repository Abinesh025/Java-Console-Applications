class Job{
    static int id = 1000;
    static int totEmployees;

    public static int getId() {
        return id;
    }

    public static int getTotEmployees() {
        return totEmployees;
    }
    private  int employeeId;
    private String name;
    private String role;
    private String gender;
    private int experience; 

    // Instance Employees
        public Job(String n,String role,String gen,int exp){
            this.employeeId = ++id;
            this.name = n;
            this.role = role;

            if(gen.equals("Male") ||gen.equals("Female") || gen.equals("TransGender")){
                this.gender = gen;
            }
            else{
                System.out.println("Enter a Valid Gender Name");
            }

            if(exp >=0){
                this.experience = exp; 
            }else{
                System.out.println("Enter a Valid Experience Details");
            }

            totEmployees++;
        }
    
    
    // This will get the employee Name
        public String getName(){
            return this.name;
        }

    public String getRole() {
        return role;
    }

    public String getGender() {
        return gender;
    }

    public int getExperience() {
        return experience;
    }

    public int getEmployeeId() {
        return employeeId;
    }

}
// Scenario: Company Employee ID Generator

// A company hires employees.

// Rules
// Every employee has personal details.
// Employee IDs should be generated automatically.
// Users should NOT enter employee IDs manually.
// The first employee gets ID 1001.
// The second employee gets ID 1002.
// The third employee gets ID 1003.

// Example:

// Abinesh -> 1001
// Rahul   -> 1002
// Ashwin  -> 1003
// Additional Rules
// The system should know the total number of employees hired.
// Employee count should increase automatically.
// Employee count should be shared among all employees.
// Employee IDs must always be unique.
// Validation
// Employee name should not be empty.
// Invalid employees should not increase the employee count.


public class Employee {
    public static void main(String[] args) {
        Job emp1 = new Job("Abinesh R", "Frontend  Developer", "Male", 2);
        Job emp2 = new Job("Ashwin V", "Backend Developer", "Male", 5);
        Job emp3 = new Job("Adhnaan", "Python Developer", "Male", 3);
        Job emp4 = new Job("Sathish", "Ai Engineer", "Male", 5);
        Job emp5 = new Job("Safeek", "React Developer", "Male", 1);

        // First Employee Data
        System.out.println("First Employee Details");
        System.out.println("Employee Id" + " - " +emp1.getEmployeeId());
        System.out.println("Employee Name" + " - " +emp1.getName());
        System.out.println("Employee Role" + " - "+ emp1.getRole());
        System.out.println("Employee Gender" + " - "+emp1.getGender());
        System.out.println("Employee Experience" + " - " + emp1.getExperience());

        // Second Employee Data
            System.out.println("Second Employee Details");
            System.out.println("Employee Id" + " - " +emp2.getEmployeeId());
            System.out.println("Employee Name" + " - " +emp2.getName());
            System.out.println("Employee Role" + " - "+ emp2.getRole());
            System.out.println("Employee Gender" + " - "+emp2.getGender());
            System.out.println("Employee Experience" + " - " + emp2.getExperience());

        // Third Employee Data
            System.out.println("Third Employee Details");
            System.out.println("Employee Id" + " - " +emp3.getEmployeeId());
            System.out.println("Employee Name" + " - " +emp3.getName());
            System.out.println("Employee Role" + " - "+ emp3.getRole());
            System.out.println("Employee Gender" + " - "+emp3.getGender());
            System.out.println("Employee Experience" + " - " + emp3.getExperience());

        // Fourth Employee Data
            System.out.println("Fourth Employee Details");
            System.out.println("Employee Id" + " - " +emp4.getEmployeeId());
            System.out.println("Employee Name" + " - " +emp4.getName());
            System.out.println("Employee Role" + " - "+ emp4.getRole());
            System.out.println("Employee Gender" + " - "+emp4.getGender());
            System.out.println("Employee Experience" + " - " + emp4.getExperience());

        // Fifth Employee Data
        System.out.println("Fifth Employee Details");
        System.out.println("Employee Id" + " - " +emp5.getEmployeeId());
        System.out.println("Employee Name" + " - " +emp5.getName());
        System.out.println("Employee Role" + " - "+ emp5.getRole());
        System.out.println("Employee Gender" + " - "+emp5.getGender());
        System.out.println("Employee Experience" + " - " + emp5.getExperience());

        // Total Employees

        System.out.println(Job.getTotEmployees());
    }
}
