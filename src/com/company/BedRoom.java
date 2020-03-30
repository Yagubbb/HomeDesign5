package com.company;

public class BedRoom {
    Bed bed;
    Wardrobe wardrobe;
    Computer computer;
    double squareFootage;

    public BedRoom(Bed bed, Wardrobe wardrobe, Computer computer, double squareFootage) {
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.computer = computer;
        this.squareFootage = squareFootage;
    }

    void properties(){
        System.out.println("Items: " + bed.getName() + ", " + wardrobe.getName() +  ", "+ computer.getName());
        System.out.println("Square Footage of room: " + squareFootage);
        System.out.println("");


    }
}
