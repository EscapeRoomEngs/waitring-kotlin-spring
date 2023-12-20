package com.waitring.waitring.mall.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "쇼핑센터카테고리 목록조회 응답")
data class FindMallCtgAllOutput (

        @field:Schema(description = "쇼핑센터카테고리목록")
        var mallCtgList : List<MallCategoryInfo>,
)