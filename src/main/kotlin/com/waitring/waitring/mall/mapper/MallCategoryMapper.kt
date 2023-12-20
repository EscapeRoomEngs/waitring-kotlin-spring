package com.waitring.waitring.mall.mapper

import com.waitring.waitring.mall.domain.MallCategory
import com.waitring.waitring.mall.dto.MallCategoryInfo
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface MallCategoryMapper {

    fun toMallCtgInfoList(mallCtgList : List<MallCategory>) : List<MallCategoryInfo>

    fun toMallCtgInfo(mallCategory: MallCategory) : MallCategoryInfo
}