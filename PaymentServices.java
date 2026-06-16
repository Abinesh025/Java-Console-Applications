class Payment{

    static private int totPayment;

    public static int getTotPayment() {
        return totPayment;
    }
    private int paymentId;
    private double amount;

    public Payment(int paymentId,double amount){
        
        if(paymentId > 0){
            this.paymentId = paymentId;
        }
        else{
            System.out.println("Payment Id was Not valid");
        }

        if(amount > 0){
            this.amount = amount;
        }
        else{
            System.out.println("Enter a Valid Amount");
        }
        ++totPayment;
    }

    public void paymentProcess(){
        System.out.println("Payment Successfully");
    }

    public void paymentFailed(){
        System.out.println("Payment Failed Please Try Again Later");
    }
}

// For Upi PaymentService
class UPI extends  Payment{

    private int upiId;

    public UPI(int upiId,double amount,int paymentId){
        super(paymentId,amount);

        // Generate the Random UPI Id For Evaluation

        if(upiId > 0){
            this.upiId = upiId;
        }
        else{
            super.paymentFailed();
        }
    }

    @Override
    public void paymentProcess(){
        System.out.println("Upi Payment was Processed Successfully");
    }

    public int getUpiId() {
        return upiId;
    }

}


// For Card PaymentService

class Card extends  Payment{

    private int cardId;

    public Card(int cardId,double amount,int paymentId){
        super(paymentId,amount);

        // Generate the Random UPI Id For Evaluation

        if(cardId > 0){
            this.cardId = (int) (Math.random() * 100)+1;
        }
        else{
            super.paymentFailed();
        }
    }

    @Override
    public void paymentProcess(){
        System.out.println("Card Payment was Processed Successfully");
    }

    public int getcardId() {
        return cardId;
    }

}

// For cash PaymentService
class Cash extends Payment{

    public Cash(int paymentId,double amount) {
        super(paymentId, amount);
    }

    @Override
    public void paymentProcess(){
        System.out.println("Cash Payment was Processed Successfully ");
    }
    
}

public class PaymentServices {
    public static void main(String[] args) {
        
        Payment upi = new UPI(50,1000.00,1);
        Payment card = new Card(1, 20000.00, 10);
        Payment cash = new Cash(20, 10000.00);

        upi.paymentProcess();
        card.paymentProcess();
        cash.paymentProcess();
        System.out.println(Payment.getTotPayment());
    }
}
