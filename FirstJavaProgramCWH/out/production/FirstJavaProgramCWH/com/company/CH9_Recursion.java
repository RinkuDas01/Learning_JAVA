package com.company;

public class CH9_Recursion {
    static int factorial(int n){
        //factorial (0)=1
        //factorial n= n* factorial(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }


    }
    static int factorial_iterative(int n){
        //factorial (0)=1
        //factorial n= n* factorial(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i = 1; i <= n;i++){
                product = product * i;
            }
            return product;
        }


    }
    public static void main(String[] args) {
        int x=5;
        System.out.println("The value of factorial is="+ factorial(x));
        System.out.println("The value of factorial is="+ factorial_iterative(x));
    }
}
