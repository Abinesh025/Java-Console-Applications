import java.util.*;

abstract class Account{
    
    private int id;
    private String holderName;
    private double balance;

    public Account(int id,String holderName,double balance){
        this.id = id;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return holderName;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double amount){
        this.balance = amount;
    }

    abstract void accountType();
    abstract void deposit(double amount);

}


class SavingsAccount extends Account{


    public SavingsAccount(int id,String name, double amount){
        super(id,name,amount);
    }

    @Override
    public void accountType(){
        System.out.println("Savings Account");
    }

    @Override
    public void deposit(double amount){
        double currentBalance = getBalance();

        currentBalance += amount;

        setBalance(currentBalance);

    }

}

public class BankManagement {
    public static void main(String[] args){
        HashMap <Integer,Account> bank = new HashMap<>();

        Account ac1 = new SavingsAccount(101,"Abinesh",50000.00);
        Account ac2 = new SavingsAccount(102,"Ashwin",50000.00);
        Account ac3 = new SavingsAccount(103,"Ragul",50000.00);

        bank.put(ac1.getId(),ac1);
        bank.put(ac2.getId(),ac2);
        bank.put(ac3.getId(),ac3);

            Account acc = bank.get(101);

            if(acc != null){
              
                acc.deposit(500.00);
                System.out.println(acc.getBalance());
            }
            else{
                System.out.println("Account is Not Valid");
            }

    }
}
