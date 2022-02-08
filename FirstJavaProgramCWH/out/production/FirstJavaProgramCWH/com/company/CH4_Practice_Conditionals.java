package com.company;

import java.util.Scanner;

public class CH4_Practice_Conditionals {
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);

        //Problem-2 (Chapter-4)
        System.out.print("Enter Your Marks in Bengali : ");
        int ben=sc.nextInt();
        System.out.print("Enter Your Marks in English : ");
        int eng=sc.nextInt();
        System.out.print("Enter Your Marks in Maths : ");
        int maths=sc.nextInt();
        float avg=(ben+eng+maths)/3.0f;
        System.out.print("Avg Marks= ");
        System.out.println(avg);

        if(avg>=40 && ben>=33 && eng>=33 && maths>=33){
            System.out.println("Congratulations! You have been promoted.");
        }
        else{
            System.out.println("Sorry, You not have been promoted.");
        }

        //problem-3 is in Pay_Tax_Calculator
        //problem-4
        System.out.print("Enter a number from 1 to 7 : ");
        int day=sc.nextInt();
        switch (day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tueday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
        }
        //Problem-5 is in Leap_Year_or_not
        //Problem-6
        System.out.print("Enter your website name: ");
        String webname= sc.next();
        if(webname.endsWith(".org")){
            System.out.println("This is a Organisational Website.");
        }
        else if(webname.endsWith(".com")){
            System.out.println("This is a Commercial Website.");
        }
        else if(webname.endsWith(".in")){
            System.out.println("This is a Indian Website.");
        }



    }
}
