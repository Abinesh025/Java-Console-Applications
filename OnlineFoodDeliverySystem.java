abstract class Order{

    public static double getTotOrderAmount() {
        return totOrderAmount;
    }

    public static int getTotOrder() {
        return totOrder;
    }

    private int orderId;
    private String name;
    private double amount;
    private String food;
    private static double totOrderAmount;
    private static int totOrder;

    public Order(int orderId,String name,double amount,String food){
        if(orderId > 0){
            this.orderId = orderId;
        }
        else {
            System.out.println("Enter a Valid Order");
        }

        if(name.isEmpty() || name.isBlank() || name == ""){
            System.out.println("Enter a Valid Name");
        }
        else{
            this.name = name;
        }

        if(food != null && !food.isEmpty() && !food.isBlank()){
            this.food = food;
            if(amount > 50.00){
                    this.amount = amount;
                    totOrderAmount += this.amount;
                    totOrder++;
                }
            else{
                System.out.println("No food for this Amount");
            }
        }else{
            System.out.println("Select your food");
        }

    }

    public void displayOrderDetails(){
        System.out.println("Order Id" + " - " + this.orderId);
        System.out.println("Name" + " - " + this.name);
        System.out.println("Food" + " - " + this.food);
        System.out.println("Amount" + " - " + this.amount);
    }

    abstract  public double finalAmount();

    public int getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getFood(){
        return food;
    }

    public void updateFood(String food,double amount){
        if(food != "" || food.isBlank() || food.isEmpty()){
            this.food = food;
            if(amount > 50.00){
                this.amount = amount;
                totOrderAmount += this.amount;
            }
            else{
                System.out.println("No food for this amount");
            }
        }
        else{
            System.out.println("No food is selected");
        }
    }
}

class NormalOrder extends Order{

    public NormalOrder(int orderId,String name,double amount,String food){
        super(orderId, name, amount,food);
    }

    
    @Override
    public double finalAmount(){
        return getAmount();
    }
}
class PremiumOrder extends Order{

    private double foodAmount;
    private double deliveryCharge;

    public PremiumOrder(int orderId,String name,double amount,double deliveryCharge,String food){
        super(orderId, name, amount,food);
        this.deliveryCharge = deliveryCharge;
    }
    
    @Override
    public double finalAmount(){
        this.foodAmount = getAmount() + this.deliveryCharge;
        return this.foodAmount;
    }
}
class DiscountOrder extends Order{

    private double foodAmount;
    private int discountPercentage;

    public DiscountOrder(int orderId,String name,double amount,int discountPercentage,String food){
        super(orderId, name, amount,food);
        if(discountPercentage > 0 && discountPercentage < 100){
            this.discountPercentage = discountPercentage;
        }
        else{
            System.out.println("Discount was Not Applicable");
        }
    }


    
    @Override
    public double finalAmount(){
        double discount = (getAmount() * this.discountPercentage) / 100;
        return this.foodAmount - discount;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        Order normal = new NormalOrder(1,"Abinesh",500.00,"Biriyani");
        Order  premium = new PremiumOrder(2,"Ashwin",250.00,20.00,"Chicken Rice");
        Order discount = new DiscountOrder(3,"Adhnaan",200.00,50,"Pasta");

        normal.displayOrderDetails();
        premium.displayOrderDetails();
        discount.displayOrderDetails();

        System.out.println(Order.getTotOrder());
        System.out.println(Order.getTotOrderAmount());
        premium.updateFood("Parotta", 500.00);
        normal.updateFood("Sambar", 150.00);
        discount.updateFood("Beef Briyani", 250.00);
    }
}
