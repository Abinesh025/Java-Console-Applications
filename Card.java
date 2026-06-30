class Box<T>{
    private T value;

    public Box(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value) {
    this.value = value;
}
}

class Printer{

    public void display(Box<?> box){
        box.setValue(100); 
    }
}


public class Card {
    public static void main(String[] args){
        Printer print = new Printer();

        print.display(new Box<>(10));
        print.display(new Box<>("Java"));
        print.display(new Box<>(5.5));

        
    }
}
