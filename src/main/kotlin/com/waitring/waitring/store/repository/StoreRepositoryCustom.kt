package com.waitring.waitring.store.repository

import com.waitring.waitring.store.domain.Store

interface StoreRepositoryCustom {
    fun getStore(storeId : Long) : Store?
}