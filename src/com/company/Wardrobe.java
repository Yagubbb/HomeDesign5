package com.company;

public class Wardrobe {
    private String color,material;
    private double height,width;
    private int numberOfDoors;

    public Wardrobe(String color, double height, double width, int numberOfDoors,String material) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.numberOfDoors = numberOfDoors;
        this.material = material;
        System.out.println("Creating new wardrobe ");
        System.out.println("");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void properties(){
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size(height & width): " + height + "x" + width + "m");
        System.out.println("Numbers of doors: " + numberOfDoors);
        System.out.println("");

    }
    public String getName(){
        return "Wardrobe";
    }
}
