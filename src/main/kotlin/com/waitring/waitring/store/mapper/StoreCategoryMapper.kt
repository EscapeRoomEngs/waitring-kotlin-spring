package com.waitring.waitring.store.mapper

import com.waitring.waitring.store.dto.FindStoreCtgAllOutput
import com.waitring.waitring.store.dto.StoreCategoryInfo
import com.waitring.waitring.store.entity.StoreCategory
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface StoreCategoryMapper {

    fun toStoreCtgInfoList(storeCtgList : List<StoreCategory>) : List<StoreCategoryInfo>

    fun toStoreCtgInfo(storeCategory: StoreCategory) : StoreCategoryInfo
}