package com.waitring.waitring.store.repository

import com.waitring.waitring.store.domain.Store
import org.springframework.data.jpa.repository.JpaRepository

interface StoreRepository : JpaRepository<Store, Long>, StoreRepositoryCustom {
}