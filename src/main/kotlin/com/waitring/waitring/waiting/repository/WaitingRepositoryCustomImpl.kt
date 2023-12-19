package com.waitring.waitring.waiting.repository

import com.querydsl.core.types.dsl.BooleanExpression
import com.querydsl.jpa.impl.JPAQueryFactory
import com.waitring.waitring.store.domain.QStore.store
import com.waitring.waitring.waiting.domain.QWaiting.waiting
import com.waitring.waitring.waiting.domain.WaitingState

class WaitingRepositoryCustomImpl(private val query: JPAQueryFactory) : WaitingRepositoryCustom {

    /**
     * 웨이팅 수 조회
     * @param storeId 가게 시퀀스번호
     * @param waitingSt 웨이팅상태
     * @return 웨이팅 수
     */
    override fun getWaitingCnt(storeId: Long, waitingSt : WaitingState): Long {
        return query
                .select(waiting.count())
                .from(waiting)
                .join(waiting.store, store)
                .where(
                        eqStoreId(storeId),
                        eqWaitingSt(waitingSt)
                )
                .fetchOne() ?: 0L
    }

    private fun eqStoreId(storeId : Long?) : BooleanExpression? {
        return if (storeId == null) null else store.storeId.eq(storeId)
    }

    private fun eqWaitingSt(waitingSt: WaitingState?) : BooleanExpression? {
        return if (waitingSt == null) null else waiting.waitingSt.eq(waitingSt)
    }
}