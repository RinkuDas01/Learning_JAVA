package com.company;
class MyEmployee{
    int id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String n){
        name=n;
    }
    public int setId(int i){
        id=i;
        return i;
    }

    public int getId() {
        return id;
    }
}

public class CH9_Access_Modifiers_Getters_Setters {
    public static void main(String[] args) {
      MyEmployee rinku=new MyEmployee();
//      rinku.id=45;       //Throws an error due to private access modifier
//      rinku.name="Rinku Das.";
      rinku.setName("Rinku Das.");
        System.out.println(rinku.getName());
        rinku.setId(45);
        System.out.println(rinku.getId());

    }
}
