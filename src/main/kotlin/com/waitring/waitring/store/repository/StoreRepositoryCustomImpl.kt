package com.waitring.waitring.store.repository

import com.querydsl.core.types.dsl.BooleanExpression
import com.querydsl.jpa.impl.JPAQueryFactory
import com.waitring.waitring.mall.domain.QCompany.company
import com.waitring.waitring.mall.domain.QMall.mall
import com.waitring.waitring.mall.domain.QMallCategory.mallCategory
import com.waitring.waitring.store.domain.QStore.store
import com.waitring.waitring.store.domain.QStoreCategory.storeCategory
import com.waitring.waitring.store.domain.Store

class StoreRepositoryCustomImpl(private val query: JPAQueryFactory) : StoreRepositoryCustom {

    /**
     * 특정 가게 조회
     * @param storeId 가게 시퀀스번호
     * @return 가게
     */
    override fun getStore(storeId: Long): Store? {
        return query
                .selectFrom(store)
                .join(store.mall, mall).fetchJoin()
                .join(mall.mallCtg, mallCategory).fetchJoin()
                .join(mallCategory.company, company).fetchJoin()
                .join(store.storeCtg, storeCategory).fetchJoin()
                .where(
                        eqStoreId(storeId)
                )
                .fetchOne();
    }

    private fun eqStoreId(storeId : Long?) : BooleanExpression? {
        return if (storeId == null) null else store.storeId.eq(storeId)
    }
}