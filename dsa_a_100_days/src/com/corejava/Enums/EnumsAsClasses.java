package com.corejava.Enums;

// Use of enum constructor, instance variable and method.

enum Friends {
    Rakesh(10, "Dhangadhi"), Prajwal(20, "Dhapakhel"), Samrat(5, "Pokhara"), Nirajan(12, "Butwal");
    private int price;
    private String location;

    Friends(int p, String l) {
        price = p;
        location = l;
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
        Friends fr;

        System.out.println("Rakesh costs: " + Friends.Rakesh.getPrice());

        Friends[] allFriends = Friends.values();
        for(Friends f: allFriends) {
            System.out.println(f.getPrice());
            System.out.println(f.getLocation());
        }
    }
}
