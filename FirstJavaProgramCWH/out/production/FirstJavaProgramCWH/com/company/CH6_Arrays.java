package com.company;

import java.util.Scanner;

public class CH6_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int [] marks=new int[5]; //Declaration & memory allocation
//        int [] marks;  //Declaration
//        marks=new int[5];  // memory allocation
//        marks[0]=100;  // initialization
//        marks[1]=70;
//        marks[2]=90;
//        marks[3]=78;
//        marks[4]=67;
        // Declaration & memory allocation & initialization together
        int [] marks={98,75,99,76,59};
        //System.out.println(marks.length);
        //float [] number={98.1f,75.0f,99.5f,76.6f,59.5f};
        //System.out.println(number.length);
//        String [] name={"suresh","raju","rohan","komal"};
//        System.out.println(name[3]);
//        System.out.println(name.length);
        //Displaying the array
        System.out.println("Printing using for loop:");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        //Displaying the array in reverse order
        System.out.println("Printing using for loop:");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        //Displaying the array (for-each loop)
        System.out.println("Printing using for-each loop:");
        for(int element: marks){
            System.out.println(element);
        }


    }
}
