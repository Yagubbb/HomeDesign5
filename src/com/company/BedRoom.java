package com.company;

public class BedRoom {
    private Bed bed;
    private Wardrobe wardrobe;
    private Computer computer;
    private double squareFootage;

    public BedRoom(Bed bed, Wardrobe wardrobe, Computer computer, double squareFootage) {
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.computer = computer;
        this.squareFootage = squareFootage;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Computer getComputer() {
        return computer;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public void setWardrobe(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public void properties(){
        System.out.println("Items: " + bed.getName() + ", " + wardrobe.getName() +  ", "+ computer.getName());
        System.out.println("Square Footage of room: " + squareFootage);
        System.out.println("");


    }
}
