package com.waitring.waitring.core.dto

import org.springframework.http.HttpStatus

enum class SuccessCode(val status: HttpStatus, val message: String) {

    /** 200 OK 성공  */
    FIND_NOTICES_OK(HttpStatus.OK, "공지사항 리스트 조회가 완료되었습니다.");

    /** 201 CREATED 새로운 리소스 생성  */
}