package com.waitring.waitring.store.service

import com.waitring.waitring.core.dto.ErrorCode
import com.waitring.waitring.core.exception.ConflictRuntimeException
import com.waitring.waitring.store.dto.FindStoreDetailOutput
import com.waitring.waitring.store.mapper.StoreMapper
import com.waitring.waitring.store.repository.StoreRepository
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class StoreService(private val repository : StoreRepository) {

    companion object {
        private val mapper = Mappers.getMapper(StoreMapper::class.java)
    }

    /**
     * 가게 상세조회
     * @param storeId 가게 시퀀스번호
     * @return 가게 상세정보
     */
    fun findStoreDetail(storeId : Long) : FindStoreDetailOutput {
        val store = repository.getStore(storeId) ?: throw ConflictRuntimeException(ErrorCode.STORE_NOT_FOUND)
        return mapper.toStoreDetail(store)
    }
}