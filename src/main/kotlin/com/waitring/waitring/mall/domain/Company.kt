package com.waitring.waitring.mall.domain

import com.waitring.waitring.core.domain.Base
import javax.persistence.*

/** 회사 */
@Entity
class Company(
        companyNm : String,
        companySt : CompanyState,
) : Base() {

    /** 회사 시퀀스번호 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var companyId : Long? = null

    /** 회사명 */
    @Column(nullable = false, length = 80)
    var companyNm : String = companyNm
        protected set

    /** 쇼핑센터상태 */
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false, length = 20)
    var companySt : CompanyState = companySt
        protected set
}