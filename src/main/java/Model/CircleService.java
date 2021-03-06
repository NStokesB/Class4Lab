/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author NStokesBeamon
 */
public class CircleService {
    private double radius;
    private String area;
    private final String ERROR_MSG = "Please Try Again";
    
    
    public CircleService(String radius) throws IllegalArgumentException {
        if(radius.isEmpty()){
            throw new IllegalArgumentException(ERROR_MSG);
        }
        this.radius = Double.parseDouble(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
     private String calculateArea(){
        area = (Math.PI * Math.pow(radius, 2) + "");
        return area;
    }
    
    public String getCalculatedArea(){
        calculateArea();
        return "The area of a Circle with a radius of " + radius + " is " + area + ".";
    }
    
}
