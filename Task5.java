/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

import java.util.Scanner;

/**
 *
 * @author Hridayesh Singh
 */
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long mins;
        int days, years;
        System.out.println("Enter the number of minutes :");
        mins = sc.nextLong();
        days = (int) (mins/(24*60));
        years = days/365;
        days %= 365;
        System.out.println(mins+" is approximately "+years+" years and "+days+" days.");
    }
    
}
