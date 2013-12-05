
public class SAccount extends Account{
    private double minAmount;
    
    public SAccount (String id,  String name, double balance, double minAmount){
        super(id, name, balance);
        this.minAmount = minAmount;
    }
    
    public double getMinAmount(){
        return minAmount;
    }
    
    
    
    public void setWithdraw(double wd){
        withdraw = wd;
    }
    public double withdraw (){
        if (withdraw <= (getBalance() - minAmount) ) {
            System.out.println("Withdraw: " + withdraw);
             return (getBalance() - withdraw);
        }
        else {
            System.out.println("Cannot withdraw");
            return getBalance();
        }
        
    }
    
   public void addInterest(double rate){
       deposit = (getBalance()*rate/100);
   }
   
    
    
   public void print(){
       super.print();
       System.out.println("Min. Amount: " + minAmount);
   }
}
