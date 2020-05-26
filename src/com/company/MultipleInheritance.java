package com.company;


interface one
{
    default void print(){
        System.out.println("Start counting");
    }

    void print_geek();
}

interface two
{
    void print_for();
}

interface three extends one,two
{
    void print_geek();
}

class child implements three
{
    @Override
    public void print_geek() {
        System.out.println("Geeks");
    }

    public void print_for()
    {
        System.out.println("for");
    }
}


public class MultipleInheritance {

    public static void main(String[] args)
    {
        child c = new child();

        c.print();

        c.print_geek();
        c.print_for();
        c.print_geek();

    }

}
