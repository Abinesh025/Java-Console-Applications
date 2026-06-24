class BankAccount{
    private double amount;
    public double balance;

    public BankAccount(double amount) {

        if(amount <= 0){
            throw new IllegalArgumentException("Enter a valid Amount");
        }
        else{
            this.amount = amount;
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setBalance(double balance){

        if(balance <=0){
            throw new IllegalArgumentException("Enter a valid balance");
        }

        if(balance >= amount){
            throw new IllegalArgumentException("Enter a valid balance");
        }

        this.balance -= amount;
    }

}


public  class Withdraw{
    public static void main(String args[]){
        BankAccount account = new BankAccount(500);
        System.out.println(account.getAmount());
        account.setBalance(1000);
      
    }
}