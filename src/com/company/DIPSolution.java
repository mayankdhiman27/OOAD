package com.company;


import java.util.ArrayList;
import java.util.List;

interface Developer {
    void develop();
}


class BackEndDeveloper1 implements Developer {
    @Override
    public void develop() {
        writeJava();
    }
    private void writeJava() {
        System.out.println("Java11");
    }
}

class FrontEndDeveloper1 implements Developer {
    @Override
    public void develop() {
        writeJavascript();
    }
    private void writeJavascript() {
        System.out.println("JS");
    }
}

class Project {

    private List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implement() {
        developers.forEach(Developer::develop);
    }

}

public class DIPSolution{

    public static void main(String[] args) {
        List<Developer> developers = new ArrayList<>();
        developers.add(new FrontEndDeveloper1());
        developers.add(new BackEndDeveloper1());
        Project project = new Project(developers);

        project.implement();
    }

}