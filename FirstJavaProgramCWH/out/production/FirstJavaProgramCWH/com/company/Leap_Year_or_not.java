package com.company;

import java.util.Scanner;

public class Leap_Year_or_not {
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year=sc.nextInt();
        if(year%100!=0 && year%4==0 && year%400!=0){
            System.out.println("This is a leap year.");
        }
        else if(year%100!=0 && year%4!=0 && year%400!=0){
            System.out.println("This is not a leap year.");
        }
        else if(year%400==0 && year%100!=0 && year%4==0){
            System.out.println("This is a leap year.");
        }
        else if(year%400==0 && year%100==0 && year%4==0){
            System.out.println("This is a leap year.");
        }
        else{
            System.out.println("This is not a leap year.");
        }

    }
}
