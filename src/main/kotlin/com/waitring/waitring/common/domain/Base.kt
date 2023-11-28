package com.waitring.waitring.common.domain

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

/** 공통 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class Base {

    /** 생성일자 */
    @CreatedDate
    @Column(nullable = false, updatable = false)
    var createDt : LocalDateTime? = null
        protected set

    /** 수정일자 */
    @LastModifiedDate
    @Column(nullable = false)
    var updateDt : LocalDateTime? = null
        protected set

    /** 생성자 */
    @CreatedBy
    @Column(nullable = false, updatable = false, length = 20)
    var creater : String? = null
        protected set

    /** 수정자 */
    @LastModifiedBy
    @Column(nullable = false, length = 20)
    var updater : String? = null
        protected set
}