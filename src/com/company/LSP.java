package com.company;

class Rectngle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getArea() {
        return this.length * this.breadth;
    }
}

class Square extends Rectngle {
    @Override
    public void setBreadth(int breadth) {
        super.setBreadth(breadth);
        super.setLength(breadth);
    }
    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setBreadth(length);
    }
}

public class LSP {

    public void calculateArea(Rectngle r) {
        r.setBreadth(2);
        r.setLength(3);
        //
        // Assert Area
        //
        // From the code, the expected behavior is that
        // the area of the rectangle is equal to 6
        //
        assert r.getArea() == 6 : printError("area", r);
        //
        // Assert Length & Breadth
        //
        // From the code, the expected behavior is that
        // the length should always be equal to 3 and
        // the breadth should always be equal to 2
        //
        assert r.getLength() == 3 : printError("length", r);
        assert r.getBreadth() == 2 : printError("breadth", r);
    }


    private String printError(String errorIdentifer, Rectngle r) {
        return "Unexpected value of " + errorIdentifer + "  for instance of " + r.getClass().getName();
    }


    public static void main(String[] args) {
        LSP lsp = new LSP();
        //
        // An instance of Rectangle is passed
        //
        lsp.calculateArea(new Rectngle());
        //
        // An instance of Square is passed
        //
        lsp.calculateArea(new Square());
    }

}
