package com.waitring.waitring.mall.mapper

import com.waitring.waitring.mall.domain.Mall
import com.waitring.waitring.mall.dto.MallInfo
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper(componentModel = "spring")
interface MallMapper {

    @Mappings(
            Mapping(source = "openTm", target = "openTm", dateFormat = "HH:mm"),
            Mapping(source = "closeTm", target = "closeTm", dateFormat = "HH:mm")
    )
    fun toMallInfo(mall : Mall) : MallInfo
}