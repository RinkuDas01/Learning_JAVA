package com.company;

import java.util.Scanner;

public class CH5_Practice_Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Problem No-1
//        int n = 4;
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
        //Example
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=i;j>0;j--){
//            System.out.print("*");}
//            System.out.print("\n");
//        }

        //Problem-2
//        System.out.print("Enter the value of n : ");
//        int n= sc.nextInt();
//        int i=0;
//        while(i<n){
//            System.out.print(2*i);
//            System.out.print("\t");
//            i++;
//        }
//        System.out.print("sum= ");
//        System.out.println(i*(i+1));

        //Problem-4
//        System.out.print("Enter a number: ");
//        int n= sc.nextInt();
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }

        //Problem-9
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.printf("%d\t",n*i);
            sum=sum+(n*i);
        }
        System.out.printf("\nSum= %d",sum);
    }
}
