package com.company;

public class Break_Continue_Using_Loops {
    public static void main(String[] args) {
//        for(int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is great.");
//            if(i==2){
//                System.out.println("Ending the loop.");
//                break;
//            }
//        }
        for(int i=0;i<5;i++){
            if(i==2){
                System.out.println("Ending the loop.");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great.");
        }


//        int i=0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("Java is great.");
//            if(i==2){
//                System.out.println("Ending the loop.");
//                break;
//            }
//            i++;
//        }
    }
}
