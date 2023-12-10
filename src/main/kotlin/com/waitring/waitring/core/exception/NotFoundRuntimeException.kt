package com.waitring.waitring.core.exception

import com.waitring.waitring.core.dto.ErrorCode

class NotFoundRuntimeException(val errorCode: ErrorCode) : RuntimeException() {
}