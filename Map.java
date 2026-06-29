import java.util.HashMap;

public class Map {
    public static void main(String[] args){
        HashMap <Integer,String> employees = new HashMap<>();

        employees.put(101,"Abinesh");
        employees.put(102,"Ashwin");
        employees.put(103,"Adhnaan");
        employees.put(104,"Sathish");

        System.out.println(employees.get(102));
        employees.put(103,"Karthik");
        employees.remove(104);

        System.out.println(employees.containsKey(101));
        System.out.println(employees.containsValue("Adhnaan"));

        System.out.println(employees.size());

        for(Integer id : employees.keySet()){
            System.out.println("Employee" + ":" + employees.get(id));
        }
        
    }
}
