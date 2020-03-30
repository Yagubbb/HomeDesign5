package com.company;

public class GuestRoom {
    SofaandArmchair sofaandArmchair;
    TV tv;
    TableChair tableChair;
    Cupboard cupboard;
    double squareFootage;

    public GuestRoom(SofaandArmchair sofaandArmchair, TV tv, TableChair tableChair, Cupboard cupboard, double squareFootage) {
        this.sofaandArmchair = sofaandArmchair;
        this.tv = tv;
        this.tableChair = tableChair;
        this.cupboard = cupboard;
        this.squareFootage = squareFootage;
    }
    void properties(){
        System.out.println("Items: " + sofaandArmchair.getName() + ", " + tv.getName() +  ", "+ tableChair.getName()
                + ", "+ cupboard.getName());
        System.out.println("Square Footage of room: " + squareFootage);
        System.out.println("");


    }
}
