/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s3445682
 */
public class CAccount extends Account{
    private double overDraftLimit;
    private double amountOverDrawn  ;
    private int numberTrans;
    
    public CAccount(String id, String name, double balance, double overDraftLimit){
        super(id, name, balance);
        this.overDraftLimit = overDraftLimit;
        amountOverDrawn = 0;
        numberTrans = 0;
        
        
    }
    
    public CAccount(String id, String name, double balance){
        super(id, name, balance);
    }
    
    public double getOverDraftLimit(){
        return overDraftLimit;
    }
    
    public void setAmountOverDrawn(double aod){
        amountOverDrawn = aod;
    }
    
    public double getAmountOverDrawn(){
        return amountOverDrawn;
    }
    
    public void setNumberTrans(int numTrans){
        this.numberTrans = numTrans;
    }
    
    public int getNumberTrans(){
        return numberTrans;
    }
    
    public double getAvailableFunds(){
        return (getBalance() + (overDraftLimit - amountOverDrawn));
    }
    
    public void withdraw(){
        if (super.withdraw > getAvailableFunds()){
            System.out.println("Reject transaction!");
            
        }
        else if (super.getBalance() == 0){
            amountOverDrawn = super.withdraw;
            
        }
        else {
            amountOverDrawn = super.withdraw - super.getBalance();
            super.setWithdraw(super.getBalance());
            super.withdraw();
            numberTrans++;
            
            
            
        }
    }
    
    
}
