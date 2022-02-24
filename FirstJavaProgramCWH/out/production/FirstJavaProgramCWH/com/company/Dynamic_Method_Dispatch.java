package com.company;

class One{
    public void greet(){
        System.out.println("Good Morning.");
    }
    public void on(){
        System.out.println("Turning on your phone.");
    }
}
class Two extends One{
    public void swagat(){
        System.out.println("Apka swagat hain.");
    }
    public void on(){
        System.out.println("Turning on your phone.");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        One obj=new One();
//        Two newobj=new Two();
//        obj.name();

        One obj=new Two();
        obj.greet();
        obj.on();

    }
}
