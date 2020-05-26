package com.company;


class Employee{

    int id;
    String name;
    String designation;

    public Employee(Builder x) {
        this.id = x.id;
        this.name = x.name;
        this.designation = x.designation;
    }

    static class Builder{
        int id;
        String name;
        String designation;

        public Builder(){

        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public Builder setDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public Employee build(){
            Employee e = new Employee(this);
            return e;
        }
    }

}

public class BuilderExample {

    public static void main(String[] args) {

        Employee.Builder builder = new Employee.Builder();

        builder.setDesignation("sfsf");
        builder.setName("jhjh");
        builder.setId(1234);

        Employee e = builder.build();
        System.out.println(e.designation);
        System.out.println(e.name);
        System.out.println(e.id);
    }

}
