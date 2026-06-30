class Box<T>{
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}




public class Genric{
    public static void main(String[] args) {

        Box <Integer> obj = new Box<Integer>(); 

        obj.setValue(100);

        Box <String> obj1 = new Box<String>();
        obj1.setValue("Java");

        System.out.println(obj.getValue());
        System.out.println(obj1.getValue());
        
    }
}