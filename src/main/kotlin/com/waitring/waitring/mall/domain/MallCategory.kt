package com.waitring.waitring.mall.domain

import com.waitring.waitring.core.domain.Base
import javax.persistence.*

/** 쇼핑센터카테고리 */
@Entity
class MallCategory(
        mallCtgNm : String,
        seq : Int,
        useFg : Boolean
) : Base() {

    /** 쇼핑센터카테고리 시퀀스번호 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var mallCtgId : Long? = null

    /** 쇼핑센터카테고리명 */
    @Column(nullable = false, length = 80)
    var mallCtgNm : String = mallCtgNm
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