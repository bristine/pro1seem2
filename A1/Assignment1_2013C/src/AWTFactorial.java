import javax.swing.JApplet;

/**
 *
 * @author v90207
 */
import java.awt.*;         // Using AWT containers and components
import java.awt.event.*;   // Using AWT events and listener interfaces
 
// An AWT GUI program inherits the top-level container Frame

public class AWTFactorial extends Frame implements ActionListener {
   private Label lbln;     
   private Label lblfacto;
   private TextField tfn;  
   private TextField tfacto;
   private Button btnfacto;    
   private int f = 0;      
   private int sum;
   
   // Constructor to setup UI components
   public AWTFactorial () {
      setLayout(new FlowLayout());
         // "this" Frame sets layout to FlowLayout, which arranges
         //  Components from left-to-right, then top-to-bottom.
 
      lbln = new Label("n"); // allocate Label instance
      add(lbln);                   // "this" Frame adds Label
 
      tfn = new TextField(10); // allocate
      tfn.setEditable(true);       
      add(tfn);                     
 
      lblfacto = new Label("factorial(n)"); // allocate Label instance 2
      add(lblfacto);                   // "this" Frame adds Label2
 
      tfacto = new TextField(10); // allocate
        tfacto.setEditable(false);
      add(tfacto);
      
      btnfacto = new Button("facto");   // allocate Button instance
      add(btnfacto);                    // "this" Frame adds btnfacto
      btnfacto.addActionListener(this);
         // btnfacto is a source that fires ActionEvent when clicked.
         // The source add "this" object as a listener, which provides
         //  the ActionEvent handler called actionPerformed().
         // Clicking btnfacto invokes actionPerformed().
 
      setSize(250, 100);       // "this" Frame sets initial size
      setTitle("Factorial convertor"); // "this" Frame sets title
      setVisible(true);        // show "this" Frame
   }
 
   // ActionEvent handler - Called back when the button has been clicked.
   @Override
   public void actionPerformed(ActionEvent evt) {
     f= Integer.parseInt(tfn.getText());    
     sum=1;   // get the input 
     for(int i=1; i<f; i++){
         sum+=sum*i;
         
     }
      // f=0;
       tfn.setText("");
      tfacto.setText(" " + sum); // display on the TextField
                                   // setText() takes a String
   }
 
   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor by allocating an anonymous instance
      new AWTFactorial();
   }
}
