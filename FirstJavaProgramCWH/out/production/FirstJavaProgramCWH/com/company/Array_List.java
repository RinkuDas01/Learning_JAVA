package com.company;
import java.util.*;
public class Array_List {
    public static void main(String[] args) {
      ArrayList<Integer> l1=new ArrayList<>();
      ArrayList<Integer> l2=new ArrayList<>(5);
        l2.add(51);
        l2.add(61);
        l2.add(59);
       l1.add(6);
       l1.add(7);
       l1.add(4);
       l1.add(0,1);
       l1.add(0,5);
       l1.addAll(l2);
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(7));
        l1.set(1,522);
       for(int i=0;i<l1.size();i++){
           System.out.print(l1.get(i));
           System.out.print(",");
       }




    }
}
