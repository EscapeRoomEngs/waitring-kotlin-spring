package com.waitring.waitring.waiting.service

import com.waitring.waitring.waiting.domain.WaitingState
import com.waitring.waitring.waiting.repository.WaitingRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class WaitingService(private val repository : WaitingRepository) {

    companion object {
        //private val mapper = Mappers.getMapper(StoreMapper::class.java)
    }

    /**
     * 대기팀 수 조회
     * @param storeId 가게 시퀀스번호
     * @return 대기팀 수
     */
    fun getWaitingTeamCnt(storeId : Long) : Long {
        return repository.getWaitingCnt(storeId, WaitingState.WAITING)
    }
}