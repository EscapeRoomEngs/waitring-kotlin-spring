package com.waitring.waitring.common.utils

import org.springframework.web.context.request.RequestContextHolder

import org.springframework.web.context.request.ServletRequestAttributes

import javax.servlet.http.HttpServletRequest

object HttpRequestUtils {
    private val request: HttpServletRequest
        get() = (RequestContextHolder.getRequestAttributes() as ServletRequestAttributes?)!!.request

    val currentRequest: HttpServletRequest
        get() = (RequestContextHolder.currentRequestAttributes() as ServletRequestAttributes).request

    val requestURI: String
        get() = request.requestURI
}