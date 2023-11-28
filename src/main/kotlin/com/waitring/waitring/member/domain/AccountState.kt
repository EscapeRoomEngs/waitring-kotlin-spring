package com.waitring.waitring.member.domain

enum class AccountState(val value : String) {
    ACTIVATE("활성화"),
    DEACTIVATE("비활성화"),
    DORMANCY("휴면")
}