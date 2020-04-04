package com.company;

public class Cupboard {
    private String color,material;
    private double height,width;
    private int numberOfDoors;

    public Cupboard(String color, String material, double height, double width, int numberOfDoors) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.width = width;
        this.numberOfDoors = numberOfDoors;
        System.out.println("Creating new cupboard...");
        System.out.println("");

    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void properties(){
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size(height & width): " + height + "x" + width + "m");
        System.out.println("Numbers of doors: " + numberOfDoors);

    }
    public String getName(){
        return "cupboard";
    }
}
