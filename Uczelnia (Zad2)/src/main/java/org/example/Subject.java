package org.example;

public class Subject {
    private String name;
    private Room room;

    public Subject(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public Room getRoom() {
        return room;
    }
}
