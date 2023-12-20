package com.waitring.waitring.mall.domain

import com.waitring.waitring.core.domain.Base
import java.time.LocalTime
import javax.persistence.*

/** 쇼핑센터 */
@Entity
class Mall(
        mallCtg : MallCategory,
        mallNm : String,
        mallSt : MallState,
        mallType : MallType,
        zipcode : String,
        address : String,
        detailAddress : String? = null,
        mallLat : String,
        mallLng : String,
        openTm : LocalTime,
        closeTm : LocalTime,
        telNo : String,
) : Base() {

    /** 쇼핑센터 시퀀스번호 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var mallId : Long? = null

    /** 쇼핑센터카테고리 시퀀스번호 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mall_ctg_id", nullable = false)
    var mallCtg : MallCategory = mallCtg
        protected set

    /** 쇼핑센터명 */
    @Column(nullable = false, length = 80)
    var mallNm : String = mallNm
        protected set

    /** 쇼핑센터상태 */
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false, length = 20)
    var mallSt : MallState = mallSt
        protected set

    /** 쇼핑센터타입 */
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false, length = 40)
    var mallType : MallType = mallType
        protected set

    /** 우편번호 */
    @Column(nullable = false, length = 10)
    var zipcode : String = zipcode
        protected set

    /** 주소 */
    @Column(nullable = false, length = 400)
    var address : String = address
        protected set

    /** 상세주소 */
    @Column(length = 200)
    var detailAddress : String? = detailAddress
        protected set

    /** 쇼핑센터 위도 */
    @Column(nullable = false, length = 40)
    var mallLat : String = mallLat
        protected set

    /** 쇼핑센터 경도 */
    @Column(nullable = false, length = 40)
    var mallLng : String = mallLng
        protected set

    /** 오픈시간 */
    @Column(nullable = false)
    var openTm : LocalTime = openTm
        protected set

    /** 마감시간 */
    @Column(nullable = false)
    var closeTm : LocalTime = closeTm
        protected set

    /** 전화번호 */
    @Column(nullable = false, length = 20)
    var telNo : String = telNo
        protected set
}