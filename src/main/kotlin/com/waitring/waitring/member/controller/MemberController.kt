package com.waitring.waitring.member.controller

import com.waitring.waitring.common.dto.ApiResponse
import com.waitring.waitring.common.dto.SuccessCode
import com.waitring.waitring.member.dto.LoginInput
import com.waitring.waitring.member.dto.SignUpInput
import com.waitring.waitring.member.service.MemberService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@Tag(name = "사용자 API")
@RestController
@RequestMapping("/members")
class MemberController(private val memberService: MemberService) {

    /**
     * 회원가입
     * @param input 회원가입 요청
     * @return 회원가입 응답
     */
    @Operation(summary = "회원가입")
    @PostMapping
    fun signUp(@RequestBody input: @Valid SignUpInput): ApiResponse<Any> {
        memberService.signUp(input)
        return ApiResponse.respSuccessWithNoData(SuccessCode.SIGN_UP_OK)
    }

    /**
     * 로그인
     * @param input 로그인 요청
     * @return 로그인 응답
     */
    @Operation(summary = "로그인")
    @PostMapping("/login")
    fun login(@RequestBody input: @Valid LoginInput): ApiResponse<Any> {
        memberService.login(input)
        return ApiResponse.respSuccessWithNoData(SuccessCode.LOGIN_OK)
    }
}