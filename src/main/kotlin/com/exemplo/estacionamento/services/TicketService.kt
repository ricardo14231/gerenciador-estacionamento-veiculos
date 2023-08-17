package com.exemplo.estacionamento.services

import com.exemplo.estacionamento.dtos.TicketDto
import com.exemplo.estacionamento.mapper.TicketMapper
import com.exemplo.estacionamento.models.TicketModel
import com.exemplo.estacionamento.repositorys.TicketRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TicketService {

    @Autowired
    lateinit var ticketRepository: TicketRepository

    fun listAllTickets(ativo: Boolean): List<TicketDto>? {
        val listTicketActive = ticketRepository.findByAtivo(ativo)

        return listTicketActive.map {
            TicketDto(
                id = it.id,
                numeroTicket = it.numeroTicket,
                placa = it.placa,
                tipo = it.tipo,
                horaEntrada = it.horaEntrada,
                horaSaida = it.horaSaida,
                valorServico = it.valorServico,
                ativo = it.ativo,
                observacao = it.observacao,
                updatedAt = it.updatedAt,
                createdAt = it.createdAt
            )
        }
    }

    fun createTicket(ticket: TicketDto): TicketDto? {

        val ticketToSave = TicketModel(
            numeroTicket = ticket.numeroTicket,
            placa = ticket.placa,
            tipo = ticket.tipo,
            observacao = ticket.observacao,
        )

        val ticketSaved = ticketRepository.save(ticketToSave)

        return TicketDto(
            id = ticketSaved.id,
            numeroTicket = ticketSaved.numeroTicket,
            placa = ticketSaved.placa,
            tipo = ticketSaved.tipo,
            horaEntrada = ticketSaved.horaEntrada,
            horaSaida = ticketSaved.horaSaida,
            valorServico = ticketSaved.valorServico,
            ativo = ticketSaved.ativo,
            observacao = ticketSaved.observacao,
            updatedAt = ticketSaved.updatedAt,
            createdAt = ticketSaved.createdAt
        )
    }
}