import java.util.Scanner;


public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        AuctionItem [] auctionItem = new AuctionItem[4];
        auctionItem [0] = new AuctionItem (1, "Tonka Truck" , "M001" , 1.00);
        auctionItem [1] = new AuctionItem (2, "Xbox" , "M002" , 20.00);
        auctionItem [2] = new AuctionItem (3, "Teddy Bear" , "M003" , 5.00);
        auctionItem [3] = new AuctionItem (4, "Antique Doll" , "M004" , 100.00);
        
        
        for (int i = 0; i < auctionItem.length; i++){
            System.out.println("Item ID: " + auctionItem[i].getItemId() + " Desc: " + auctionItem[i].getItemDescription() + " Start Price: " + auctionItem[i].getStartPrice());
        }
        
        System.out.println("");
        
        
              
        
        
        for (int i = 0; i < auctionItem.length; i++){
            System.out.println("Auction " + (i+1) + " has started - listing fee: $" + auctionItem[i].open());
        }
        
        
        System.out.print("Enter the id of the auction to bid on: ");
        int option = sc.nextInt();
        if (option >= 1 && option <= 4){
            for (int i = 0; i < auctionItem.length; i++){
            if (option == auctionItem[i].getItemId()){
                System.out.println("You are bidding in the auction for an " + auctionItem[i].getItemDescription());
                break;
            }
            
        }
        System.out.print("Enter bid amount: ");
        double bidAmount = sc.nextDouble();
        System.out.print("Enter bidder id: ");
        String bidderId = sc.next();
        
        if(auctionItem[option-1].placeBid(bidAmount, bidderId) < 0)System.out.println("Invalid bid for auction " + option);
        else {
            System.out.println("Your bid was successful!");
            auctionItem[option-1].placeBid(bidAmount, bidderId);
            auctionItem[option-1].close();
            System.out.println("");
            auctionItem[option-1].print();
        }
        
        for (int i = 0; i < auctionItem.length; i++){
            System.out.println("Auction " + (i+1) + " has ended - sale fee: " + auctionItem[i].close());
        }
        
        
        
               
        }
        else System.out.println("Item is not found!"); 
    }
}
    
        
        
        
        
        
    
    

