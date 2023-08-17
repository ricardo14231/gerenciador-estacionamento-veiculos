package com.exemplo.estacionamento.models

import com.exemplo.estacionamento.TipoVeiculo
import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "ticket")
class TicketModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null

    @Column(length = 30)
    var numeroTicket: String = ""

    @Column(length = 7)
    var placa: String = ""

    var tipo: TipoVeiculo? = null

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    var horaEntrada: LocalDateTime? = null

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    val horaSaida: LocalDateTime? = null

    @Column(length = 50)
    var valorServico: String = ""

    var ativo: Boolean = false

    @Column(columnDefinition = "TEXT")
    var observacao: String = ""

    var deletado: Boolean = false

    var updatedAt: LocalDateTime? = null

    val createdAt = LocalDateTime.now()
}