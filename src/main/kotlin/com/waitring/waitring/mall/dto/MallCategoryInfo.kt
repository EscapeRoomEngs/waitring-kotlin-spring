package com.waitring.waitring.mall.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(defaultValue = "쇼핑센터카테고리 조회 정보")
data class MallCategoryInfo (

        @field:Schema(description = "쇼핑센터카테고리 시퀀스번호")
        var mallCtgId : Long,

        @field:Schema(description = "쇼핑센터카테고리명")
        var mallCtgNm : String,

        @field:Schema(description = "순번")
        var seq : Int,

        @field:Schema(description = "사용여부(true : 사용, false : 미사용)")
        var useFg : Boolean
)