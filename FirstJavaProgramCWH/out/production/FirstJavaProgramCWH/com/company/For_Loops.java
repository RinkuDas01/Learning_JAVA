package com.company;

import java.util.Scanner;

public class For_Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//        }
        // 2i=Even Numbers
        //2i+1=Odd Numbers
//        System.out.print("n = ");//how many odd numbers do you want to generate
//        int n= sc.nextInt();
//        for(int i=0; i<=n ; i++){
//            System.out.println(2*i+1);
     //   }
//        for(int i=7;i>0;i--){
//            System.out.println(2*i);
//        }
        System.out.print("n = ");//how many odd numbers do you want to generate
        int n= sc.nextInt();
        for(int i=n; i>0 ; i--){
            System.out.println(2*i-1);
        }

    }
}
