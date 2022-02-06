package com.company;
import java.util.Scanner;
public class Increment_Decrement_Operators {
    public static void main(String[] args) {
        // write your code here
        //System.out.print("Enter input from the user : ");
        Scanner sc= new Scanner(System.in);
//        int i= sc.nextInt();
//        System.out.println(i++);
//        System.out.println(i);
        int i = 0 ;
        int j = 0 ;
        System.out.println(i++ + j++) ;
        System.out.println(i + j) ;
        System.out.println(++i + ++j) ;
        System.out.println(i + j) ;
        char ch= 'a';
        System.out.println(++ch) ;


    }
}
