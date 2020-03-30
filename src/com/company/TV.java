package com.company;

public class TV {
    String model,color;
    double size;

    public TV(String model, String color, double size) {
        this.model = model;
        this.color = color;
        this.size = size;
        System.out.println("Creating new TV...");
        System.out.println("");

    }

    void properties(){
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Size: " + size);
        System.out.println("");

    }
    String getName(){
        return "TV";
    }
}
