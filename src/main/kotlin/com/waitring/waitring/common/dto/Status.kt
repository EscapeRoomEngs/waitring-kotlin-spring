package com.waitring.waitring.common.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "응답상태")
class Status (
        @field:Schema(description = "HTTP 상태코드")
        var statusCd: Int? = null,

        @field:Schema(description = "HTTP 상태코드명")
        var statusNm: String? = null
){

    constructor(code: SuccessCode) : this() {
        this.statusCd = code.status.value()
        this.statusNm = code.status.name
    }

    constructor(code: ErrorCode) : this() {
        this.statusCd = code.status.value()
        this.statusNm = code.status.name
    }
}