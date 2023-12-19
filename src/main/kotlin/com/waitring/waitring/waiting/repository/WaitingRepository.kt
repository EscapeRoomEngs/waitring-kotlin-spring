package com.waitring.waitring.waiting.repository

import com.waitring.waitring.waiting.domain.Waiting
import org.springframework.data.jpa.repository.JpaRepository

interface WaitingRepository : JpaRepository<Waiting, Long>, WaitingRepositoryCustom {
}