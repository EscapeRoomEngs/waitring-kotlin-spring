package com.waitring.waitring.common.service

import com.waitring.waitring.common.repository.ImageRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class ImageService(private val repository : ImageRepository) {

    /**
     * 이미지 링크 조회
     * @param 가게 시퀀스번호
     * @return 이미지 링크
     */
    fun getImageLink(storeId : Long) : String {
        val image = repository.getImage(storeId)
        return image?.imageLink ?: ""
    }
}