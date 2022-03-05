package com.company;
import java.util.Scanner;

public class CH2_Practice {
    public static void main(String[] args) {
        // write your code here
//        System.out.println("Hello World");
        Scanner sc= new Scanner(System.in);

        //problem-1
        float m= 7/4f*9/2f;
        System.out.print("m = ");
        System.out.println(m);

        //problem-2
        char grade='b';
        grade=(char)(grade+8);
        System.out.println(grade);
        //Decrypting the grade
        grade=(char)(grade-8);
        System.out.println(grade);

        //problem-3
        System.out.print("Enter a number = ");
        int c= sc.nextInt();
        System.out.println(c>65);

        //problem-4
        System.out.print("Enter the value of v = ");
        int v= sc.nextInt();
        System.out.print("Enter the value of u = ");
        int u= sc.nextInt();
        System.out.print("Enter the value of a = ");
        int a= sc.nextInt();
        System.out.print("Enter the value of s = ");
        int s= sc.nextInt();

        int x=((v*v)-(u*u))/(2*a*s);
        System.out.print("The value is = ");
        System.out.print(x);





    }
}
