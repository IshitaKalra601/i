/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i;

/**
 *
 * @author jyoti kalra
 */
public class I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        k a = new k();
        a.radius = 1 ;
        a.height = 1;
        System.out.println(a.toString());
        System.out.println("The area of cylinder with height " + a.height +"and radius " + a.radius + "is " + a.areaCylinder());
    }
    
}
