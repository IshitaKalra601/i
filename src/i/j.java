/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i;

/**
 *
 * @author jyoti
 */
public class j {
    public double radius;
    public double circleArea(){
        return 3.14*radius*radius;
    }
    public String toString(){
        return "The area of circle of radius " + radius + " is " + circleArea();
    }
}
