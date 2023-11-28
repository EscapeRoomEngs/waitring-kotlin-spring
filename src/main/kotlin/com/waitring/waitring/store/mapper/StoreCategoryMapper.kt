package com.waitring.waitring.store.mapper

import com.waitring.waitring.store.dto.StoreCategoryInfo
import com.waitring.waitring.store.domain.StoreCategory
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface StoreCategoryMapper {

    fun toStoreCtgInfoList(storeCtgList : List<StoreCategory>) : List<StoreCategoryInfo>

    fun toStoreCtgInfo(storeCategory: StoreCategory) : StoreCategoryInfo
}