package com.company;
abstract class Parent2{
    public Parent2(){
        System.out.println("I'm a constructor of parent2.");
    }
    public void sayHello(){
        System.out.println("Hello.");
    }
    abstract public void greet();
}
class child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning.");
    }
}
abstract class child3 extends Parent2{
    public void th(){
        System.out.println("Good Afternoon.");
    }
}
public class Abstract {
    public static void main(String[] args) {
        child2 c=new child2();
    }
}
