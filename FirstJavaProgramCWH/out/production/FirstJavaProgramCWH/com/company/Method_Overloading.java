package com.company;

public class Method_Overloading {
    static void foo(){
        System.out.println("Good morning ,bro!");
    }
    static void foo(int a){
        System.out.println("Good morning"+a+"bro!");
    }
    static void foo(int a,int b){     // Parameters=a and b
        System.out.println("Good morning"+a+"bro!");
        System.out.println("Good morning"+b+"bro!");
    }
    static void change(int a){
        a=98;
    }
    static void change2(int []arr){
        arr[0]=98;
    }

    static void telljoke(){
        System.out.println("I invented a new word!\n"+"Plagarism");

    }
    public static void main(String[] args) {
        //telljoke();
        int [] marks={12,14,19,27,39};
        change2(marks);
        System.out.println("The value of x after rinning change is= "+marks[0]);

//        Method overloading
        foo();
        foo(3000);//arguments
        foo(3000,4000); //arguments


    }




}

