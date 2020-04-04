package com.company;

public class TableChair {
    private String color,material;
    private double length,width;
    private int numbersOfChair;

    public TableChair(String color, String material, double length, double width, int numbersOfChair) {
        this.color = color;
        this.material = material;
        this.length = length;
        this.width = width;
        this.numbersOfChair = numbersOfChair;
        System.out.println("Creating new table and chairs...");
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getNumbersOfChair() {
        return numbersOfChair;
    }

    public void setNumbersOfChair(int numbersOfChair) {
        this.numbersOfChair = numbersOfChair;
    }

    public void properties(){
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size(length & width): " + length + "x" + width + "m");
        System.out.println("Numbers of chairs: " + numbersOfChair);
        System.out.println("");

    }

    public String getName(){
        return "Table and" + " " + numbersOfChair + " "  + "Chairs";
    }
}
