package com.company;
import java.util.Scanner;

public class Greets {
    public static void main(String[] args) {
        // write your code here
//        System.out.println("Enter your name here : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name here : ");
        String str = sc.next();
        System.out.print("Hello ");
        System.out.print(str);
        System.out.print(",Good Morning.");


    }
    }
