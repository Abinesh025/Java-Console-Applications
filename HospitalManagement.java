abstract class Person{
    private int id;
    private String name;
    private int age;
    private String gender;

    public Person(int id, String name, int age, String gender){

            if(id < 0 ){
                throw new IllegalArgumentException("Enter a Valid Id");
            }
            else{
                this.id = id;
            }
            
            if(name != null && !name.isBlank()){
                this.name = name;
            }
            else{
                throw new IllegalArgumentException("Name is not a valid");
            }

            if(age <= 0){
                throw new IllegalArgumentException("Enter a valid Age");
            }
            else{
                this.age = age;
            }

            if(gender.equals("Female") || gender.equals("Male")||gender.equals("Transgender")){
                this.gender = gender;
            }
            else{
                throw new IllegalArgumentException("Enter a valid Gender");
            }

        }

        public void displayDetails(){
            System.out.println("Id" + " - " + this.id);
            System.out.println("Name" + " - " + this.name);
            System.out.println("Age" + " - " + this.age);
            System.out.println("gender" + " - " + this.gender);
        }

        // This should be override by inheritance
        abstract public void role();
}

// Interfaces

interface  Billable{

    public void generateBill();
}

interface Payment{

    public void pay();
}

class Doctor extends Person implements Billable{

    private String specialization;
    private int experience;

    public Doctor(int id, String name, int age, String gender,String specialization,int experience){
        super(id, name, age, gender);

        if(specialization == null || specialization.isBlank()){
            throw new IllegalArgumentException("Invalid Details");
        }
        else{
            this.specialization = specialization;
        }

        if(experience <= 0){
            throw new IllegalArgumentException("Enter a valid Experience Details");
        }
        else{
            this.experience = experience;
        }
    }

    @Override
    public void role(){
        System.out.println("Treats Patients");
    }

    @Override
    public void generateBill(){
        System.out.println("Fees Recieved SuccessFully");
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }
}

class Patient extends Person implements Billable{

    private String diseases;
    private int roomNumber;

    public Patient(int id, String name, int age, String gender,String diseases,int roomNumber){
        super(id, name, age, gender);

        if(diseases == null || diseases.isBlank()){
            throw new IllegalArgumentException("Invalid Details");
        }
        else{
            this.diseases = diseases;
        }

        if(roomNumber <= 0){
            throw new IllegalArgumentException("Enter a valid Room NUmber");
        }
        else{
            this.roomNumber = roomNumber;
        }
    }

    @Override
    public void role(){
        System.out.println("Under Treatment");
    }

    @Override
        public void generateBill(){
            System.out.println("Bill Generated SuccessFully");
        }

    public String getDiseases() {
        return diseases;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}

class UPI implements Payment{

    @Override
    public void pay(){
        System.out.println("Upi Payment Received SuccessFully");
    }
}

class Card implements Payment{

    @Override
    public void pay(){
        System.out.println("Card Payment Received SuccessFully");
    }
}

class Cash implements Payment{

    @Override
    public void pay(){
        System.out.println("Cash Payment Received SuccessFully");
    }
}

class Hospital1{
    private double balance;

    public void deposit(double amount){
        try {
            if(amount > 0){
                this.balance += amount;
                System.out.println("Amount SuccessFully Deposited");
            }
        } catch (Exception e) {
            System.out.println("Enter a Valid Amount for Deposit");
        }
        finally{
            System.out.println("Process Completed");
        }
    }

    public void withdraw(double amount){
        try {
            if(amount < 0){
                throw new IllegalArgumentException("Invalid Amount");
            }

            if(amount > balance){
                throw new IllegalArgumentException("Insufficient Balances");
            }

            this.balance -= amount;
        } catch (Exception e) {
            System.out.println("Payment Failed");
        }
        finally{
            System.out.println("Process Completed");
        }
    }

    public void transfer(Hospital2 to,double amount) {
        try {
            if(amount <=0 ){
                throw new IllegalArgumentException("Invalid Amount");
            }

            if(amount > this.balance){
                throw  new IllegalArgumentException("Insufficient Balance");
            }

            this.balance -= amount;
            
        } catch (Exception e) {
            System.out.println("Insufficient Errors Occurs");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class Hospital2{
    private double balance;

    public void deposit(double amount){
        try {
            if(amount > 0){
                this.balance += amount;
                System.out.println("Amount SuccessFully Deposited");
            }
        } catch (Exception e) {
            System.out.println("Enter a Valid Amount for Deposit");
        }
        finally{
            System.out.println("Process Completed");
        }
    }

    public void withdraw(double amount){
        try {
            if(amount < 0){
                throw new IllegalArgumentException("Invalid Amount");
            }

            if(amount > balance){
                throw new IllegalArgumentException("Insufficient Balances");
            }

            this.balance -= amount;
        } catch (Exception e) {
            System.out.println("Payment Failed");
        }
        finally{
            System.out.println("Process Completed");
        }
    }

    public double getBalance() {
        return balance;
    }
}


public class HospitalManagement {
    public static void main(String[] args) {
        
        Person doctor = new Doctor(1,"Paul",35,"Male","Gainagologist",5);

        Person patient = new Patient(5,"Abinesh",20,"Male","Hair Loss",04);

        doctor.displayDetails();
        patient.displayDetails();

        doctor.role();
        patient.role();

        UPI upi = new UPI();
        upi.pay();
        Card card = new Card();
        card.pay();
        Cash cash = new Cash();
        cash.pay();

        Hospital1 hos1 = new Hospital1();
        Hospital2 hos2 = new Hospital2();

        System.out.println(hos1.getBalance());
        hos1.deposit(500.00);
        System.out.println(hos1.getBalance());
        System.out.println(hos2.getBalance());
        hos1.transfer(hos2 , 500.00);
        // hos2.deposit(500.00);

        

            
    }
}
