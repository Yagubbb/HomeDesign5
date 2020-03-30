package com.company;

public class Home {
    GuestRoom guestRoom;
    BedRoom bedRoom;
    Kitchen kitchen;
    double squareFootage ;

    public Home(GuestRoom guestRoom, Kitchen kitchen, BedRoom bedRoom) {
        this.guestRoom = guestRoom;
        this.bedRoom = bedRoom;
        this.kitchen = kitchen;
        this.squareFootage = guestRoom.squareFootage + bedRoom.squareFootage + kitchen.squareFootage;;
    }
    void properties(){
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
