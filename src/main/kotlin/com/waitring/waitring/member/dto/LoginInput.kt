package com.waitring.waitring.member.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "로그인 요청")
data class LoginInput (

        @field:Schema(description = "휴대폰번호", example = "01012345678")
        var phoneNo : String,

        @field:Schema(description = "비밀번호", example = "password")
        var password : String,
)