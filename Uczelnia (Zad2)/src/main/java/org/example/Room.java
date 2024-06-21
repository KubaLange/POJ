package org.example;

public class Room {
    private String name;
    private RoomType type;

    public Room(String name, RoomType type) {
        this.name = name;
        this.type = type;
    }

    public void clean() {
    }

    public void powerOn() {
    }

    public void powerOff() {
    }

    public String getName() {
        return name;
    }

    public RoomType getType() {
        return type;
    }
}
