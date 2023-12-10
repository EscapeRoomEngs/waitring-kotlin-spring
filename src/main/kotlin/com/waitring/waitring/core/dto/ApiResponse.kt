package com.waitring.waitring.core.dto

import com.waitring.waitring.core.utils.HttpRequestUtils
import io.swagger.v3.oas.annotations.media.Schema
import com.waitring.waitring.core.dto.ApiResponse as ApiResponse

@Schema(description = "응답 API")
class ApiResponse<T> (
        @field:Schema(description = "요청 URL")
        val path: String?,

        @field:Schema(description = "응답상태")
        val status: Status?,

        @field:Schema(description = "응답결과")
        val result: Result?,

        @field:Schema(description = "응답데이터")
        val output: T? = null
) {

    companion object {
        fun <T> respSuccess(code: SuccessCode, output: T): ApiResponse<T> {
            return ApiResponse(
                    path = HttpRequestUtils.requestURI,
                    status = Status(code),
                    result = Result(code),
                    output = output
            )
        }

        fun respSuccessWithNoData(code: SuccessCode): ApiResponse<Any> {
            return ApiResponse(
                    path = HttpRequestUtils.requestURI,
                    status = Status(code),
                    result = Result(code)
            )
        }

        fun respError(code: ErrorCode): ApiResponse<Any> {
            return ApiResponse(
                    path = HttpRequestUtils.requestURI,
                    status = Status(code),
                    result = Result(code)
            )
        }

        fun respValidError(code: ErrorCode, message: String): ApiResponse<Any> {
            return ApiResponse(
                    path = HttpRequestUtils.requestURI,
                    status = Status(code),
                    result = Result(code.name, message)
            )
        }
    }
}