package com.pluralsight;

import java.awt.*;

public abstract class Shape {

    // class attributes
    protected Turtle turtle;
    protected World world;
    protected double locationX;
    protected double locationY;
    protected String color;
    protected int border;

    public static Color getColorFromName(String colorName) {
        if (colorName == null) return Color.BLACK; // default
        switch (colorName.toLowerCase()) {
            case "red":
                return Color.RED;
            case "blue":
                return Color.BLUE;
            case "green":
                return Color.GREEN;
            case "black":
                return Color.BLACK;
            case "white":
                return Color.WHITE;
            case "yellow":
                return Color.YELLOW;
            case "orange":
                return Color.ORANGE;
            case "gray":
                return Color.GRAY;
            case "pink":
                return Color.PINK;
            case "cyan":
                return Color.CYAN;
            case "magenta":
                return Color.MAGENTA;
            default:
                return Color.BLACK; // fallback color
        }
    }

    public abstract void paint();
}
