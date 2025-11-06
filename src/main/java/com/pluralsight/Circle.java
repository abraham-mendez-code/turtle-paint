package com.pluralsight;

public class Circle extends Shape{

    double radius;

    public Circle (World world, double locationX, double locationY, int border, String color, int radius) {

        this.world = world;
        this.border = border;
        this.color = color;
        this.locationX = locationX;
        this.locationY = locationY;

        this.radius = radius;

        this.turtle = new Turtle(this.world, locationX, locationY);

    }

    @Override
    public void paint() {

        int steps = (int) Math.max(12, radius); // more steps = smoother circle, min steps is 12
        double circumference = 2 * Math.PI * radius; // get the circumference of the circle
        double stepLength = circumference / steps; // divide the circumference by the steps to get the step length

        double stepAngle = 360.0 / steps; // get the angle of each step

        turtle.setPenWidth(border);
        turtle.setColor(getColorFromName(color));

        for (int i = 0; i < steps; i++) {
            turtle.forward(stepLength);
            turtle.turnRight(stepAngle);
        }

    }
}
