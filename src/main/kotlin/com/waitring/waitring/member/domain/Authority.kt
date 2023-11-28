package com.waitring.waitring.member.domain

enum class Authority(val value : String) {
    ROOT_ADMIN("루트관리자"),
    STORE_ADMIN("가게관리자"),
    USER("사용자")
}