package com.company;

import java.util.Scanner;

public class Else_If_SwitchCase {
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age =sc.nextInt();
//        if(age>=56){             //Else If
//        System.out.println("You are experienced.");}
//        else if(age>=46){
//            System.out.println("You are semi-experienced.");}
//        else if(age>=32){
//            System.out.println("You are semi-semi-experienced.");}
//        else{
//        System.out.println("You are not experienced.");}

//        switch(age){           //Enhanced switch
//            case 18 ->{
//                System.out.println("You are going to become an adult.");
//                System.out.println("You are going to become an adult.");
//                System.out.println("You are going to become an adult.");}
//                //break;
//            case 24 ->{
//                System.out.println("You are going to join a job.");}
//                //break;
//            case 60->{
//                System.out.println("You are going to get retired.");}
//                //break;
//            default->{
//                System.out.println("Enjoy your life.");}
//
//        }
        switch(age){              //Switch Case
            case 18:
               System.out.println("You are going to become an adult.");
               break;
            case 24:
                System.out.println("You are going to join a job.");
                break;
            case 60:
                System.out.println("You are going to get retired.");
                break;
            default:
                System.out.println("Enjoy your life.");

        }
        System.out.println("Thanks for visiting my JAVA code.");
    }
}
