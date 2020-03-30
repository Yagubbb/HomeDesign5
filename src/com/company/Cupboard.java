package com.company;

public class Cupboard {
    String color,material;
    double height,width;
    int numberOfDoors;

    public Cupboard(String color, String material, double height, double width, int numberOfDoors) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.width = width;
        this.numberOfDoors = numberOfDoors;
        System.out.println("Creating new cupboard...");
        System.out.println("");

    }
    void properties(){
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size(height & width): " + height + "x" + width + "m");
        System.out.println("Numbers of doors: " + numberOfDoors);

    }
    String getName(){
        return "cupboard";
    }
}
