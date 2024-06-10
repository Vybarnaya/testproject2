package org.example.homeOne;

import java.util.ArrayList;
import java.util.List;

public class Container implements Elements {

    public List<Elements> elements = new ArrayList<>();


    public void addElement(Elements element){

        elements.add(element);
    }

    public void removeElement(int index){

        elements.remove(index);
    }

    public List<Elements> getElements() {

        return elements;
    }

    @Override
    public int getCount() {
        return elements.stream()
                .map(Elements::getCount)
                .mapToInt(Integer::intValue).sum();
    }
}