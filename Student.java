// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Student {
   private String name;
   private int rollNum;
   private String dept;
   private int sem;
   private int m1;
   private int m2;
   private int m3;

   public Student(String var1, int var2, String var3, int var4, int var5, int var6, int var7) {
      this.name = var1;
      this.rollNum = var2;
      this.dept = var3;
      this.sem = var4;
      if (var5 >= 0) {
         this.m1 = var5;
      } else {
         this.m1 = 0;
      }

      if (var6 >= 0) {
         this.m2 = var6;
      } else {
         this.m2 = 0;
      }

      if (var7 >= 0) {
         this.m3 = var7;
      } else {
         this.m3 = 0;
      }

   }

   public void updateMark1(int var1) {
      if (var1 >= 0 && var1 <= 100) {
         this.m1 = var1;
      } else {
         System.out.println("Enter a Valid Mark");
      }

   }

   public void updateMark2(int var1) {
      if (var1 >= 0 && var1 <= 100) {
         this.m2 = var1;
      } else {
         System.out.println("Enter a Valid Mark");
      }

   }

   public void updateMark3(int var1) {
      if (var1 >= 0 && var1 <= 100) {
         this.m3 = var1;
      } else {
         System.out.println("Enter a Valid Mark");
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
        System.out.println("Avarage Marks" + " - " + std.getAverageMarks());
        System.out.println("Std Grade" + " - " + std.getGrade());
        System.out.println("Academic Performance" + " - " + std.getAcademicDetails());
        
    }
}