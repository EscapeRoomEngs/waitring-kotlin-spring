package com.waitring.waitring.common.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "응답결과")
class Result (
        @field:Schema(description = "결과코드명")
        var resultNm: String? = null,

        @field:Schema(description = "결과메시지")
        var resultMsg: String? = null
) {

    constructor(code: SuccessCode) : this(){
        this.resultNm = code.name
        this.resultMsg = code.message
    }

    constructor(code: ErrorCode) : this() {
        this.resultNm = code.name
        this.resultMsg = code.message
    }
}