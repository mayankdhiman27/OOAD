package com.company;


class BackEndDeveloper {
    public void writeJava() {
        System.out.println("Java");
    }
}

class FrontEndDeveloper {
    public void writeJavascript() {
        System.out.println("JavaScript");
    }
}

public class DependencyInversion {

    private static BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private static FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    public static void main(String[] args){

        // methods are bound to corresponding classes
        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }

}
