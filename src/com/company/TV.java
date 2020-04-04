package com.company;

public class TV {
    private String model,color;
    private double size;

    public TV(String model, String color, double size) {
        this.model = model;
        this.color = color;
        this.size = size;
        System.out.println("Creating new TV...");
        System.out.println("");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void properties(){
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Size: " + size);
        System.out.println("");

    }
    public String getName(){
        return "TV";
    }
}
