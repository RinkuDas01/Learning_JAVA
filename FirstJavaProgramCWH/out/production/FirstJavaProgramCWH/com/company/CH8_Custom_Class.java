package com.company;

class Employee{
    String name;
    int age;
    int salary;
public void printDetails(){
    System.out.println("The employee "+name+".");
    System.out.println(name+"'s age is "+age+".");
}

    public int getSalary() {
        return salary;
    }
}

public class CH8_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class.");
        Employee Rinku=new Employee();//Instantiating a new employee object
        Employee John=new Employee();
        //Setting Attributes for Rinku
        Rinku.name="Rinku Das";
        Rinku.age=20;
        Rinku.salary=18;
        //Setting Attributes for John
        John.name="john Singh";
        John.age=26;
        John.salary=20;

        //Printing the attributes
        Rinku.printDetails();
        John.printDetails();
        int salary=John.getSalary();
        System.out.println(salary);
//        System.out.println(Rinku.name);
//        System.out.println(Rinku.age);
    }
}
