package com.waitring.waitring.common.repository

import com.querydsl.core.types.dsl.BooleanExpression
import com.querydsl.jpa.impl.JPAQueryFactory
import com.waitring.waitring.common.domain.Image
import com.waitring.waitring.common.domain.QImage.image
import com.waitring.waitring.store.domain.QStore.store

class ImageRepositoryCustomImpl(private val query: JPAQueryFactory) : ImageRepositoryCustom {

    /**
     * 특정 이미지 조회
     */
    override fun getImage(storeId: Long): Image? {
        return query
                .selectFrom(image)
                .where(
                        eqStoreId(storeId)
                )
                .fetchOne()
    }

    private fun eqStoreId(storeId : Long?) : BooleanExpression? {
        return if (storeId == null) null else store.storeId.eq(storeId)
    }
}