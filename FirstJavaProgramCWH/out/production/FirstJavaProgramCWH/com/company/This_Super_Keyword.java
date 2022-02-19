package com.company;

class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass (int v){
        this.a=v;
    }
    public int returnOne(){
        return 1;
    }
}
 class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("Main ek constructor hoon.");
    }

}
public class This_Super_Keyword {
    public static void main(String[] args) {
        EkClass e=new EkClass(5);
        System.out.println(e.getA());
        DoClass d=new DoClass(45);
        System.out.println(d.getA());


    }
}
