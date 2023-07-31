package com.exemplo.estacionamento.models

import java.time.LocalDateTime

class TicketModel {

    val id: Long = 0

    val numeroTicket: String = ""

    val placa: String = ""

    val horaEntrada: LocalDateTime? = null

    val horaSaida: LocalDateTime? = null

    val valorServico: String = ""

    val observacao: String = ""

    val deletado: Boolean = false

    val updatedAt: LocalDateTime? = null

    val createdAt = LocalDateTime.now()
}