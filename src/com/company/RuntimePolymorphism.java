package com.company;

class Parent {

    void Print()
    {
        System.out.println("parent class");
    }

    void display(){
        System.out.println("display");
    }
}

class subclass1 extends Parent {

    void Print()
    {
        super.Print();
        System.out.println("subclass1");
    }
}

class subclass2 extends Parent {

    // abstract void fly();

    void Print()
    {
        System.out.println("subclass2");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args)
    {

        Parent a;

        a = new subclass1();
        a.Print();
        a.display();

        a = new subclass2();
        a.Print();
    }

}
