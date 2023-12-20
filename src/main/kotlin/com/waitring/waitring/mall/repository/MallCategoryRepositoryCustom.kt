package com.waitring.waitring.mall.repository

import com.waitring.waitring.mall.domain.MallCategory
import com.waitring.waitring.mall.dto.MallCategoryCondition

interface MallCategoryRepositoryCustom {
    fun getMallCategoryList(condition : MallCategoryCondition) : List<MallCategory>
}