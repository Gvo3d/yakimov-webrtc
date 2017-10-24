package org.yakimovdenis.demoyakimovwebrtc.models;

public class RoomlistMessage {
    private Room[] rooms;

    public RoomlistMessage(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
