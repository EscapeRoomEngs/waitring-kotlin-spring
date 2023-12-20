package com.waitring.waitring.member.repository

interface LikedStoreRepositoryCustom {
    fun getLikedStoreCnt(storeId : Long) : Long
}