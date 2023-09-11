package com.exemplo.estacionamento.repositorys

import com.exemplo.estacionamento.models.TicketModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TicketRepository: JpaRepository<TicketModel, Long> {

    fun findByAtivo(ativo: Boolean): List<TicketModel>
}