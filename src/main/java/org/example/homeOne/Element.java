package org.example.homeOne;

public class Element implements Elements {
    private final int count;

    public Element(int count) {

        this.count = count;
    }

    @Override
    public int getCount() {

        return count;
    }
}