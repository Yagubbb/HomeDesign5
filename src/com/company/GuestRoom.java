package com.company;

public class GuestRoom {
    private SofaandArmchair sofaandArmchair;
    private TV tv;
    private TableChair tableChair;
    private Cupboard cupboard;
    private double squareFootage;

    public GuestRoom(SofaandArmchair sofaandArmchair, TV tv, TableChair tableChair, Cupboard cupboard, double squareFootage) {
        this.sofaandArmchair = sofaandArmchair;
        this.tv = tv;
        this.tableChair = tableChair;
        this.cupboard = cupboard;
        this.squareFootage = squareFootage;
    }

    public SofaandArmchair getSofaandArmchair() {
        return sofaandArmchair;
    }

    public TV getTv() {
        return tv;
    }

    public TableChair getTableChair() {
        return tableChair;
    }

    public Cupboard getCupboard() {
        return cupboard;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSofaandArmchair(SofaandArmchair sofaandArmchair) {
        this.sofaandArmchair = sofaandArmchair;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void setTableChair(TableChair tableChair) {
        this.tableChair = tableChair;
    }

    public void setCupboard(Cupboard cupboard) {
        this.cupboard = cupboard;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public void properties(){
        System.out.println("Items: " + sofaandArmchair.getName() + ", " + tv.getName() +  ", "+ tableChair.getName()
                + ", "+ cupboard.getName());
        System.out.println("Square Footage of room: " + squareFootage);
        System.out.println("");


    }
}
