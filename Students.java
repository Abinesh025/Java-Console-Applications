
import java.nio.InvalidMarkException;

// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class InvalidStudentException extends Exception{
   public InvalidStudentException(String msg){
      super(msg);
   }
}

class InvalidMarksException extends Exception{
   public InvalidMarksException(String msg){
      super(msg);
   }
}


class Student {
   private String name;
   private int rollNum;
   private String dept;
   private int sem;
   private int m1;
   private int m2;
   private int m3;

   public Student(String name, int roll, String dept, int sem, int m1, int m2, int m3) throws InvalidStudentException{

      if(roll > 0){
         this.rollNum = roll;
      }
      else{
         throw new InvalidStudentException("Id Must be greater than 0");
      }

      if(name != null && !name.isEmpty()){
        this.name = name;
      }
      else{
         throw new InvalidStudentException("Enter a valid student name");
      }
      
      this.dept = dept;
      this.sem = sem;
      if (m1 >= 0) {
         this.m1 = m1;
      } else {
         this.m1 = 0;
      }

      if (m2 >= 0) {
         this.m2 = m2;
      } else {
         this.m2 = 0;
      }

      if (m3 >= 0) {
         this.m3 = m3;
      } else {
         this.m3 = 0;
      }

   }

   public void updateMark1(int var1) throws InvalidMarksException {
      if (var1 >= 0 && var1 <= 100) {
         this.m1 = var1;
      } else {
        throw new InvalidMarksException("Marks must be between 0 and 100");
      }

   }

   public void updateMark2(int var1) throws InvalidMarksException {
      if (var1 >= 0 && var1 <= 100) {
         this.m2 = var1;
      } else {
      throw new InvalidMarksException("Marks must be between 0 and 100");
      }

   }

   public void updateMark3(int var1) throws InvalidMarksException{
      if (var1 >= 0 && var1 <= 100) {
         this.m3 = var1;
      } else {
         throw new InvalidMarksException("Marks must be between 0 and 100");
      }

   }

   public void updateSem(int var1) {
      if (var1 > 0 && var1 <= 8) {
         this.sem = var1;
      } else {
         System.out.println("Enter a Valid Semester");
      }

   }

   public int getTotalMarks() {
      int var1 = this.m1 + this.m2 + this.m3;
      return var1;
   }

   public double getAverageMarks() {
      double var1 = (double)this.getTotalMarks() / (double)3.0F;
      return var1;
   }

   public String getAcademicDetails() {
      double var1 = this.getAverageMarks();
      return var1 >= (double)50.0F ? "Pass" : "Fail";
   }

   public char getGrade() {
      if (this.getAverageMarks() >= (double)90.0F) {
         return 'A';
      } else if (this.getAverageMarks() >= (double)75.0F && this.getAverageMarks() <= (double)89.0F) {
         return 'B';
      } else if (this.getAverageMarks() >= (double)60.0F && this.getAverageMarks() <= (double)74.0F) {
         return 'C';
      } else {
         return (char)(this.getAverageMarks() >= (double)50.0F && this.getAverageMarks() <= (double)59.0F ? 'D' : 'U');
      }
   }

   public String getName() {
      return this.name;
   }

   public int getRollNum() {
      return this.rollNum;
   }

   public String getDept() {
      return this.dept;
   }

   public int getSem() {
      return this.sem;
   }
}



public class Students{
    public static void main(String args[]){
        // Object Creation 

        try {
             Student std  =new Student("Abinesh", 4, "CSBS", 6, 40, 45, 46);

         try {
            std.updateMark1(60);
         } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         try {
            std.updateMark2(60);
         } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         try {
            std.updateMark3(60);
         } catch (Exception e) {
            System.out.println(e.getMessage());
        }

      System.out.println("Name" + " - " + std.getName());
        System.out.println("Roll No" + " - " + std.getRollNum());
        System.out.println("Depaertment" + " - " + std.getDept());
        System.out.println("Semester" + " - " + std.getSem());
        System.out.println("Total Marks" + " - " + std.getTotalMarks());
        System.out.println("Avarage Marks" + " - " + std.getAverageMarks());
        System.out.println("Std Grade" + " - " + std.getGrade());
        System.out.println("Academic Performance" + " - " + std.getAcademicDetails());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}