package com.company;

public class Main {



    public static void main(String[] args) {
//        Creating new Items
        Bed newBed = new Bed("Brown",2.5,1.5);

        Computer HP = new Computer("Laptop","Grey","HP","Intel Core I7,10th gen",15.6,12);

        Cupboard newCupboard = new Cupboard("Browm","Wood",2.0,3.0,6);

        Fridge newFridge = new Fridge("Samsung","Grey",2.0,0.8);

        SofaandArmchair newSofaandArmchair = new SofaandArmchair("Black","Ikea",2.0,0.7,1.0,0.7);

        TableChair newTableandChair = new TableChair("Brown","HardWood",2.0,1.0,10);

        TableChair newTCforKitchen = new TableChair("Brown","Hardwood",1.5,1.0,6);

        Wardrobe newWardrobe = new Wardrobe("Blue",2.0,1.6,3,"HardWood");

        TV newTV = new TV("LG","White",123);

        TV miniTV = new TV("Samsung","Black",80.0);
//      ......................

//      Creating new rooms
        BedRoom newBedroom = new BedRoom(newBed,newWardrobe,HP,20.0);

        GuestRoom newGuestRoom = new GuestRoom(newSofaandArmchair,newTV,newTableandChair,newCupboard,24);

        Kitchen newKitchen = new Kitchen(newTCforKitchen,newCupboard,miniTV,newFridge,15.0);
//      ......................
//      New Home
        Home newHome = new Home(newGuestRoom,newKitchen,newBedroom);
        newHome.properties();


    }
}
