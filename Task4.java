/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.Scanner;

/**
 *
 * @author Hridayesh Singh
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float inch, meter;
        System.out.println("Enter a number in inches :");
        inch = sc.nextFloat();
        meter = (float) (inch*0.0254);
        System.out.println("Entered number in meters is : "+meter);
    }
    
}
