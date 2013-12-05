import java.util.Date;
public class BookTest {
    
    public static void main(String[] args) {
        Date thisDay = new Date(2013,12,6);
        Book [] bookTest = new Book[4];
        bookTest[0] = new Book ( "1", "C++", 2.3);
        bookTest[1] = new Book ( "2", "Programming in Java", 1.9);
        bookTest[2] = new Book ( "3", "Photoshop for design", 2.5);
        bookTest[3] = new Book ( "4", "Cinderella", 2);
        
        bookTest[2].lend("Hanh", "abcxyz", bookTest[2].today);
        bookTest[2].print();
        bookTest[2].returnBook(bookTest[2].getDay(thisDay));
        
    }
}
