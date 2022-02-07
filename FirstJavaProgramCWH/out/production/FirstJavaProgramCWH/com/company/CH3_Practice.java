package com.company;
import java.util.Scanner;

public class CH3_Practice {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        //Problem-1
        System.out.print("Enter Your Name : ");
        String name= sc.next();
        System.out.println(name.toLowerCase());

        //Problem-2
        String text="harry is my friend";
        System.out.println(text.replace(" ","_"));

        //problem-3
        System.out.print("Enter Your Name : ");
        String name1= sc.next();
        String letter="Dear <|name|>,Thanks a lot.";
        System.out.println(letter.replace("<|name|>",name1));

       //Problem-4
        String mystring="The string contains double and  triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //Problem-5
        String mine="Respected Sir,\n\t Here is my submission.\tThanks.";
        System.out.println(mine);












    }
}
