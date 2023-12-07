package com.waitring.waitring.member.domain

import com.waitring.waitring.common.domain.Base
import java.time.LocalDateTime
import javax.persistence.*

/** 사용자  */
@Entity
class Member(
        phoneNo : String,
        password : String,
        accountSt : AccountState,
        authority: Authority,
        locateUseFg : Boolean,
        locateUseDt : LocalDateTime,
        personalUseFg : Boolean,
        personalUseDt : LocalDateTime,
        serviceUseFg : Boolean,
        serviceUseDt : LocalDateTime,
        alarmReceiveFg : Boolean,
        alarmReceiveDt : LocalDateTime? = null
) : Base() {

    /** 사용자 시퀀스번호 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var memberId: Long? = null

    /** 휴대폰번호 */
    @Column(nullable = false, unique = true, length = 20)
    var phoneNo : String = phoneNo
        protected set

    /** 비밀번호 */
    @Column(nullable = false, columnDefinition = "TEXT")
    var password : String = password
        protected set

    /** 계정상태 */
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false, length = 20)
    var accountSt : AccountState = accountSt
        protected set

    /** 권한 */
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false, length = 20)
    var authority : Authority = authority
        protected set

    /** 위치정보 이용 동의 여부 */
    @Column(nullable = false)
    var locateUseFg : Boolean = locateUseFg
        protected set

    /** 위치정보 이용 동의 일시 */
    @Column(nullable = false)
    var locateUseDt : LocalDateTime = locateUseDt
        protected set

    /** 개인정보 이용 동의 여부 */
    @Column(nullable = false)
    var personalUseFg : Boolean = personalUseFg
        protected set

    /** 개인정보 이용 동의 일시 */
    @Column(nullable = false)
    var personalUseDt : LocalDateTime = personalUseDt
        protected set

    /** 서비스 이용 동의 여부 */
    @Column(nullable = false)
    var serviceUseFg : Boolean = serviceUseFg
        protected set

    /** 서비스 이용 동의 일시 */
    @Column(nullable = false)
    var serviceUseDt : LocalDateTime = serviceUseDt
        protected set

    /** 알림 수신 동의 여부 */
    @Column(nullable = false)
    var alarmReceiveFg : Boolean = alarmReceiveFg
        protected set

    /** 알림 수신 동의 일시 */
    var alarmReceiveDt : LocalDateTime? = alarmReceiveDt
        protected set
}