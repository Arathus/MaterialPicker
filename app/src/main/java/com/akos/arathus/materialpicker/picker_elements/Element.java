package com.akos.arathus.materialpicker.picker_elements;

import android.graphics.Color;
import android.graphics.Typeface;

/**
 * Created by arathus on 2017.08.27..
 */

public class Element {

    private String text;
    private int color;
    private Typeface font = null;

    public Element(String text, String color, Typeface font) {

        this.text = text;
        this.color = Color.parseColor(color);
        this.font = font;
    }

    public String getText() {
        return text;
    }

    public int getColor() {
        return color;
    }

    public Typeface getFont() {
        return font;
    }
}
