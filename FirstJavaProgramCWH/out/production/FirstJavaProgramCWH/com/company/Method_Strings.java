package com.company;

import java.util.Locale;

public class Method_Strings {
    public static void main(String[] args) {
        // write your code here
        String name="Rinku";
        System.out.println(name);
        int value=name.length();
        System.out.println(value);
        String lstring=name.toLowerCase();
        System.out.println(lstring);
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        String nonTrimmedString= "     Rinku      ";
        System.out.println(nonTrimmedString);
        String TrimmedString=nonTrimmedString.trim() ;
        System.out.println(TrimmedString);
        System.out.println(name.substring(2));//index number 2to end
        System.out.println(name.substring(1,4));//index number 1to 3
        System.out.println(name.replace("i","a"));
        System.out.println(name.replace("n","ch"));
        System.out.println(name.startsWith("Rin"));
        System.out.println(name.endsWith("Ri"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("i"));
        String modifiedName="rinkunku";
        System.out.println(modifiedName.indexOf("nku"));
        System.out.println(modifiedName.indexOf("nku",3));
        System.out.println(modifiedName.lastIndexOf("nku"));
        System.out.println(name.equals("Rinku"));
        System.out.println(name.equals("rinku"));
        System.out.println(name.equalsIgnoreCase("rINku"));







    }
}
