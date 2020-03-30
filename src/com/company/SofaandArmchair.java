package com.company;

public class SofaandArmchair {
    String color,modelName;
    double sofaLength,sofaWidth,armchairLength,armchairWidth;

    public SofaandArmchair(String color, String modelName, double sofaLength, double sofaWidth, double armchairLength, double armchairWidth) {
        this.color = color;
        this.modelName = modelName;
        this.sofaLength = sofaLength;
        this.sofaWidth = sofaWidth;
        this.armchairLength = armchairLength;
        this.armchairWidth = armchairWidth;
        System.out.println("Creating new sofa and armchair... ");
        System.out.println("");

    }
    void properties(){
        System.out.println("Color: " + color);
        System.out.println("Model: " + modelName);
        System.out.println("Size of sofa (length & width): " + sofaLength + "x" + sofaWidth + "m");
        System.out.println("Size of armchair (length & width): " + armchairLength + "x" + armchairWidth + "m");
        System.out.println("");
    }

    String getName(){
        return "Sofa and armchairs";
    }
}

