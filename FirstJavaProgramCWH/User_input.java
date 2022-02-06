package com.company;
import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        // write your code here
//        Scanner sc= new Scanner(System.in);
//        String str= sc.next();
//        System.out.println(str);
        System.out.println("Taking input from the user");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number1 = ");
//        int a= sc.nextInt();
        float a= sc.nextFloat();
        System.out.print("Enter Number2 = ");
//        int b= sc.nextInt();
        float b= sc.nextFloat();
//        int sum= a+b;
        float sum= a+b;
        System.out.print("Sum of the numbers = ");
        System.out.println(sum);



    }
}
