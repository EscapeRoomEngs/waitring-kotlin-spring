package com.waitring.waitring.common.repository

import com.waitring.waitring.common.domain.Image
import org.springframework.data.jpa.repository.JpaRepository

interface ImageRepository : JpaRepository<Image, Long>, ImageRepositoryCustom {
}