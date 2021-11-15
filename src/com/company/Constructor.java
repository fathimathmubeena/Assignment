package com.company;

public class Constructor {
    String name;
    int age;
    Constructor(){
        System.out.println("This is no-arg constructor");
        System.out.println("---------------");
    }
    Constructor(String myName){
        name=myName;
        System.out.println("Constructor with single parameter");
        System.out.println("My name is "+name);
        System.out.println("---------------");
    }
    Constructor(String myName,int myAge){
        name=myName;
        age=myAge;
        System.out.println("Constructor with two parameters");
        System.out.println(name+"'s age is "+age);
        System.out.println("---------------");
    }

    void bornIn(){
        System.out.println(name+" born in "+(2021-age));
    }

    public static void main(String[] args){
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("Kavya");
        Constructor c3 = new Constructor("Kavya",20);
        c3.bornIn();
    }
}
