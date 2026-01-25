
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;

/**
 *
 * @author Nagarjuna 10
 */
public class java {
    public static void main(String[] args)
    {
        System.out.println("Enter a string:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int v=0, c=0;
        for(int i =0; i<str.length();i++)
        {
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
        {
            v++;
        }
        else
        {
            c++;
        }
        }
        System.out.println("Vowel ="+v);
        System.out.println("Consonant ="+c);
    
    }
}
