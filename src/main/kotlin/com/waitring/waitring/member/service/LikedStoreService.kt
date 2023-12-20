package com.waitring.waitring.member.service

import com.waitring.waitring.member.repository.LikedStoreRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class LikedStoreService(private val repository: LikedStoreRepository) {

    companion object {
        //private val mapper = Mappers.getMapper(MemberMapper::class.java)
    }

    /**
     * 관심가게 수 조회
     * @param storeId 가게 시퀀스번호
     * @return 관심가게 수
     */
    fun getLikedStoreCnt(storeId : Long) : Long {
        return repository.getLikedStoreCnt(storeId)
    }
}