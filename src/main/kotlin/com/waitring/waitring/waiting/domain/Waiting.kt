package com.waitring.waitring.waiting.domain

import com.fasterxml.jackson.databind.ser.Serializers.Base
import com.waitring.waitring.member.domain.Member
import com.waitring.waitring.store.domain.Store
import javax.persistence.*

/** 웨이팅 */
@Entity
class Waiting(
        store : Store,
        member : Member,
        waitingSt : WaitingState,
        personnel : Int
) : Base() {

    /** 웨이팅 시퀀스번호 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var waitingId : Long? = null

    /** 가게 시퀀스번호 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", nullable = false)
    var store : Store = store
        protected set

    /** 사용자 시퀀스번호 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    var member : Member = member
        protected set

    /** 웨이팅상태 */
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false, length = 20)
    var waitingSt : WaitingState = waitingSt
        protected set

    /** 인원 */
    @Column(nullable = false)
    var personnel : Int = personnel
        protected set
}