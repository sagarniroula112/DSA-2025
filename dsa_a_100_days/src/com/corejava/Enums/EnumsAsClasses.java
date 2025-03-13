package com.corejava.Enums;

// Use of enum constructor, instance variable and method.

enum Friends {
    Rakesh(10, "Dhangadhi"), Prajwal(), Samrat(5, "Pokhara"), Nirajan(12, "Butwal");

    private int price;
    private String location;

    Friends(int p, String l) {
        price = p;
        location = l;
        System.out.println(this + " constructor called!");
    }

    Friends() {
        price = -1;
        location = "Lavanya desh";
        System.out.println(this + " default constructor called!");
    }

    String getLocation() {
        return location;
    }

    int getPrice() {
        return price;
    }
}


public class EnumsAsClasses {
    public static void main(String[] args) {
        // Friends fr;

        // System.out.println("Rakesh costs: " + Friends.Rakesh.getPrice());

        // Friends[] allFriends = Friends.values();
        // for(Friends f: allFriends) {
        //     System.out.println(f.getPrice());
        //     System.out.println(f.getLocation());
        // }
        Friends[] allFriends = Friends.values();
        Friends f1 = Friends.valueOf("Rakesh");
    }
}
