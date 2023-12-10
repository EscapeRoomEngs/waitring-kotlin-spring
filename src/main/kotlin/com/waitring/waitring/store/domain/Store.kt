package com.waitring.waitring.store.domain

import com.waitring.waitring.common.domain.Base
import com.waitring.waitring.mall.domain.Mall
import java.time.LocalTime
import javax.persistence.*

/** 가게 */
@Entity
class Store(
        mall : Mall,
        storeCtg : StoreCategory,
        storeNm : String,
        storeDetail : String? = null,
        storeSt : StoreState,
        locate : String,
        openTm : LocalTime,
        closeTm : LocalTime,
        closeDay : String? = null,
        telNo : String,
        waitingFg : Boolean,
        waitingTm : Int,
) : Base() {

    /** 가게 시퀀스번호 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var storeId : Long? = null

    /** 쇼핑센터 시퀀스번호 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mall_id", nullable = false)
    var mall : Mall = mall
        protected set

    /** 가게카테고리 시퀀스번호 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_ctg_id", nullable = false)
    var storeCtg : StoreCategory = storeCtg
        protected set

    /** 가게명 */
    @Column(nullable = false, length = 80)
    var storeNm : String = storeNm
        protected set

    /** 가게 설명 */
    @Column(columnDefinition = "TEXT")
    var storeDetail : String? = storeDetail
        protected set

    /** 가게상태 */
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false, length = 20)
    var storeSt : StoreState = storeSt
        protected set

    /** 위치 */
    @Column(nullable = false, length = 80)
    var locate : String = locate
        protected set

    /** 오픈시간 */
    @Column(nullable = false)
    var openTm : LocalTime = openTm
        protected set

    /** 마감시간 */
    @Column(nullable = false)
    var closeTm : LocalTime = closeTm
        protected set

    /** 휴무일 */
    @Column(nullable = false, length = 80)
    var closeDay : String? = closeDay
        protected set

    /** 전화번호 */
    @Column(nullable = false, length = 20)
    var telNo : String = telNo
        protected set

    /**
     * 웨이팅 가능 여부
     * true : 가능
     * false : 불가능
     */
    @Column(nullable = false)
    var waitingFg : Boolean = waitingFg
        protected set

    /** 예상 대기시간 */
    @Column(nullable = false)
    var waitingTm : Int = waitingTm
        protected set
}