package com.company;

public class Wardrobe {
    String color,material;
    double height,width;
    int numberOfDoors;

    public Wardrobe(String color, double height, double width, int numberOfDoors,String material) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.numberOfDoors = numberOfDoors;
        this.material = material;
        System.out.println("Creating new wardrobe ");
        System.out.println("");

    }

    void properties(){
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size(height & width): " + height + "x" + width + "m");
        System.out.println("Numbers of doors: " + numberOfDoors);
        System.out.println("");

    }
    String getName(){
        return "Wardrobe";
    }
}
