package com.waitring.waitring.core.exception

import com.waitring.waitring.core.dto.ErrorCode

class ConflictRuntimeException(val errorCode: ErrorCode) : RuntimeException() {
}