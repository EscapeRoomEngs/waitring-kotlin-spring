package com.waitring.waitring.core.dto

import org.springframework.http.HttpStatus

enum class SuccessCode(val status: HttpStatus, val message: String) {

    /** 200 OK 성공  */
    // store
    FIND_STORE_CTG_ALL_OK(HttpStatus.OK, "가게카테고리 목록조회가 완료되었습니다."),
    FIND_STORE_DETAIL_OK(HttpStatus.OK, "가게 상세조회가 완료되었습니다."),

    /** 201 CREATED 새로운 리소스 생성  */
    SIGN_UP_OK(HttpStatus.CREATED, "회원가입이 완료되었습니다."),
    LOGIN_OK(HttpStatus.CREATED, "로그인이 완료되었습니다.");
}