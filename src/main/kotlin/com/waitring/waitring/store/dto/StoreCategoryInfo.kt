package com.waitring.waitring.store.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(defaultValue = "가게카테고리 조회 정보")
data class StoreCategoryInfo (

        @field:Schema(description = "가게카테고리 시퀀스번호")
        val store_id : Long,

        @field:Schema(description = "가게카테고리명")
        val storeCtgNm : String,

        @field:Schema(description = "순번")
        val seq : Int,

        @field:Schema(description = "사용여부(true : 사용, false : 미사용)")
        val useFg : Boolean
)