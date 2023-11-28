package com.waitring.waitring.common.exception

import com.waitring.waitring.common.dto.ApiResponse.Companion.respError
import com.waitring.waitring.common.dto.ApiResponse.Companion.respValidError
import com.waitring.waitring.common.dto.ErrorCode
import com.waitring.waitring.logger
import org.springframework.http.HttpStatus
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.authentication.DisabledException
import org.springframework.validation.BindException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    val log = logger()

    /** 401 BAD_REQUEST */
    // 유효성 검증 실패
    @ExceptionHandler(BindException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleBind(e: BindException): Any {
        log.info("handleBindException: ", e)
        val message: String = e.bindingResult.allErrors[0].defaultMessage.toString()
        return respValidError(ErrorCode.INVALID_PARAMETER, message)
    }

//    // 잘못된 데이터 형식
//    @ExceptionHandler(HttpMessageNotReadableException::class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    fun handleHttpMessageNotReadable(e: HttpMessageNotReadableException): Any {
//        log.info("handleHttpMessageNotReadableException: ", e)
//        return respError(ErrorCode.INVALID_TYPE)
//    }
//
//    // 데이터 무결성 제약조건 위배
//    @ExceptionHandler(DataIntegrityViolationException::class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    fun handleDataIntegrityViolation(e: DataIntegrityViolationException): Any {
//        log.info("handleDataIntegrityViolationException: ", e)
//        return respError(ErrorCode.DATA_INTEGRITY_VIOLATION)
//    }

    /** 401 UNAUTHORIZED  */ // 아이디 또는 비밀번호 불일치
    @ExceptionHandler(BadCredentialsException::class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    fun handleBadCredential(e: BadCredentialsException?): Any {
        log.info("handleBadCredentialException: ", e)
        return respError(ErrorCode.BAD_CREDENTIALS)
    }

    // 계정 비활성화
    @ExceptionHandler(DisabledException::class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    fun handleDisabled(e: DisabledException?): Any {
        log.info("handleDisabledException: ", e)
        return respError(ErrorCode.USER_DEACTIVATE)
    }

    /** 403 FORBIDDEN  */ // 접근 권한 없음
    @ExceptionHandler(AccessDeniedException::class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    fun handleAccessDenied(e: AccessDeniedException?): Any {
        log.info("handleAccessDeniedException: ", e)
        return respError(ErrorCode.ACCESS_DENIED)
    }

    /** 404 NOT_FOUND  */ // 런타임 예외 발생 (잘못된 리소스 접근)
    @ExceptionHandler(NotFoundRuntimeException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleNotFoundRuntime(e: NotFoundRuntimeException): Any {
        log.info("handleNotFoundRuntimeException: ", e)
        return respError(e.errorCode)
    }

    // 부적절한 파라미터 전달
    @ExceptionHandler(IllegalArgumentException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleIllegalArgument(e: IllegalArgumentException?): Any {
        log.info("handleIllegalArgumentException: ", e)
        return respError(ErrorCode.NOT_FOUND)
    }

    // 부적절한 상태
    @ExceptionHandler(IllegalStateException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleIllegalState(e: IllegalStateException?): Any {
        log.info("handleIllegalStateException: ", e)
        return respError(ErrorCode.NOT_FOUND)
    }

    /** 409 CONFLICT  */ // 클라이언트의 요청이 서버의 상태와 충돌 발생 (비즈니스 로직상 불가능)
    @ExceptionHandler(ConflictRuntimeException::class)
    @ResponseStatus(HttpStatus.CONFLICT)
    fun handleConflictRuntime(e: ConflictRuntimeException): Any {
        log.info("handleConflictRuntimeException: ", e)
        return respError(e.errorCode)
    }

    /** 500 INTERNAL_SERVER_ERROR  */ // 나머지 모든 예외
    @ExceptionHandler(Exception::class)
    fun handleAll(e: Exception?): Any {
        log.info("handleException: ", e)
        return respError(ErrorCode.INTERNAL_SERVER_ERROR)
    }
}