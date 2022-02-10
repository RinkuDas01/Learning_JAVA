package com.company;

import java.util.Scanner;

public class Swap_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr={1,2,3,4,5,6};
        int l= arr.length;
        int temp;
        int n=Math.floorDiv(l, 2);
        //System.out.println(n);
        for(int i=0; i<=n; i++){
            //swap a[i] and a[l-1-i]
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for(int element: arr){
            System.out.print(element+" ");
        }
    }
}
