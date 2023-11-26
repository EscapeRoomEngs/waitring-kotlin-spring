package com.waitring.waitring.common.dto

import org.springframework.http.HttpStatus

enum class SuccessCode(val status: HttpStatus, val message: String) {

    /** 200 OK 성공  */
    FIND_STORE_CTG_ALL_OK(HttpStatus.OK, "가게카테고리 목록조회가 완료되었습니다.");

    /** 201 CREATED 새로운 리소스 생성  */
}