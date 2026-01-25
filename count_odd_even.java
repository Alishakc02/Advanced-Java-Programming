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
public class odd_even {
    public static void main(String[] args)
    {
        System.out.println("Enter a large number:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int even=0,odd=0;
        for(int i=0; i<str.length();i++)
        {
            int num= Integer.parseInt(str.charAt(i)+"");
            if(num%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
       
        }
         System.out.println("Even="+even);
        System.out.println("Odd="+odd);
    }
    
}
