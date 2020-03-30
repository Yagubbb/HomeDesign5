package com.company;

public class Kitchen {
    TableChair tableChair;
    Cupboard cupboard;
    TV tv;
    Fridge fridge;
    double squareFootage;

    public Kitchen(TableChair tableChair, Cupboard cupboard, TV tv, Fridge fridge, double squareFootage) {
        this.tableChair = tableChair;
        this.cupboard = cupboard;
        this.tv = tv;
        this.fridge = fridge;
        this.squareFootage = squareFootage;
    }
    void properties(){
        System.out.println("Items: " + fridge.getName() + ", " + tv.getName() +  ", "+ tableChair.getName()
                + ", "+ cupboard.getName());
        System.out.println("Square Footage of room: " + squareFootage);
        System.out.println("");


    }
}
