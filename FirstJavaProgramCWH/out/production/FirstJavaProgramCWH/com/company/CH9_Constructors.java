package com.company;

class MyMainEmployee{
    int id;
    String name;
//    public MyMainEmployee(){
//        id=48;
//        name="DS Gadhi.";
//    }
    public MyMainEmployee(String myName, int myId){
        id=myId;
        name=myName;
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        name=n;
        return n;
    }
    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }
}

public class CH9_Constructors {
    public static void main(String[] args) {
        MyMainEmployee rinku=new MyMainEmployee("Gairik Sajjan.",12);
//        rinku.setName("Rinku Das."); //Don't need to write it everytime
//        rinku.setId(350);
        System.out.println(rinku.getName());
        System.out.println(rinku.getId());

    }
}
