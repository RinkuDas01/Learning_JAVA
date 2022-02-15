package com.company;

public class CH7_Practice {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d= %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static int sumRect(int n){
        if(n==1){
            return 1;
        }
            return n+sumRect(n-1);
    }
    static void pattern2(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        //Short cut
//        if(n==1 || n==2){
//        return n-1;
//        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    static float avg(float a,float b,float c){
        return (a+b+c)/3;
    }
    static float temp(float n){
        return n *(9/5f) + 32;

    }

    public static void main(String[] args) {
        //Problem-1
        multiplication(7);
        //Problem-2
        pattern1(4);
        //Problem-3
        int c=sumRect(3);
        System.out.println(c);
        //Problem-4
        pattern2(4);
        //Problem-4 (Fibonacci Series= 0,1,1,2,3,5,8,13....)
        int result=fib(5);
        System.out.println(result);
        //Problem-5
        System.out.println("The avg of the numbers is="+avg(90,89,95));
        //Problem-9
        //(0°C × 9/5) + 32 = 32°F
        float d=temp(12);
        System.out.println("The Temp is= "+d+"F");




    }

}
