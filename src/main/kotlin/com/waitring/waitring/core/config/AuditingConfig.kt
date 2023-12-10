package com.waitring.waitring.core.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.AuditorAware
import java.util.*

@Configuration
class AuditingConfig {

    // TODO: 사용자 로그인 아이디로 바꾸기
    @Bean
    fun auditorAware() = AuditorAware { Optional.of("test") }
}