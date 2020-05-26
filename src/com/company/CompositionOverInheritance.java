package com.company;


class Duck{
    public void fly(){

    }

    public void eat(){

    }

    public void speak(){

    }
}


//  IS A relation
class AsianDuck extends Duck{

    // okay, this can fly, eat and speak

}

class RubberDuck{

    // How about this, this can't fly, but lets say can eat
    // whats the use of fly for this????

}


public class CompositionOverInheritance {
}

////////////////////////////////////////////////////////////////////////////////////////////


interface IFly{
    default void ifly(){
        System.out.println("fly");
    }
    void fly();
}

interface IFLY2{
    default void ifly(){
        System.out.println("hello2");
    }
}

interface IEat{
    void eat();
}

interface ISpeak{
    void speak();
}




class AsianDuck1 implements IFly, IEat, ISpeak{

//    @Override
//    public void ifly() {
//
//    }

    @Override
    public void fly() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void speak() {

    }
}

class RubberDuck1 implements IEat{

    @Override
    public void eat() {

    }
}

// similarly you can create as per your requirement