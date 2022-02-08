package com.company;

import java.util.Scanner;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper , 2 for Scissor:  ");
        int game=sc.nextInt();
        int min=0;
        int max=2;
        //Generate random int value from 0 to 2
        System.out.print("Computer Value "+min+" to "+max+ ": ");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
        //condition
        if(game==0 && b==1){
            System.out.println("Defeat");
        }
        else if(game==0 && b==2){
            System.out.println("Victory");
        }
        else if(game==1 && b==2){
            System.out.println("Defeat");
        }
        else if(game==1 && b==0){
            System.out.println("Victory");
        }
        else if(game==2 && b==0){
            System.out.println("Defeat");
        }
        else if(game==2 && b==1){
            System.out.println("Victory");
        }
        else if(game==b){
            System.out.println("Try Again");
        }


    }
}
