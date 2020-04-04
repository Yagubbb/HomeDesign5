package com.company;

public class Home {
    private GuestRoom guestRoom;
    private BedRoom bedRoom;
    private Kitchen kitchen;
    private double squareFootage ;

    public Home(GuestRoom guestRoom, Kitchen kitchen, BedRoom bedRoom) {
        this.guestRoom = guestRoom;
        this.bedRoom = bedRoom;
        this.kitchen = kitchen;
        this.squareFootage = guestRoom.getSquareFootage() + bedRoom.getSquareFootage() + kitchen.getSquareFootage();;
    }

    public GuestRoom getGuestRoom() {
        return guestRoom;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setGuestRoom(GuestRoom guestRoom) {
        this.guestRoom = guestRoom;
    }

    public void setBedRoom(BedRoom bedRoom) {
        this.bedRoom = bedRoom;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public void properties(){
        System.out.println("Item and Square Footage: ");
        System.out.println("In bedroom:");
        bedRoom.properties();
        System.out.println("In kitchen:");
        kitchen.properties();
        System.out.println("In guest room:");
        guestRoom.properties();
        System.out.println("Square Footage of home: " + this.squareFootage);


    }

}
