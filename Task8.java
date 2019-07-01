/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task8;

import java.util.Scanner;

/**
 *
 * @author Hridayesh Singh
 */
public class Task8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Task8 obj = new Task8();
        Scanner sc = new Scanner(System.in);
        String str;
        int vowels;
        System.out.println("Enetr a string :");
        str = sc.nextLine();
        vowels = obj.countVowels(str);
        System.out.println("Number of vowels in the entered string is : "+vowels);
    }
    
    int countVowels(String s)
    {
        int i, count=0;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                count++;
        }
        return count;
    }
}
