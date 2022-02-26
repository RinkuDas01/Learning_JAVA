package com.company;

public class Operators {
    public static void main(String[] args) {
        // write your code here
        //Arithmetic operator
        int a= 3;
        int b= 10*a;
        System.out.println(b);
        // Modulo Operator
        int c= 3;
        int d= 10%c;
        System.out.println(d);

        int e=9;
        e+=4;
        System.out.println(e);
        System.out.println(e>6); //comparison operator
        System.out.println(e==6);//comparison operator
        System.out.println(64>6 && 64>8); //and (logical operator)
        System.out.println(64>6 || 64>100); //or (logical operator)
        System.out.println(2&3); //Bitwise operator

    }
}
