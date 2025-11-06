package com.pluralsight;

public class Triangle extends Shape{

    // class attributes
    double width;
    double height;

    // constructor
    public Triangle (World world, double locationX, double locationY, int border, String color, double width, double height) {

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

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);

        turtle.setPenWidth(3);
        turtle.setColor(getColorFromName(color));

        // find angle β
        // β = arctan(b / a)
        turtle.turnRight(180 - Math.toDegrees(Math.atan(width / height)));
        turtle.forward(hypotenuse);


        // find angle A
        // A = arctan(a / b)
        turtle.turnRight(180 - Math.toDegrees(Math.atan(height / width)) );
        turtle.forward(width);

        turtle.turnRight(90);
        turtle.forward(height);

    }
}
