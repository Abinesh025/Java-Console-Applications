
// Design Student Information System

class Student{
    // Declare a Variable
        private String name;
        private int rollno;
        private String dept;
        private int sem;
        private int m1;
        private int m2;
        private int m3;
        private char grade;

    // Create a Constructor for Stroe Student Information
        public Student(String name,int rollno,String dept,int sem,int mark1,int mark2,int mark3,char g){
            this.name = name;
            this.rollno = rollno;
            this.dept = dept;
            this.sem = sem;
            this.m1 = mark1;
            this.m2 = mark2;
            this.m3 = mark3;
            this.grade = g;
        };

    // These are Update the marks
        public void  updateMark1(int mark){
            if(mark > 0 && mark <=100){
                this.m1 = mark;
            }
            else{
                System.out.println("Enter a Valid Mark");
            }
        }
        public void  updateMark2(int mark){
            if(mark > 0 && mark <=100){
                this.m2 = mark;
            }
            else{
                System.out.println("Enter a Valid Mark");
            }
        }
        public void  updateMark3(int mark){
            if(mark > 0 && mark <=100){
                this.m3 = mark;
            }
            else{
                System.out.println("Enter a Valid Mark");
            }
        }

    // This will update the semester
        public void updateSem(int sem){

            if(sem > 0 && sem <=8){
                this.sem = sem;
            }else{
                System.out.println("Enter a Valid Semester");
            }
        }

    // This will calculate Total Marks
        public int getTotalMarks(){
            int total = this.m1 + this.m2 + this.m3;
            return total; 
        }
    
    // This will Calculate Avarage Marks
        public double getAvarageMarks(){
            double avg = getTotalMarks() / 3;
            return avg;
        }
    
    //Academic Performance
        public String getAcademicDetails(){
            double avg = getAvarageMarks();
            if( avg >= 50){
                return "Pass";
            }
            return "Fail";
        }
    
    // It will Calculate the Grade Calculation
    public void getOverallGrade(){      
        
        if(getAvarageMarks() >= 90){
            this.grade = 'A';
        }
        else if(getAvarageMarks() >= 75 && getAvarageMarks() <= 89){
            this.grade = 'B';
        }
        else if(getAvarageMarks() >= 60 && getAvarageMarks() <= 74){
            this.grade = 'C';
        }
        else if(getAvarageMarks() >= 50 && getAvarageMarks() <= 59){
            this.grade = 'C';
        }
        else{
            this.grade ='U';
        }
    }

    // It will give the student  name
        public String getName(){
            return this.name;
        } 

    // It will give the rollnum 
        public int getRollNum(){
            return this.rollno;
        }

    // It will give the std Department
        public String getDept(){
            return this.dept;
        }
    // It will give the std Department
        public int getSem(){
            return this.sem;
        }
    
    // It will Give you the std Grade
        public char getGrade(){
            return this.grade;
        }
}

public class Hello{
    public static void main(String args[]){
        // Object Creation 

        Student std  =new Student("Abinesh", 4, "CSBS", 6, 40, 45, 46,'A');

        std.updateMark1(60);
        std.updateMark2(90);
        std.updateMark3(80);
        System.out.println("Name" + " - " + std.getName());
        System.out.println("Roll No" + " - " + std.getRollNum());
        System.out.println("Depaertment" + " - " + std.getDept());
        System.out.println("Semester" + " - " + std.getSem());
        System.out.println("Total Marks" + " - " + std.getTotalMarks());
        System.out.println("Avarage Marks" + " - " + std.getAvarageMarks());
        System.out.println("Std Grade" + " - " + std.getGrade());
        System.out.println("Academic Performance" + " - " + std.getAcademicDetails());
        
    }
}