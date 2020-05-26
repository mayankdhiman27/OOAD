package com.company;


class Onee
{
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class Twoo extends Onee
{
    public void print_for()
    {
        System.out.println("for");
    }
}

class Three extends Twoo
{
    public void print_geek()
    {
        super.print_geek();
        System.out.println("Geeks");
    }
}

public class MultilevelInheritance
{
    public static void main(String[] args)
    {
        Three g = new Three();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}