package com.exemplo.estacionamento.dtos

import com.exemplo.estacionamento.TipoVeiculo
import java.time.LocalDateTime

class TicketDto {

    val id: Long? = null

    var numeroTicket: String = ""

    var placa: String = ""

    var tipo: TipoVeiculo? = null

    var horaEntrada: LocalDateTime? = null

    val horaSaida: LocalDateTime? = null

    var valorServico: String = ""

    var ativo: Boolean = false

    var observacao: String = ""

    var updatedAt: LocalDateTime? = null

    val createdAt = LocalDateTime.now()
}
