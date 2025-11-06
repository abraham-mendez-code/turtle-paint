package com.pluralsight;

import java.awt.*;
import java.lang.reflect.Field;

public class Rectangle extends Shape {

    double width;
    double height;

    // constructor
    public Rectangle (World world, double locationX, double locationY, int border, String color, double width, double height) {

        this.world = world;
        this.border = border;
        this.color = color;
        this.locationX = locationX;
        this.locationY = locationY;

        this.width = width;
        this.height = height;

        this.turtle = new Turtle(this.world, locationX, locationY);

    }

    @Override
    public void paint() {

        turtle.setPenWidth(border);
        turtle.setColor(getColorFromName(color));

        turtle.turnRight(90);
        turtle.forward(height);

        turtle.turnLeft(90);
        turtle.forward(width);

        turtle.turnLeft(90);
        turtle.forward(height);

        turtle.turnLeft(90);
        turtle.forward(width);

    }
}
