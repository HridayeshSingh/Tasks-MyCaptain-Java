/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

import java.util.Scanner;

/**
 *
 * @author Hridayesh Singh
 */
public class Task6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer :");
        num = sc.nextInt();
        if(num>0)
            System.out.println("The integer is POSITIVE");
        else if(num<0)
            System.out.println("The integer is NEGATIVE");
        else
            System.out.println("The integer is ZERO");
    }
    
}
