package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");

        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(sc.nextLine());

        int sum = num1 + num2;
        System.out.println("Sum of the two numbers is: " + sum);

        sc.close();
    }
}
