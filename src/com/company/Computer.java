package com.company;

public class Computer {
    private String type,color,model,processor;
    private double size;
    private int ram;

    public Computer(String type, String color, String model, String processor, double size, int ram) {
        this.type = type;
        this.color = color;
        this.model = model;
        this.processor = processor;
        this.size = size;
        this.ram = ram;
        System.out.println("Creating new computer...");
        System.out.println("");
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public double getSize() {
        return size;
    }

    public int getRam() {
        return ram;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void properties(){
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Size(inches): " + size );
        System.out.println("Technical properties: " + model + ", " + processor + ", " + ram + "RAM");

    }
    public String getName(){
        return "computer";
    }
}
