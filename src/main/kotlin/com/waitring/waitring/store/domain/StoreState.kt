package com.waitring.waitring.store.domain

enum class StoreState(val value : String) {
    OPERATE("운영"),
    CLOSURE("폐점"),
    STOP("휴점")
}