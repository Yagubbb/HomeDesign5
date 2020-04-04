package com.company;

public class SofaandArmchair {
    private String color,modelName;
    private double sofaLength,sofaWidth,armchairLength,armchairWidth;

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

    public String getColor() {
        return color;
    }

    public String getModelName() {
        return modelName;
    }

    public double getSofaLength() {
        return sofaLength;
    }

    public double getSofaWidth() {
        return sofaWidth;
    }

    public double getArmchairLength() {
        return armchairLength;
    }

    public double getArmchairWidth() {
        return armchairWidth;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setSofaLength(double sofaLength) {
        this.sofaLength = sofaLength;
    }

    public void setSofaWidth(double sofaWidth) {
        this.sofaWidth = sofaWidth;
    }

    public void setArmchairLength(double armchairLength) {
        this.armchairLength = armchairLength;
    }

    public void setArmchairWidth(double armchairWidth) {
        this.armchairWidth = armchairWidth;
    }

    public void properties(){
        System.out.println("Color: " + color);
        System.out.println("Model: " + modelName);
        System.out.println("Size of sofa (length & width): " + sofaLength + "x" + sofaWidth + "m");
        System.out.println("Size of armchair (length & width): " + armchairLength + "x" + armchairWidth + "m");
        System.out.println("");
    }

    public String getName(){
        return "Sofa and armchairs";
    }
}

