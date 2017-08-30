package com.akos.arathus.materialpicker.picker_elements;


import java.util.ArrayList;

/**
 * Created by arathus on 2017.08.27..
 */

public class DummyElements {

    public static ArrayList<Element> getElements() {

        ArrayList<Element> elements = new ArrayList<>();

        elements.add(new Element("First", "#FFFFFF", null));
        elements.add(new Element("Second", "#FFFFFF", null));
        elements.add(new Element("Third", "#FFFFFF", null));
        elements.add(new Element("Fourth", "#FFFFFF", null));
        elements.add(new Element("Fifth", "#FFFFFF", null));
        elements.add(new Element("Sixth", "#FFFFFF", null));
        elements.add(new Element("Seventh", "#FFFFFF", null));
        elements.add(new Element("Eight", "#FFFFFF", null));
        elements.add(new Element("Ninth", "#FFFFFF", null));


        return elements;
    }
}
