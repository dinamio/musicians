package controller;

import entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.TicketService;

/**
 * Created by Jenja on 22.04.2017.
 */
@Controller
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;

    @GetMapping
    public String getTicket(Model model) {
        model.addAttribute("tickets",ticketService.findAll());
        return "tickets";
    }

    @GetMapping("/{id}")
    public String getTicket(Model model, @PathVariable Integer id){
        model.addAttribute("ticket",ticketService.findById(id));
        return "ticket";
    }

    @GetMapping("/new")
    public String newTicket() {
        return "newTicket";
    }

    @PostMapping
    public String createTicket(Ticket ticket)
    {
        ticketService.save(ticket);
        return "redirect:/ticket";
    }

    @GetMapping("/delete/{id}")
    public String deleteTicket(@PathVariable Integer id){
        ticketService.delete(id);
        return "redirect:/ticket";
    }



}
