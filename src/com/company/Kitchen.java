package com.company;

public class Kitchen {
    private TableChair tableChair;
    private Cupboard cupboard;
    private TV tv;
    private Fridge fridge;
    private double squareFootage;

    public Kitchen(TableChair tableChair, Cupboard cupboard, TV tv, Fridge fridge, double squareFootage) {
        this.tableChair = tableChair;
        this.cupboard = cupboard;
        this.tv = tv;
        this.fridge = fridge;
        this.squareFootage = squareFootage;
    }

    public TableChair getTableChair() {
        return tableChair;
    }

    public Cupboard getCupboard() {
        return cupboard;
    }

    public TV getTv() {
        return tv;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setTableChair(TableChair tableChair) {
        this.tableChair = tableChair;
    }

    public void setCupboard(Cupboard cupboard) {
        this.cupboard = cupboard;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    void properties(){
        System.out.println("Items: " + fridge.getName() + ", " + tv.getName() +  ", "+ tableChair.getName()
                + ", "+ cupboard.getName());
        System.out.println("Square Footage of room: " + squareFootage);
        System.out.println("");


    }
}
