package com.waitring.waitring.mall.repository

import com.waitring.waitring.mall.domain.Mall
import org.springframework.data.jpa.repository.JpaRepository

interface MallRepository : JpaRepository<Mall, Long>, MallRepositoryCustom {
}