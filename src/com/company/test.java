package com.company;



interface AA{
    void nottify();
}

interface BB{
    void display();
}


class AClass{

    public void displayOnBigScreen(){
        System.out.println("A");
    }

}

class Blass{

    public void displayOnSmallScreen(){
        System.out.println("B");
    }

}


class Use extends AClass implements  AA, BB{

    @Override
    public void nottify() {

    }

    @Override
    public void display() {

    }
}

public class test {



}
