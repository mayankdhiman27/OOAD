package com.company;

class Encapsulate{
    private String geekName;
    private int geekRoll;
    private int geekAge;

    public String getGeekName() {
        return geekName;
    }

    public void setGeekName(String geekName) {
        this.geekName = geekName;
    }

    public int getGeekRoll() {
        return geekRoll;
    }

    public void setGeekRoll(int geekRoll) {
        this.geekRoll = geekRoll;
    }

    public int getGeekAge() {
        return geekAge;
    }

    public void setGeekAge(int geekAge) {
        this.geekAge = geekAge;
    }
}

public class Encapsulation {

    public static void main (String[] args)
    {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setGeekName("Harsh");
        obj.setGeekAge(19);
        obj.setGeekRoll(51);

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " + obj.geekName);

        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getGeekName());
        System.out.println("Geek's age: " + obj.getGeekAge());
        System.out.println("Geek's roll: " + obj.getGeekRoll());

    }

}
