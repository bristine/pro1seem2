/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s3445682
 */
public class Circle {
    private double radius;
    public void getArea(){
        double area = 3.14*radius*radius;
        System.out.println("Area: " + area);
    }
    public void setRadius(double y) {
        radius = y;
    }
    public double getRadius(){
        return radius;
    }
}
