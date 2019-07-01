 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10;

import java.util.Scanner;

/**
 *
 * @author Hridayesh Singh
 */
public class Task10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cube;
        System.out.println("Input number of terms : ");
        num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            cube = i*i*i;
            System.out.println("Number is : "+i+" and cube of "+i+" is : "+cube);
        }
    }
    
}
