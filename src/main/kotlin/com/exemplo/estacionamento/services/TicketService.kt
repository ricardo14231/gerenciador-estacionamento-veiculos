package com.exemplo.estacionamento.services

import com.exemplo.estacionamento.models.TicketModel
import com.exemplo.estacionamento.repositorys.TicketRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TicketService {

    @Autowired
    lateinit var ticketRepository: TicketRepository

    fun listAllTickets(ativo: Boolean): List<TicketModel>? {
        return ticketRepository.findByAtivo(ativo)
    }

    fun createTicket(ticket: TicketModel): TicketModel? {
        return ticketRepository.save(ticket)
    }
}