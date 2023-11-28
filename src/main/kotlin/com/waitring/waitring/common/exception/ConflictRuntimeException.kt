package com.waitring.waitring.common.exception

import com.waitring.waitring.common.dto.ErrorCode

class ConflictRuntimeException(val errorCode: ErrorCode) : RuntimeException() {
}