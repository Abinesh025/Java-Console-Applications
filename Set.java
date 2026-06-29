import java.util.HashSet;

public class Set {
    public static void main(String[] args){
        HashSet <String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("JavaScript");
        skills.add("Sql");
        skills.add("Java");
        skills.add("Python");

        for(String skill : skills){
            System.out.println(skill);
        }

        System.out.println(skills.contains("Sql"));
        skills.remove("Python");
        System.out.println(skills.size());

        for(String skill : skills){
            System.out.println(skill);
        }
    }
}
