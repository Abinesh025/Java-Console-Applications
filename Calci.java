class Calculator{

    
    public <T extends Number> void setValue(T value){
        System.out.println(value);
    }
}



public class Calci {
    public static void main(String[] args){
        Calculator cal = new Calculator();

        cal.setValue(50);
        cal.setValue(100.00);
        cal.setValue(1000L);
        
    }
}
