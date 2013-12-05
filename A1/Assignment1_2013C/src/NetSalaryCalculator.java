

import javax.swing.JApplet;

/**
 *
 * @author v90207
 */
import java.awt.*;         // Using AWT containers and components
import java.awt.event.*;   // Using AWT events and listener interfaces
 
// An AWT GUI program inherits the top-level container Frame
public class NetSalaryCalculator extends Frame implements ActionListener {
   private Label lblName;     
   private Label lblState;
   private Label lblwHours;
   private Label lblPayRate;
   private Label lblFedTax;
   private Label lblStateTax;
   private Label lblNetSalary;
   private TextField name;  
   private TextField state;
   private TextField hours;  
   private TextField payRate;
   private TextField fedTax;  
   private TextField stateTax;
   private TextField netSalary;
   private Button calcButton; 
   double fTax = 0.2; // to find the federak tax in amount from gross salary
   double sTax = 0;  // to find the state tax in amount from gross salary
     // you are allowed to add more variables here if necessary
   
   // Constructor to setup UI components
   public NetSalaryCalculator () {
      setLayout(new FlowLayout());
         // "this" Frame sets layout to FlowLayout, which arranges
         //  Components from left-to-right, then top-to-bottom.
 
      lblName = new Label("Employee Name"); // allocate Label instance
      add(lblName);                   // "this" Frame adds Label
 
      name = new TextField(20); // allocate textfield
      name.setEditable(true);       
      add(name);                     
 
      
      lblState = new Label("State [AK/HI/VA] "); // allocate Label instance
      add(lblState);                   // "this" Frame adds Label
   
      state = new TextField(2); // allocate textfield
      state.setEditable(true);       
      add(state);  
      
      lblwHours = new Label("Number of Hours worked in a week"); // allocate Label instance
      add(lblwHours);                   // "this" Frame adds Label
 
      hours = new TextField(2); // allocate textfield
      hours.setEditable(true);       // true means the user can enter/edit the value
      add(hours);  
      
      
      lblPayRate = new Label("Hourly pay rate"); // allocate Label instance
      add(lblPayRate);                   // "this" Frame adds Label
 
      payRate = new TextField(20); // allocate textfield
      payRate.setEditable(true);       
      add(payRate);  
      
     
      calcButton = new Button("Calculate");   // allocate Button instance
      add(calcButton);                    // "this" Frame adds btnCount
      calcButton.addActionListener(this);
      
      lblFedTax = new Label("Federal Tax"); // allocate Label instance
      add(lblFedTax);                   // "this" Frame adds Label
 
      fedTax = new TextField(20); // allocate textfield
      fedTax.setEditable(false);       
      add(fedTax); 
      
      
      lblStateTax = new Label(" State Tax"); // allocate Label instance
      add(lblStateTax);                   // "this" Frame adds Label
 
      stateTax = new TextField(20); // allocate textfield
      stateTax.setEditable(false);       
      add(stateTax); 
      
      
      lblNetSalary = new Label(" Net salary"); // allocate Label instance
      add(lblNetSalary);                   // "this" Frame adds Label
 
      netSalary = new TextField(20); // allocate textfield
      netSalary.setEditable(false);       
      add(netSalary); 
      
      
 
      setSize(250, 100);       // "this" Frame sets initial size
      setTitle(" Employee Salary Calculator"); // "this" Frame sets title
      setVisible(true);        // show "this" Frame
   }
 
  @Override
   public void actionPerformed(ActionEvent evt) {
      // finding gross salary here
        double gSalary =Double.parseDouble(hours.getText()) * Double.parseDouble(payRate.getText());
             
      // finding the Federal Tax - your code here
         
       // finding the State tax
          
      
     // find the net Salary  
       
       
	   
	   // displaying the output
	   
       
          }
 
   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor by allocating an anonymous instance
      new NetSalaryCalculator();
   }
}
