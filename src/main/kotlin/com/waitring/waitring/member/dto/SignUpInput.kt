package com.waitring.waitring.member.dto

import com.fasterxml.jackson.annotation.JsonFormat
import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDateTime
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Schema(description = "로그인 요청")
data class SignUpInput (

        @field:Schema(description = "휴대폰번호", example = "01012345678")
        @field:NotBlank(message = "휴대폰번호는 필수입니다.")
        var phoneNo : String,

        @field:Schema(description = "비밀번호", example = "password")
        @field:NotBlank(message = "비밀번호는 필수입니다.")
        var password : String,

        @field:Schema(description = "위치정보 이용 동의 여부", example = "true")
        @field:NotNull(message = "위치정보 이용 동의 여부는 필수입니다.")
        var locateUseFg : Boolean,

        @field:Schema(description = "위치정보 이용 동의 일시", example = "2023-01-01 12:34:56", pattern = "yyyy-MM-dd HH:mm:ss", type = "string")
        @field:NotNull(message = "위치정보 이용 동의 일시는 필수입니다.")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
        var locateUseDt : LocalDateTime,

        @field:Schema(description = "개인정보 이용 동의 여부", example = "true")
        @field:NotNull(message = "개인정보 이용 동의 여부는 필수입니다.")
        var personalUseFg : Boolean,

        @field:Schema(description = "개인정보 이용 동의 일시", example = "2023-01-01 12:34:56", pattern = "yyyy-MM-dd HH:mm:ss", type = "string")
        @field:NotNull(message = "개인정보 이용 동의 일시는 필수입니다.")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
        var personalUseDt : LocalDateTime,

        @field:Schema(description = "서비스 이용 동의 여부", example = "true")
        @field:NotNull(message = "서비스 이용 동의 여부는 필수입니다.")
        var serviceUseFg : Boolean,

        @field:Schema(description = "서비스 이용 동의 일시", example = "2023-01-01 12:34:56", pattern = "yyyy-MM-dd HH:mm:ss", type = "string")
        @field:NotNull(message = "서비스 이용 동의 일시는 필수입니다.")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
        var serviceUseDt : LocalDateTime,

        @field:Schema(description = "알림 수신 동의 여부", example = "true")
        @field:NotNull(message = "알림 수신 동의 여부는 필수입니다.")
        var alarmReceiveFg : Boolean,

        @field:Schema(description = "알림 수신 동의 일시", example = "2023-01-01 12:34:56", pattern = "yyyy-MM-dd HH:mm:ss", type = "string")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
        var alarmReceiveDt : LocalDateTime,
)