
public class ReserveItem extends AuctionItem{
    
    private double reservePrice;
    
    
    public ReserveItem(int itemId, String itemDescription, String sellerId ,double startPrice, double reservePrice){
        super(itemId, itemDescription, sellerId,startPrice);
        this.reservePrice = reservePrice;
    }
    
    
    @Override
    public String getStatus(){
        if(super.getStatus().equals("Closed") && super.getHighestBid() < reservePrice){
            return "Passed in";
        }
        else  return super.getStatus();
    }
    
    
    public double open(){
        double listingFee;
        if (super.getStatus().equals("Open")) {
            super.setStatus("Closed");
            if (reservePrice <= 1.00) listingFee = 0.00;
            else if (reservePrice > 1.00 && reservePrice <= 100.00) listingFee = reservePrice*0.04;
            else if (reservePrice < 100.00 && reservePrice <= 1000.00) listingFee = 4 + (reservePrice-100)*0.02;
            else listingFee = 22 + (reservePrice-1000)*0.03;
            return listingFee;
        }
        else return -1;
    }
    
    
    
    
}
