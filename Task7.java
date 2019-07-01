/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

import java.util.Scanner;

/**
 *
 * @author Hridayesh Singh
 */
public class Task7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col, i, j;
        System.out.print("Enter number of rows in the matrix : ");
        row = sc.nextInt();
        System.out.print("Enter number of columns in the matrix : ");
        col = sc.nextInt();
        int m1[][] = new int[row][col];
        int m2[][] = new int[row][col];
        int sum[][] = new int[row][col];
        System.out.println("Enter the numbers of first matrix :");
        for(i=0;i<row;i++)
            for(j=0;j<col;j++)
                m1[i][j] = sc.nextInt();
        System.out.println("Enter the numbers of second matrix :");
        for(i=0;i<row;i++)
            for(j=0;j<col;j++)
            {
                m2[i][j] = sc.nextInt();
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        System.out.println("Sum of the two matrices is :");
        for(i=0;i<row;i++)
        {    
            for(j=0;j<col;j++)
                System.out.print(sum[i][j]+"  ");
            System.out.println();
        }
    }
}
