package com.waitring.waitring.mall.dto

import io.swagger.v3.oas.annotations.media.Schema
import javax.validation.constraints.NotNull

//@Schema(defaultValue = "쇼핑센터카테고리 검색 조건")
data class MallCategoryCondition (

        @field:Schema(description = "회사 시퀀스번호", example = "1")
        @field:NotNull(message = "회사 시퀀스번호는 필수입니다.")
        var companyId : Long,

        @field:Schema(description = "사용여부(true : 사용, false : 미사용)", example = "true")
        var useFg : Boolean?,
)