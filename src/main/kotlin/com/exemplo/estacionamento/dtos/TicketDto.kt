package com.exemplo.estacionamento.dtos

import com.exemplo.estacionamento.TipoVeiculo
import java.time.LocalDateTime

data class TicketDto(

    val id: Long? = null,

    var numeroTicket: String = "",

    var placa: String = "",

    var tipo: TipoVeiculo? = null,

    var horaEntrada: LocalDateTime? = null,

    val horaSaida: LocalDateTime? = null,

    var valorServico: String = "",

    var ativo: Boolean? = null,

    var observacao: String = "",

    var updatedAt: LocalDateTime? = null,

    val createdAt: LocalDateTime? = LocalDateTime.now(),
)
