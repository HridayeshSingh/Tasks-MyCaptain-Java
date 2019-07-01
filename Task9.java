/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

import java.util.Scanner;

/**
 *
 * @author Hridayesh Singh
 */
public class Task9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Task9 obj = new Task9();
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("The smallest number is : "+obj.smallest(a,b,c));
    }
    
    int smallest(int n1, int n2, int n3)
    {
        int min = n1;
        if(n2<min)
            min = n2;
        if(n3<min)
            min = n3;
        return min;
    }
}
