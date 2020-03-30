package com.company;

public class Computer {
    String type,color,model,processor;
    double size;
    int ram;

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
    void properties(){
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Size(inches): " + size );
        System.out.println("Technical properties: " + model + ", " + processor + ", " + ram + "RAM");

    }
    String getName(){
        return "computer";
    }
}
