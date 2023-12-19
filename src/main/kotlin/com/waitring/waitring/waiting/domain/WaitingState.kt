package com.waitring.waitring.waiting.domain

enum class WaitingState(val value : String) {
    WAITING("대기중"),
    FINISH("이용완료"),
    CANCEL("취소")
}