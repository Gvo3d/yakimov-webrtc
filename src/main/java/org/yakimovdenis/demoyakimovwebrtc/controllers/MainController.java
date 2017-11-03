//package org.yakimovdenis.demoyakimovwebrtc.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//import org.yakimovdenis.demoyakimovwebrtc.models.Room;
//
//import org.yakimovdenis.demoyakimovwebrtc.services.UserService;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Collection;
//import java.util.List;
//
//@RestController
//public class MainController {
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private RoomService roomService;
//
//    @RequestMapping(value = {"/", "/index"})
//    public String home() {
//        return "index";
//    }
//
//    @RequestMapping(value = {"main"})
//    public ModelAndView mainPage() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("user", userService.getUser());
//        modelAndView.setViewName("main");
//        return modelAndView;
//    }
//
//    @RequestMapping(value="/roomList", method = RequestMethod.GET)
//    public Collection<Room> getRoomList(){
//        return roomService.getRooms();
//    }
//
//    @RequestMapping(value="/createRoom", method = RequestMethod.POST)
//    public Room createRoom(@RequestBody Room room){
//        return roomService.addRoom(room);
//    }
//
//    @RequestMapping(value="/disband/{id}", method = RequestMethod.DELETE)
//    public boolean disbandRoom(@PathVariable("id") Long id){
//        Room room = roomService.getRoom(id);
//        if (room.getAuthorId().equals(userService.getUser())){
//            roomService.disbandRoom(id);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @RequestMapping(value="/exit/{id}", method = RequestMethod.GET)
//    public boolean exitRoom(@PathVariable("id") Long id){
//        return roomService.retrieveUser(id, userService.getUser().getId());
//    }
//}
