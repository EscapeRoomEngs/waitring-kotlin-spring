package com.waitring.waitring.mall.dto

import com.waitring.waitring.mall.domain.MallState
import com.waitring.waitring.mall.domain.MallType
import io.swagger.v3.oas.annotations.media.Schema

@Schema(defaultValue = "쇼핑센터 조회 정보")
data class MallInfo (

        @field:Schema(description = "쇼핑센터 시퀀스번호")
        var mallId : Long,

        @field:Schema(description = "쇼핑센터명")
        var mallNm : String,

        @field:Schema(description = "순번")
        var mallSt : MallState,

        @field:Schema(description = "쇼핑센터타입")
        var mallType : MallType,

        @field:Schema(description = "주소")
        var address : String,

        @field:Schema(description = "상세주소")
        var detailAddress : String?,

        @field:Schema(description = "쇼핑센터 위도")
        var mallLat : String,

        @field:Schema(description = "쇼핑센터 경도")
        var mallLng : String,

        @field:Schema(description = "오픈시간")
        var openTm : String,

        @field:Schema(description = "마감시간")
        var closeTm : String,
)