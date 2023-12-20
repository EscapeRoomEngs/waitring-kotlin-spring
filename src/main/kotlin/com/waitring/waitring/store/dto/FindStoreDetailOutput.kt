package com.waitring.waitring.store.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(defaultValue = "가게 상세조회 응답")
data class FindStoreDetailOutput (

        @field:Schema(description = "가게명")
        var storeNm : String,

        @field:Schema(description = "가게 설명")
        var storeDetail : String,

        @field:Schema(description = "쇼핑센터카테고리명")
        var mallCtgNm : String,

        @field:Schema(description = "쇼핑센터명")
        var mallNm : String,

        @field:Schema(description = "위치")
        var locate : String,

        @field:Schema(description = "오픈시간")
        var openTm : String,

        @field:Schema(description = "마감시간")
        var closeTm : String,

        @field:Schema(description = "휴무일")
        var closeDay : String,

        @field:Schema(description = "전화번호")
        var telNo : String,

        @field:Schema(description = "웨이팅 가능 여부(true : 가능, false : 불가능)")
        var waitingFg : Boolean,

        @field:Schema(description = "대기팀 수")
        var waitingTeamCnt : Long,

        @field:Schema(description = "예상 대기시간")
        var waitingTm : Int,

        @field:Schema(description = "관심가게 수")
        var likedStoreCnt : Long,

        @field:Schema(description = "가게 이미지링크")
        var storeImageLink : String?
)