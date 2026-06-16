
class Person{

    private int id;
    private String name;
    private int age;
    private String gender;

    public Person(int id, String name, int age, String gender) {
        if(id > 0){
            this.id = id;
        }

        this.name = name;
        if(age >= 0){
            this.age = age;
        }

        if(gender.equals("Male") || gender.equals("Female") || gender.equals("Transgender")){
            this.gender = gender;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

class Patient extends Person{


    static int totalPatient;
    private String disease;
    static int roomNumber;
    private int room;
    private boolean isStatus = false;

    public Patient(int id, String name, int age, String gender,String disease) {
        super(id, name, age, gender);

        this.disease = disease;

        this.room = roomNumber++;
    }

    // Admit The patient in Hospital
    public void getAdmitted(){
        if(!isStatus){
            isStatus = true;
            System.out.println("Patient Admitted SuccessFully");
        }
        else{
            System.out.println("Can't able to Admit, patient is already Admitted");
        }
    }

    // Discharge getDisCharge the patient
    public void getDisCharge(){
        if(isStatus){
            isStatus = false;
            System.out.println("Patient is Discharged");
        }
        else{
            System.out.println("Patient is Already DisCharged");
        }
    }

    public static int getTotalPatient() {
        return totalPatient;
    }

    public String getDisease() {
        return disease;
    }

    public static int getRoomNumber() {
        return roomNumber;
    }

    public int getRoom() {
        return room;
    }

    public void isStatus() {
        if(isStatus){
            System.out.println("Patient is Admitted");
        }
        else{
            System.out.println("Patient id Discharged");
        }
    }

        
}

class Doctor extends Person{

    static int totalDoctors;

    public static int getTotalDoctors() {
        return totalDoctors;
    }
    private String Specialization;
    private int experience;
    private double salary;

    public Doctor(String Specialization, int experience, double salary, int id, String name, int age, String gender) {
        super(id, name, age, gender);

        
        this.Specialization = Specialization;

        if(experience > 0){
            this.experience = experience;
        }

        if(salary > 10000){
            this.salary = salary;
        }
    }

    public String getSpecialization() {
        return Specialization;
    }

    public int getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }
}

public class Hospital {
    public Hospital() {
    }

    public static void main(String[] args) {
        Patient pat = new Patient(2,"Abinesh",20,"Female","Corona Virus");
        Doctor doc = new Doctor("Nervalogist", 5, 20000.00, 1, "Paul", 50, "Male");
        
        System.out.println("This will Print the Patient Details");

        System.out.println("Id" + " - " + pat.getId());
        System.out.println("Name" + " - " + pat.getName());
        System.out.println("Age" + " - " + pat.getAge());
        System.out.println("Gender" + " - " + pat.getGender());
        System.out.println("Disease" + " - " + pat.getDisease());
       pat.isStatus();

        System.out.println("This will Print the Doctor Details");

        System.out.println("Id" + " - " + doc.getId());
        System.out.println("Name" + " - " + doc.getName());
        System.out.println("Age" + " - " + doc.getAge());
        System.out.println("Gender" + " - " + doc.getGender());
        System.out.println("Experience" + " - " + doc.getExperience());
        System.out.println("Doctor Specialization" + " - " + doc.getSpecialization());
    }
}
