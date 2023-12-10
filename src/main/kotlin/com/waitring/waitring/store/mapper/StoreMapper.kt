package com.waitring.waitring.store.mapper

import com.waitring.waitring.store.domain.Store
import com.waitring.waitring.store.dto.FindStoreDetailOutput
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper(componentModel = "spring")
interface StoreMapper {

    @Mappings(
            Mapping(source = "mall.mallCtg.mallCtgNm", target = "mallCtgNm"),
            Mapping(source = "mall.mallNm", target = "mallNm"),
            Mapping(source = "openTm", target = "openTm", dateFormat = "HH:mm"),
            Mapping(source = "closeTm", target = "closeTm", dateFormat = "HH:mm")
    )
    fun toStoreDetail(store : Store) : FindStoreDetailOutput
}