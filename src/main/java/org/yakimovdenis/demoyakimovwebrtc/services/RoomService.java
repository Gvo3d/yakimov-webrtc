package org.yakimovdenis.demoyakimovwebrtc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yakimovdenis.demoyakimovwebrtc.models.Room;
import org.yakimovdenis.demoyakimovwebrtc.models.User;

import java.util.*;

@Service
public class RoomService {
    private Map<Long, Room> rooms = new HashMap<>();
    private int roomCount=0;

    @Autowired
    private UserService userService;

    public Room addRoom(Room room) {
        room.setCreated(new Date(System.currentTimeMillis()));
        room.setOpened(true);
        room.setId(roomCount++);
        room.setName(userService.getUser(room.getAuthorId())+" room");
        rooms.put(room.getId(), room);
        System.out.println("Created room: "+room);
        return room;
    }

    public Collection<Room> getRooms() {
        return rooms.values();
    }

    public void retrieveUser(Long roomId, Long userId) {
        Room room = rooms.get(roomId);
        if (room.getAuthorId().equals(userId)) {
            disbandRoom(roomId);
            //inform all members
        } else {
            room.getUsers().forEach(x -> {
                if (x.getId().equals(userId)) {
                    room.getUsers().remove(x);
                }
            });
            //inform all members
        }
    }

    private synchronized void disbandRoom(Long roomId) {
        //inform all members
        rooms.remove(roomId);
    }
}
