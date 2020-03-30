package com.company;

public class Bed {
    String color;
    double length, width;

    public Bed(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
        System.out.println("Creating new bed...");
        System.out.println("");
    }
    void properties(){
        System.out.println("Color: " + color);
        System.out.println("Size(length & width): " + length + "x" + width + "m");

    }
    String getName(){
        return "bed";
    }
}
