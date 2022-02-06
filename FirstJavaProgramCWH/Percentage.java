package com.company;
import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter your marks out of 100");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your marks of Bengali = ");
        float a= sc.nextFloat();
        System.out.print("Enter your marks of English = ");
        float b= sc.nextFloat();
        System.out.print("Enter your marks of Maths = ");
        float c= sc.nextFloat();
        System.out.print("Enter your marks of Bio = ");
        float d= sc.nextFloat();
        System.out.print("Enter your marks of Chemistry = ");
        float e= sc.nextFloat();
        float sum= a+b+c+d+e;
        System.out.print("Sum of the numbers = ");
        System.out.println(sum);
        float percentage= (a+b+c+d+e)*100/500;
        System.out.print("percentage is = ");
        System.out.print(percentage);
        System.out.print("%");



    }
}
