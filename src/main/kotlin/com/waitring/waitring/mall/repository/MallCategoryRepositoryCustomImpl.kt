package com.waitring.waitring.mall.repository

import com.querydsl.core.types.dsl.BooleanExpression
import com.querydsl.jpa.impl.JPAQueryFactory
import com.waitring.waitring.mall.domain.MallCategory
import com.waitring.waitring.mall.domain.QCompany.company
import com.waitring.waitring.mall.domain.QMallCategory.mallCategory
import com.waitring.waitring.mall.dto.MallCategoryCondition

class MallCategoryRepositoryCustomImpl(private val query: JPAQueryFactory) : MallCategoryRepositoryCustom {

    /**
     * 쇼핑센터카테고리 리스트 조회
     * 정렬 : 순번 오름차순
     * @param 쇼핑센터카테고리 검색 조건
     * @return 쇼핑센터카테고리 리스트
     */
    override fun getMallCategoryList(condition: MallCategoryCondition) : List<MallCategory>{
        return query
                .selectFrom(mallCategory)
                .join(mallCategory.company, company).fetchJoin()
                .where(
                        eqCompanyId(condition.companyId),
                        eqUseFg(condition.useFg)
                )
                .orderBy(mallCategory.seq.asc())
                .fetch();
    }

    private fun eqCompanyId(companyId : Long?) : BooleanExpression? {
        return if (companyId == null) null else company.companyId.eq(companyId)
    }

    private fun eqUseFg(useFg : Boolean?) : BooleanExpression? {
        return if (useFg == null) null else mallCategory.useFg.eq(useFg)
    }
}