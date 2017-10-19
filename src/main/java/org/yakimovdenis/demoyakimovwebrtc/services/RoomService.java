package org.yakimovdenis.demoyakimovwebrtc.services;

import org.springframework.stereotype.Service;
import org.yakimovdenis.demoyakimovwebrtc.models.Room;

import java.util.*;

@Service
public class RoomService {
    public Map<Long, Room> rooms = new HashMap<>();

    public void addRoom(Room room) {
        rooms.put(room.getId(), room);
    }

    public Collection<Room> getRooms(){
        return rooms.values();
    }
}
