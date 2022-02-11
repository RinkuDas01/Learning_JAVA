package com.company;
import java.util.Scanner;

public class Pay_Tax_Calculator {
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        //Problem-3
        System.out.print("Enter Your income in LPA= ");
        float income=sc.nextFloat();
        float tax=0.0f;
        if (income<2.5){
            tax=tax+0;
            System.out.println("You don't have to pay any tax.");
        }
        else if (income>2.5 && income<=5){
            tax=tax+.05f*(income-2.5f);
            System.out.print("You have to pay tax "+tax);
            System.out.print("Lakh.");
        }
        else if (income>5 && income<=10){
            tax=tax+.05f* (5.0f-2.5f);
            tax=tax+.2f*(income-5.0f);
            System.out.print("You have to pay tax "+tax);
            System.out.print("Lakh.");
        }
        else if (income>10 ){
            tax=tax+.05f* (5.0f-2.5f);
            tax=tax+.2f*(10.0f-5.0f);
            tax=tax+.3f*(income-10.0f);
            System.out.print("You have to pay tax "+tax);
            System.out.print("Lakh.");
        }
//
    }
}
