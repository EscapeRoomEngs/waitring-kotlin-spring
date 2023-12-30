package com.waitring.waitring.mall.repository

import com.querydsl.core.types.dsl.BooleanExpression
import com.querydsl.jpa.impl.JPAQueryFactory
import com.waitring.waitring.mall.domain.Mall
import com.waitring.waitring.mall.domain.MallState
import com.waitring.waitring.mall.domain.QMall.mall
import com.waitring.waitring.mall.domain.QMallCategory.mallCategory
import com.waitring.waitring.mall.dto.MallCondition

class MallRepositoryCustomImpl(private val query: JPAQueryFactory) : MallRepositoryCustom {

    /**
     * 쇼핑센터 리스트 조회
     * @param 쇼핑센터 검색 조건
     * @return 쇼핑센터 리스트
     */
    override fun getMallList(condition: MallCondition): List<Mall> {
        return query
                .selectFrom(mall)
                .join(mall.mallCtg, mallCategory).fetchJoin()
                .where(
                        inMallCtgId(condition.mallCtgId),
                        eqMallSt(condition.mallSt)
                )
                .fetch();
    }

    private fun inMallCtgId(mallCtgId : Long?) : BooleanExpression? {
        return if (mallCtgId == null) null else mallCategory.mallCtgId.eq(mallCtgId)
    }

    private fun eqMallSt(mallSt : String?) : BooleanExpression? {
        return if (mallSt == null) null else mall.mallSt.eq(MallState.valueOf(mallSt))
    }
}