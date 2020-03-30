package com.company;

public class Fridge {
    String model,color;
    double height, width;

    public Fridge(String model, String color, double height, double width) {
        this.model = model;
        this.color = color;
        this.height = height;
        this.width = width;
        System.out.println("Creating new fridge...");
        System.out.println("");

    }
    void properties(){
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Size(height & width): " + height + "x" + width + "m");
    }
    String getName(){
        return "fridge";
    }
}
