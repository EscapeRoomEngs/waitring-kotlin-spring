package com.waitring.waitring.store.repository

import com.waitring.waitring.store.entity.StoreCategory
import org.springframework.data.jpa.repository.JpaRepository

interface StoreCategoryRepository : JpaRepository<StoreCategory, Long> {
}