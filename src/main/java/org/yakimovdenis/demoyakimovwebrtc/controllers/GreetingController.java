package org.yakimovdenis.demoyakimovwebrtc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.yakimovdenis.demoyakimovwebrtc.models.RoomlistMessage;
import org.yakimovdenis.demoyakimovwebrtc.services.RoomService;

@Controller
public class GreetingController {

    @Autowired
    private RoomService roomService;

    @MessageMapping("/ws-room")
    @SendTo("/topic/room")
    public String room() throws Exception {
        return "room text";
    }

    @MessageMapping("/ws-roomlist")
    @SendTo("/topic/roomlist")
    public RoomlistMessage roomlist() throws Exception {
        return roomService.getRoomList();
    }

}
