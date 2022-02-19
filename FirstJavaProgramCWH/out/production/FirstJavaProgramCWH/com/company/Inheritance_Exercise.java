package com.company;

class Animal{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I'm an animal.");
        this.x=x;
    }
}
class Dog extends Animal{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y){
        System.out.println("I bark.");
        this.y=y;
    }
}
public class Inheritance_Exercise {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.setX(1);
        System.out.println(a.getX());
        Dog d=new Dog();
        d.setY(2);
        System.out.println(d.getY());
        
    }
}
