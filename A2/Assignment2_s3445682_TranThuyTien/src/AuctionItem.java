
public class AuctionItem {
    private int itemId;
    private String itemDescription;
    private String sellerId;
    private double startPrice;
    private String status;
    private double highestBid;
    private String highestBidderId;
    
    
    //Constructor
    public AuctionItem(int itemId, String itemDescription, String sellerId ,double startPrice){
        this.itemId = itemId;
        this.itemDescription = itemDescription;
        this.sellerId = sellerId;
        this.startPrice = startPrice;
        this.status = "Pending";
        this.highestBid = 0;
        
        
    }
    
    
    //Accessor
    public int getItemId(){
        return itemId;
    }
    
    public String getItemDescription(){
        return itemDescription;
    }
    
    public String getSellerId(){
        return sellerId;
    }
    
    public double getStartPrice(){
        return startPrice;
    }
    
    public String getStatus(){
        return status;
    }
    
    public double getHighestBid(){
        return highestBid;
    }
    
    public String getHighestBidderId(){
        return highestBidderId;
    }
    
    
    public boolean hasBids(){
        if (highestBid >= startPrice) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public double open(){
        double listingFee;
        if (status.equals("Pending")){
            status = "Open";
            if(startPrice <= 5.00) listingFee = 0.20;
            else if(startPrice > 5 && startPrice <= 20.00) listingFee = 0.50;
            else if(startPrice > 20 && startPrice <= 100.00) listingFee = 1.00;
            else if(startPrice > 100 && startPrice <= 250.00) listingFee = 2.50;
            else listingFee = 5.00;
            
            return listingFee;
        }
        else return -1.0;
    }
    
    
    public double close(){
        double saleFee;
        if (status.equals("Open")) {
            status = "Closed";
            if (highestBid < 1.00) saleFee = 0.00;
            else if (highestBid >= 1.00 && highestBid <= 100.00) saleFee = highestBid*0.05;
            else if (highestBid < 100.00 && highestBid <= 1000.00) saleFee = 5 + (highestBid-100)*0.03;
            else saleFee = 32 + (highestBid-1000)*0.01;
            return saleFee;
        }
        else return -1;
    }
    
    public int placeBid(double bidAmount, String bidder){
        if(status.equals("Open")){
            if(bidAmount >= startPrice && bidAmount >highestBid){
                highestBid = bidAmount;
                highestBidderId = bidder;
                return 0;
            }
            else return -2;
        }
        else return -1;
    }
    
    
    public void print(){
        //System.out.println("Item ID: " + itemId + " Desc: " + itemDescription + " Start Price: " + startPrice);
        System.out.println("Item ID : " + itemId);
        System.out.println("Description : " + itemDescription);
        System.out.println("Seller ID : " + sellerId);
        System.out.println("Starting price : " + startPrice);
        System.out.println("Auction Status : " + status);
        System.out.println("Highest Bid : " + highestBid);
        System.out.println("Highest Bidder : " + highestBidderId);
    }
    
}
