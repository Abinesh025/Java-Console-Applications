class BankAccount{

    private long accountNum;
    private String accountHolder;
    private double balance;

    public BankAccount(long accountNum,String accountHolder,double balance) {
        try {
            if(accountNum < 0){
                throw new Exception();
            }
            this.accountNum = accountNum;
        } catch (Exception e) {
            System.out.println("Account Number is Not valid");
        }

        try {
            if(accountHolder == "" || accountHolder.isBlank()){
                throw new Exception();
            }
            this.accountHolder = accountHolder;
        } catch (Exception e) {
            System.out.println("Account Holder name is Missing");
        }


            this.balance = balance;
     
    }


    public long getAccountNum() {
        return accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
  
        try {
            if(amount <=0){
                throw new Exception();
            }
            this.balance +=amount;
            System.out.println("Amount is Deposited");
        } catch (Exception e) {
            System.out.println("Invalid Deposit Amount");
        }
        finally{
            System.out.println("Transaction Completed");
        }
    }

    public void withdraw(double amount){
        try {
            if(amount > this.balance){
                throw new Exception();
            }
            this.balance -= amount;
            System.out.println("Amount Withdraw successfully");

        } catch (Exception e) {
            System.out.println("Withdraw Failure due to Insufficiet Bank Balance");
        }
        finally{
            System.out.println("Transaction Completed");
        }
    }

    
}



public class Atm {
    public static void main(String[] args) {
        BankAccount transaction = new BankAccount(1,"Abinesh",5000.00);

        System.out.println(transaction.getBalance());
        transaction.deposit(5000.00);
        transaction.withdraw(500.00);

    }
}
