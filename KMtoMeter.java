package com.company;
import java.util.Scanner;
public class KMtoMeter {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a distance in KM= ");
        float a= sc.nextFloat();
        float meter= a*1000;
        System.out.print("The distance is= ");
        System.out.print(meter);
        System.out.print(" meter");



    }
}
