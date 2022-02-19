package com.company;

class Base1{
    Base1(){
        System.out.println("I am a constructor.");
    }
    Base1(int a){
        System.out.println("I am a over loaded constructor with base value of a "+a);
    }
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I'm a derived class constructor.");
    }
    Derived1(int a,int b){
        super(a);
        System.out.println("I'm a derived class constructor with the value of b "+b);
    }
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
public class Constructors_Inheritance {
    public static void main(String[] args) {
        Base1 b=new Base1();
        Derived1 c=new Derived1(12,14);

    }
}
