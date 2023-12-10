package com.waitring.waitring.store.service

import com.waitring.waitring.common.service.ImageService
import com.waitring.waitring.store.dto.FindStoreCtgAllOutput
import com.waitring.waitring.store.dto.FindStoreDetailOutput
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class StoreMainService(
        private val storeCategoryService: StoreCategoryService,
        private val storeService: StoreService,
        private val imageService: ImageService
) {

    /**
     * 가게카테고리 목록조회
     * @return 가게카테고리 리스트
     */
    fun findStoreCtgAll() : FindStoreCtgAllOutput {
        return storeCategoryService.findStoreCtgAll()
    }

    /**
     * 가게 상세조회
     * @param storeId 가게 시퀀스번호
     * @return 가게 상세정보
     */
    fun findStoreDetail(storeId : Long) : FindStoreDetailOutput {
        // 1. 가게 상세조회
        val output = storeService.findStoreDetail(storeId)

        // 2. 이미지링크 조회
        val imageLink = imageService.getImageLink(storeId)
        output.storeImageLink = imageLink

        return output
    }
}