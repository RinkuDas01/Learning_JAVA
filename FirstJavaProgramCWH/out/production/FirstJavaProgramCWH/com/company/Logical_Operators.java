package com.company;

public class Logical_Operators {
    public static void main(String[] args) {
        // write your code here
        System.out.println("For logical AND");
        boolean a=true;
        boolean b=true;
        boolean c=true;
        if(a && b && c){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println("For logical OR");
        boolean a1=true;
        boolean b1=false;
        boolean c1=true;
        if(a1 || b1 || c1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        //For Logical NOT
        System.out.print("not(a) is ");
        System.out.println(!a);
        System.out.print("not(b) is ");
        System.out.println(!b);



    }
}
