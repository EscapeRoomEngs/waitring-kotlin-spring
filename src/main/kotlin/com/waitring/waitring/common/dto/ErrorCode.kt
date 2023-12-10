package com.waitring.waitring.common.dto

import org.springframework.http.HttpStatus

enum class ErrorCode(val status: HttpStatus, val message: String) {

    /** 400 BAD_REQUEST 잘못된 요청 */
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    INVALID_PARAMETER(HttpStatus.BAD_REQUEST, "잘못된 파라미터입니다."),
    INVALID_TYPE(HttpStatus.BAD_REQUEST, "잘못된 데이터 형식입니다. (Date: YYYY-mm-dd, DateTime: YYYY-mm-dd HH:mm:ss)"),
    DATA_INTEGRITY_VIOLATION(HttpStatus.BAD_REQUEST, "데이터 무결성 제약조건을 위배하였습니다."),

    /** 401 UNAUTHORIZED 인증 실패 */
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "자격 증명에 실패하였습니다."),
    BAD_CREDENTIALS(HttpStatus.UNAUTHORIZED, "아이디 또는 비밀번호가 일치하지 않습니다."),
    USER_DEACTIVATE(HttpStatus.UNAUTHORIZED, "계정이 비활성화 상태입니다."),
    WRONG_TOKEN(HttpStatus.UNAUTHORIZED, "잘못된 JWT 서명입니다."),
    EXPIRED_TOKEN(HttpStatus.UNAUTHORIZED, "만료된 JWT 토큰입니다."),
    UNSUPPORTED_TOKEN(HttpStatus.UNAUTHORIZED, "지원하지 않는 JWT 토큰입니다."),
    INVALID_TOKEN(HttpStatus.UNAUTHORIZED, "유효하지 않은 JWT 토큰입니다."),

    /** 403 FORBIDDEN 인가 실패 */
    FORBIDDEN(HttpStatus.FORBIDDEN, "접근이 거부되었습니다."),
    ACCESS_DENIED(HttpStatus.FORBIDDEN, "접근 권한이 없습니다."),

    /** 404 NOT_FOUND 잘못된 리소스 접근 */
    NOT_FOUND(HttpStatus.NOT_FOUND, "잘못된 리소스 접근입니다."),
    STORE_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 가게를 찾을 수 없습니다."),

    /** 409 CONFLICT 클라이언트의 요청이 서버의 상태와 충돌 발생 */

    /** 500 INTERNAL_SERVER_ERROR 서버 에러 */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, " 서버 에러가 발생하였습니다.");
}