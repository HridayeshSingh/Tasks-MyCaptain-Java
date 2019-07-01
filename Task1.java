/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author Hridayesh Singh
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        float per, area;
        System.out.println("Enter the side of the circle:");
        r = sc.nextInt();
        per = (float) (2*3.14*r);
        area = (float) (3.14*r*r);
        System.out.println("Perimeter of the circle is : "+per);
        System.out.println("Area of the circle is : "+area);
    }
    
}
