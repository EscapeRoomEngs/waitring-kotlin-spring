package com.waitring.waitring.common.exception

import com.waitring.waitring.common.dto.ErrorCode

class NotFoundRuntimeException(val errorCode: ErrorCode) : RuntimeException() {
}