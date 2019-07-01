/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author Hridayesh Singh
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0, carry=0;
        long b1, b2;
        int sum[] = new int[50];
        System.out.println("Enter two binary numbers :");
        b1 = sc.nextLong();
        b2 = sc.nextLong();
        while (b1 != 0 || b2 != 0) 
	{
		sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
		carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
		b1 = b1 / 10;
		b2 = b2 / 10;
	}
	if (carry != 0) {
		sum[i++] = carry;
	}
	--i;
	System.out.println("Sum of the two binary numbers is :");
	while (i >= 0) {
		System.out.print(sum[i--]);
	}
	System.out.println();  
    }
    
}
