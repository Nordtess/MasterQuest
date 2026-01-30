package com.masterquest;

public class Room {

    private String id;
    private String description;

    public Room(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public void printRoomInfo() {
        System.out.println(description);
    }

}
