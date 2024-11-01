/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myproject;

/**
 *
 * @author codyc
 */
public class MyProject {
    
    public double calculation(double weight, int feet, double inches){
        double height = (feet * 12) + inches;
        return round(((weight * 703) / (Math.pow(height, 2))), 1);
     }
    
    private static double round (double value, int precision) {
    int scale = (int) Math.pow(10, precision);
    return (double) Math.round(value * scale) / scale;
}
}
