package com.waitring.waitring.member.repository

import com.querydsl.core.types.dsl.BooleanExpression
import com.querydsl.jpa.impl.JPAQueryFactory
import com.waitring.waitring.member.domain.QLikedStore.likedStore
import com.waitring.waitring.store.domain.QStore.store

class LikedStoreRepositoryCustomImpl(private val query: JPAQueryFactory) : LikedStoreRepositoryCustom {

    /**
     * 관심가게 수 조회
     */
    override fun getLikedStoreCnt(storeId: Long): Long {
        return query
                .select(likedStore.count())
                .from(likedStore)
                .where(
                        eqStoreId(storeId)
                )
                .fetchOne() ?: 0L
    }

    private fun eqStoreId(storeId : Long?) : BooleanExpression? {
        return if (storeId == null) null else store.storeId.eq(storeId)
    }
}