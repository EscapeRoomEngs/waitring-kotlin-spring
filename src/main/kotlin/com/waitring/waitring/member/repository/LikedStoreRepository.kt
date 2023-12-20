package com.waitring.waitring.member.repository

import com.waitring.waitring.member.domain.LikedStore
import org.springframework.data.jpa.repository.JpaRepository

interface LikedStoreRepository : JpaRepository<LikedStore, Long>, LikedStoreRepositoryCustom {
}