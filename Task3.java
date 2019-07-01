/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Hridayesh Singh
 */

import java.util.Scanner;

public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, temp, sum=0;
        System.out.println("Enter a number :");
        num = sc.nextInt();
        temp = num;
        while(temp!=0)
        {
            sum += temp%10;
            temp /= 10;
        }
        System.out.println("Sum of the digits of "+num+" is : "+sum);
    }
    
}
