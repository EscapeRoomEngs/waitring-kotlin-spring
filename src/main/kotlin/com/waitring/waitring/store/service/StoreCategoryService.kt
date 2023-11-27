package com.waitring.waitring.store.service

import com.waitring.waitring.store.dto.FindStoreCtgAllOutput
import com.waitring.waitring.store.mapper.StoreCategoryMapper
import com.waitring.waitring.store.repository.StoreCategoryRepository
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class StoreCategoryService(private val repository : StoreCategoryRepository) {

    companion object {
        private val mapper = Mappers.getMapper(StoreCategoryMapper::class.java)
    }

    /**
     * 가게카테고리 목록조회
     * @return 가게카테고리 리스트
     */
    fun findStoreCtgAll() : FindStoreCtgAllOutput {
        val storeCtgList = repository.findAllByOrderBySeqAsc()
        return FindStoreCtgAllOutput(mapper.toStoreCtgInfoList(storeCtgList))
    }
}