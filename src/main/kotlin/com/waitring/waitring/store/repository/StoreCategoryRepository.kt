package com.waitring.waitring.store.repository

import com.waitring.waitring.store.domain.StoreCategory
import org.springframework.data.jpa.repository.JpaRepository

interface StoreCategoryRepository : JpaRepository<StoreCategory, Long> {
    fun findAllByOrderBySeqAsc() : List<StoreCategory>
}