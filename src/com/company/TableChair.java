package com.company;

public class TableChair {
    String color,material;
    double length,width;
    int numbersOfChair;

    public TableChair(String color, String material, double length, double width, int numbersOfChair) {
        this.color = color;
        this.material = material;
        this.length = length;
        this.width = width;
        this.numbersOfChair = numbersOfChair;
        System.out.println("Creating new table and chairs...");
        System.out.println("");

    }
    void properties(){
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size(length & width): " + length + "x" + width + "m");
        System.out.println("Numbers of chairs: " + numbersOfChair);
        System.out.println("");

    }

    String getName(){
        return "Table and" + " " + numbersOfChair + " "  + "Chairs";
    }
}
