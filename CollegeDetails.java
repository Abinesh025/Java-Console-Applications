class College{

    private int stdAdNum;
    private String name;
    private String gender;
    private String dept;

    static int admissionCount;

    public College(int adNum,String n,String gen,String dept){

        // This will check name
        if(adNum > 0){
            this.stdAdNum = adNum;
        }
        // This will check Name Type
        if(n instanceof  String){
            this.name = n;
        }
        // This will check Gen
        if(gen == "Male" || gen == "Female" || gen == "Transgender"){
            this.gender = gen;
        }
        
        this.dept = dept;
        admissionCount++;
    }

    // This will give the studenTAdmissionId
        public int getAdmissionId(){
            return this.stdAdNum;
        }

    // This will give a Student Name;
        public String getName(){
            return this.name;
        }
    
    // This will a std gender
        public String getGender(){
            return this.gender;
        }

    // This will give a std Department
        public String getDept(){
            return this.dept;
        }

    // This will give the total AdmissionCount
        public static void getTotalAdmission(){
            System.out.println(admissionCount);
        }

    

}
// Every student has personal details.
// Whenever a student is admitted, the total admission count should increase automatically.
// The college should be able to view the total number of admitted students at any time.
// The admission count should be shared among all students.

public class CollegeDetails{
    public static void main(String[] args){

        // Object creation for first Student
            College std1 = new College(1, "Abinesh R", "Male", "Csbs");

        // Object creation for first Student
            College std2 = new College(2, "Ashwin", "Male", "Cse");

        // Object creation for first Student
            College std3 = new College(3, "Adhnaan", "Male", "Aids");

        // Object creation for first Student
            College std4 = new College(4, "Sathish", "Male", "It");


        // Student One Details

            System.out.println("Student 1 Details");
            System.out.println("StdAdmissionId"+ " - " +std1.getAdmissionId());
            System.out.println("Name"+ " - " +std1.getName());
            System.out.println("Dept"+ " - " +std1.getDept());
            System.out.println("Gender"+ " - " +std1.getGender());

        // Student Two Details

            System.out.println("Student 2 Details");
            System.out.println("StdAdmissionId"+ " - " +std2.getAdmissionId());
            System.out.println("Name"+ " - " +std2.getName());
            System.out.println("Dept"+ " - " +std2.getDept());
            System.out.println("Gender"+ " - " +std2.getGender());

        // Student Three Details

            System.out.println("Student 3 Details");
            System.out.println("StdAdmissionId"+ " - " +std3.getAdmissionId());
            System.out.println("Name"+ " - " +std3.getName());
            System.out.println("Dept"+ " - " +std3.getDept());
            System.out.println("Gender"+ " - " +std3.getGender());

        // Student Four Details

            System.out.println("Student 4 Details");
            System.out.println("StdAdmissionId"+ " - " +std4.getAdmissionId());
            System.out.println("Name"+ " - " +std4.getName());
            System.out.println("Dept"+ " - " +std4.getDept());
            System.out.println("Gender"+ " - " +std4.getGender());

            College.getTotalAdmission();
    }
}