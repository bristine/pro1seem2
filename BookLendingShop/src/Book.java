import java.util.Date;
import java.lang.Object;

import java.util.Calendar;

public class Book {
    Date today = new Date();
    private String bookId;
    private String bookName;
    private double lentFee;
    private String status;
    private String customerName;
    private String contact;
    private Date lentDate;
    
    
    public Book(String bookId, String bookName, double lentFee){
        this.bookId = bookId;
        this.bookName = bookName;
        this.lentFee = lentFee;
        this.status = "Available";
    }
    
    public String getBookName(){
        return bookName;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void lend(String customerName, String contact, Date lentDate){
        if (status.equals("Available")){
            this.customerName = customerName;
            this.contact = contact;
            this.lentDate = lentDate;
            status = "Lent";
        }
        else System.out.println("This book is not available!");
    }
    
    public void print(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Bood name: " + bookName);
        System.out.println("Lent fee: " + lentFee);
        if (!status.equals("Available")){
            System.out.println("Customer name: " + customerName);
            System.out.println("Contact detail: " + contact);
            System.out.println("Lent date: " + lentDate);
        }
    }
    
    
    
    public double returnBook(Date returnDate){
        int days;
        days = DateUtil.getDaysDiff(lentDate, returnDate);
        double charge = days*lentFee;
        return charge;
    }

    public Date getDay(Date thisDay){
        Date returnDay = DateUtil.newDay(thisDay);
        return returnDay;
    }
    
    private static class DateUtil {

        //private static int getDaysDiff(Date lentDate, Date returnDate) {
            
        //}

        public DateUtil() {
        }
        
        private static Date newDay(Date date){
            return date;
        }
       
    }




    
}
