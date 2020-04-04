package com.company;

public class Bed {
    private String color;
    private double length, width;

    public Bed(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
        System.out.println("Creating new bed...");
        System.out.println("");
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void properties(){
        System.out.println("Color: " + color);
        System.out.println("Size(length & width): " + length + "x" + width + "m");

    }
    public String getName(){
        return "bed";
    }
}
