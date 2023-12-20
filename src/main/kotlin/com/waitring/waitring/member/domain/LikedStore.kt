package com.waitring.waitring.member.domain

import com.waitring.waitring.core.domain.Base
import com.waitring.waitring.store.domain.Store
import javax.persistence.*

/** 관심가게 */
@Entity
class LikedStore(
        store : Store,
        member : Member
) : Base() {

    /** 관심가게 시퀀스번호 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var likedStoreId: Long? = null

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
}