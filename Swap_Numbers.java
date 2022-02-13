package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[]arr={1,2,3,4,5,6};
//        int l= arr.length;
//        int temp;
//        int n=Math.floorDiv(l, 2);
//        //System.out.println(n);
//        for(int i=0; i<=n; i++){
//            //swap a[i] and a[l-1-i]
//            temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//        for(int element: arr){
//            System.out.print(element+" ");
//        int a = 10 ;
//        int b = 20 ;
//        int temp = a ;
//        a = b ;
//        b = temp ;
//        System.out.println(a + " " + b);
        int [] arr = {8 , 90 , 76 , 55};
        //    = [0 ,  1 ,  2 ,  3 , 4]
            //= [0 , 1 , 2 ........ , n-3,n-2,n-1]
            //= [i , n - i - 1]

        for (int i = 0 ; i < arr.length/2 ; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}
