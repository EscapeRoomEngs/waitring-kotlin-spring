package com.waitring.waitring.store.domain

import com.waitring.waitring.common.domain.Base
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/** 가게카테고리 */
@Entity
class StoreCategory(
        storeCtgNm : String,
        seq : Int,
        useFg : Boolean
) : Base() {

    /** 가게카테고리 시퀀스번호 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var storeCtgId : Long? = null

    /** 가게카테고리명 */
    @Column(nullable = false, length = 80)
    var storeCtgNm : String = storeCtgNm
        protected set

    /** 순번 */
    @Column(nullable = false)
    var seq : Int = seq
        protected set

    /**
     * 사용여부
     * true : 사용
     * false : 미사용
     */
    @Column(nullable = false)
    var useFg : Boolean = useFg
        protected set
}