package com.waitring.waitring.mall.repository

import com.waitring.waitring.mall.domain.MallCategory
import org.springframework.data.jpa.repository.JpaRepository

interface MallCategoryRepository : JpaRepository<MallCategory, Long>, MallCategoryRepositoryCustom {
}