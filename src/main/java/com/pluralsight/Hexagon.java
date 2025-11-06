package com.pluralsight;

public class Hexagon extends Shape{

    double sideLength;

    // constructor
    public Hexagon (World world, double locationX, double locationY, int border, String color, double sideLength) {

        this.world = world;
        this.border = border;
        this.color = color;
        this.locationX = locationX;
        this.locationY = locationY;

        this.sideLength = sideLength;

        this.turtle = new Turtle(this.world, locationX, locationY);

    }

    @Override
    public void paint() {

        double numSides = 6; // a hexagon has 6 sides

        double turnAngle = 360 / numSides;

        turtle.setPenWidth(border);
        turtle.setColor(getColorFromName(color));

        for (int i = 0; i < numSides; i ++) {
            turtle.turnRight(turnAngle);
            turtle.forward(sideLength);
        }

    }
}
