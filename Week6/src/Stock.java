/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s3445682
 */
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    
    
    public Stock(String sym, String na){
        symbol = sym;
        name = na;
    }
    
    public String getSymbol(){
        return symbol;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPreviousClosingPrice(double pcp){
        previousClosingPrice = pcp;
        
    }
    
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    
    public void setCurrentPrice(double cp){
        currentPrice = cp;
    }
    
    public double getCurrentPrice(){
        return currentPrice;
    }
    
    public double changePercent(){
        double percent;
        percent = (currentPrice - previousClosingPrice)*100/currentPrice;
        return percent;
    }
    
    
    
    
}
