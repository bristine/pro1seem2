/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s3445682
 */
public class Employee {
    private String name;
    private int id;
    private double grossSalary, tax,netSalary;
    
    public Employee(String na, int idno,double grs){
        name = na;
        id = idno;
        grossSalary = grs;
    }
    public void setGrossSalary(double gs){
        grossSalary = gs;
    }
    
    public double getGrossSalary() {
        return grossSalary;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }
    
    public void setId(int i){
        id = i;
    }
    
    public int getId() {
        return id;
    }
    
    public double setTax () {
        if(grossSalary < 1000) tax = grossSalary*0.1;
        else if(grossSalary >= 1000 && grossSalary < 5000) tax = grossSalary*0.15;
        else tax = grossSalary*0.2;
        return tax;
    }
    
    public double calNetSalary() {
        netSalary = grossSalary - setTax();
        return netSalary;
        
    }
    
    
}
