package com.company;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age= sc.nextInt();
        if(age>=18){
        System.out.println("Yes,You can drive.");}
        else{
            System.out.println("Sorry,You cann't drive yet.");

        }

    }
}
