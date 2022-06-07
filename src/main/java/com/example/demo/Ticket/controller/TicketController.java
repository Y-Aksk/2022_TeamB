package com.example.demo.Ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.example.demo.Ticket.repository.TicketModel;
import com.example.demo.Ticket.repository.TicketMapper;
import com.example.demo.Ticket.model.TicketPageModel;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
@RequestMapping("park")
public class TicketController {

    @Autowired
    TicketMapper ticketMapper;

    @PostMapping("ticket")
    public String a(@RequestParam("ticket_count1") int ticket_count1,int ticket_sum, Mode model){
        TicketPageModel page = new TicketPageModel();

        page.ticket_sum = ticket_count1;

        //model.addAttribute("page", page);

        return "park/ticket";
    }


    
}
