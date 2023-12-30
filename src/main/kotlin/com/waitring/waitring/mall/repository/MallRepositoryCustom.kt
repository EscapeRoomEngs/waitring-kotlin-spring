package com.waitring.waitring.mall.repository

import com.waitring.waitring.mall.domain.Mall
import com.waitring.waitring.mall.dto.MallCondition

interface MallRepositoryCustom {
    fun getMallList(condition : MallCondition) : List<Mall>
}