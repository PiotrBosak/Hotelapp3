package com.example.demo.web.controllers;

import com.example.demo.web.services.basic.interfaces.BasicRoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("api/rooms/basic")
public class BasicRoomController {
    private final BasicRoomService service;

    public BasicRoomController(BasicRoomService service) {
        this.service = service;
    }

    @GetMapping("/roomNumber/{id}")
    public String getRoomNumberById(@PathVariable("id") long id, Model model){
        int result = service.getRoomNumberById(id);
        model.addAttribute("result",result);
        return result == -1 ? "notfound" : "roomNumber";
    }
    @GetMapping("/")
    public String fun() {
return "plumba";
    }
}
