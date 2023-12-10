package com.waitring.waitring.store.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(defaultValue = "가게 상세조회 응답")
data class FindStoreDetailOutput (

        @field:Schema(description = "가게명")
        val storeNm : String,

        @field:Schema(description = "가게 설명")
        val storeDetail : String,

        @field:Schema(description = "쇼핑센터카테고리명")
        val mallCtgNm : String,

        @field:Schema(description = "쇼핑센터명")
        val mallNm : String,

        @field:Schema(description = "위치")
        val locate : String,

        @field:Schema(description = "오픈시간")
        val openTm : String,

        @field:Schema(description = "마감시간")
        val closeTm : String,

        @field:Schema(description = "휴무일")
        val closeDay : String,

        @field:Schema(description = "전화번호")
        val telNo : String,

        @field:Schema(description = "웨이팅 가능 여부(true : 가능, false : 불가능)")
        val waitingFg : Boolean,

        @field:Schema(description = "예상 대기시간")
        val waitingTm : Int,
)