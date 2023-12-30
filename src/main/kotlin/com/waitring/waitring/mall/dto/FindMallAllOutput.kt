package com.waitring.waitring.mall.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "쇼핑센터 목록조회 응답")
data class FindMallAllOutput (

        @field:Schema(description = "쇼핑센터목록")
        var mallList : Map<String, List<MallInfo>>,
)