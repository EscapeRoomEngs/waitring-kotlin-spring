package com.waitring.waitring.waiting.repository

import com.waitring.waitring.waiting.domain.WaitingState

interface WaitingRepositoryCustom {
    fun getWaitingCnt(storeId : Long, waitingSt : WaitingState) : Long
}