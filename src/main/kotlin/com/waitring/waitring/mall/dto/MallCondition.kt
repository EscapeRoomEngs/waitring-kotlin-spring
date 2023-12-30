package com.waitring.waitring.mall.dto

import io.swagger.v3.oas.annotations.media.Schema
import javax.validation.constraints.NotNull

//@Schema(defaultValue = "쇼핑센터 검색 조건")
data class MallCondition (

        @field:Schema(description = "쇼핑센터카테고리 시퀀스번호", example = "1")
        @field:NotNull(message = "쇼핑센터카테고리 시퀀스번호는 필수입니다.")
        var mallCtgId : Long?,

        @field:Schema(description = "쇼핑센터상태(OPERATE : 운영, CLOSURE : 폐점, STOP : 휴점)", example = "OPERATE")
        var mallSt : String?,
)