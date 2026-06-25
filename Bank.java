// Exceptions
    class InvalidCredentialsException extends Exception{
        public InvalidCredentialsException(String msg){
            super(msg);
        }
    }

    class InvalidAmountException extends Exception{
        public InvalidAmountException(String msg){
            super(msg);
        }
    }

    class InsufficientBalanceException extends Exception{
        public InsufficientBalanceException(String msg){
            super(msg);
        }
    }

    class AccountNotFoundException extends Exception{
        public AccountNotFoundException(String msg){
            super(msg);
        }
    }


// Abstarct Class
    abstract class Account{

        private int acId;
        private String accountholderName;
        private double amount;

        public Account(int id, String name, double balance)throws InvalidCredentialsException {

            if(id <= 0){
                throw new InvalidCredentialsException("Id is not valid");
            }
            else{
                this.acId = id;
            }

            if(name == null || name.isEmpty()){
                throw new InvalidCredentialsException("Enter a valid Name");
            }
            else{
                this.accountholderName = name;
            }

            if(balance >= 500){
                this.amount = balance;
            }
            else{
                throw new InvalidCredentialsException("Minimum Balance is 500");
            }
        }

        abstract public void accountType();

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAcId() {
        return acId;
    }

    public String getAccountholderName() {
        return accountholderName;
    }


    public abstract void deposit(double amount)
        throws InvalidAmountException;

    public abstract void withdraw(double amount)
        throws InvalidAmountException,InsufficientBalanceException;
    }

// Interfaces

    interface Transaction{
        public void deposit(double amount) throws InvalidAmountException;
        public void withdraw(double amount) throws InsufficientBalanceException;
        public void transfer(Account to,double amount) throws InvalidAmountException,InsufficientBalanceException;
    }


//Classes

    class Account1 extends Account implements Transaction{


        public Account1(int id, String name, double balance) throws InvalidCredentialsException {
            
                super(id, name, balance);

        }

        @Override
        public void deposit(double amount) throws InvalidAmountException{

            if(amount > 0){
                double balanceAmount = getAmount();
                    balanceAmount += amount;
                    setAmount(balanceAmount);
            }
            else{
                throw new InvalidAmountException("Amount must be Greater than 0");
            }
        }

        @Override
        public void withdraw(double amount) throws InsufficientBalanceException{

            double balance = getAmount();
            if(amount > 0 && amount <= balance){
                balance -= amount;
                setAmount(balance);
            }
            else{
                throw new InsufficientBalanceException("Insufficient Bank Balance");
            }
        }

        @Override
        public void transfer(Account to, double amount) throws InvalidAmountException, InsufficientBalanceException{

            double balance = getAmount();
            if(amount <= 0){
                throw new InvalidAmountException("Enter a valid amount");
            }
            
            if(amount > balance){
                throw new InsufficientBalanceException("INsufficient bank Balance");
            }
            

            this.withdraw(amount);
            to.deposit(amount);
        }

        @Override
        public void accountType(){
            System.out.println("Savings Account");
        }

        public void displayAccount(){
            System.out.println("Id" + " - " + getAcId());
            System.out.println("Name" + " - " + getAccountholderName());
            System.out.println("Amount" + " - " + getAmount());
        }
    }
    
  
public class Bank {
    public static void main(String[] args) {
        try {
            Account account1 = new Account1(5,"Abinesh",5000.00);
            account1.getAmount();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }

        try {
            Account account2 = new Account1(6,"Ashwin",50000.00);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
