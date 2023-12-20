package com.waitring.waitring.member.dto

import io.swagger.v3.oas.annotations.media.Schema
import javax.validation.constraints.NotBlank

@Schema(description = "로그인 요청")
data class LoginInput (

        @field:Schema(description = "휴대폰번호", example = "01012345678")
        @field:NotBlank(message = "휴대폰번호는 필수입니다.")
        var phoneNo : String,

        @field:Schema(description = "비밀번호", example = "password")
        @field:NotBlank(message = "비밀번호는 필수입니다.")
        var password : String,
)