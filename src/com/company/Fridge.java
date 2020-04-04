package com.company;

public class Fridge {
    private String model,color;
    private double height, width;

    public Fridge(String model, String color, double height, double width) {
        this.model = model;
        this.color = color;
        this.height = height;
        this.width = width;
        System.out.println("Creating new fridge...");
        System.out.println("");

    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void properties(){
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Size(height & width): " + height + "x" + width + "m");
    }
    public String getName(){
        return "fridge";
    }
}
