import java.util.*;
public class Account {
    private String name;
    private String id;
    private double balance;
    double annualInterest = 0;
    double withdraw;
    double deposit;

    public Account(String na, String idn, double ba){
        name = na;
        id = idn;
        balance = ba;
        
        
    }
    public double getBalance(){
        return balance;
    }
    
    public void setAnnualInterest(double anIn){
        annualInterest = anIn;
    }
    
    public double getAnnualInterest(){
        return annualInterest;
    }
    
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public double getMonthlyInterestRate(){
        double mInterestRate = annualInterest/12;
        return mInterestRate;
    }
    
    public void setWithdraw(double wd){
        withdraw = wd;
    }
    public void withdraw (){
        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Balance: " + balance);
        }
        else {
            System.out.println("Not enough $$");
            
        }
        
    }
    
    public void setDepoit(double d){
        deposit = d;
    }
    
    public double getDeposit(){
        balance = balance + deposit;
        System.out.println("Deposit: " + deposit);
        return balance;
    }
    
    public void print(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + getBalance());
    }
    
         
}
