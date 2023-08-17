package com.exemplo.estacionamento.controllers

import com.exemplo.estacionamento.dtos.TicketDto
import com.exemplo.estacionamento.services.TicketService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(value = ["api/v1/ticket"])
class TicketController {

    @Autowired
    lateinit var ticketService: TicketService

    @GetMapping(value = ["/list"])
    fun listAllTickets(ativo: Boolean): ResponseEntity<List<TicketDto>> {
        return ResponseEntity.ok(ticketService.listAllTickets(ativo))
    }

    @PostMapping(value = ["/create"])
    fun createTicket(@RequestBody ticket: TicketDto): ResponseEntity<TicketDto> {
        return ResponseEntity.ok(ticketService.createTicket(ticket))
    }
}