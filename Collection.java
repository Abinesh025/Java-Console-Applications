import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Javascript");
        courses.add("Python");
        courses.add("Sql");

        for(String course : courses){
            System.out.println(course);
        }

    }
}