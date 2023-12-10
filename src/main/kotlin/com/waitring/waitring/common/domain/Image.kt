package com.waitring.waitring.common.domain

import com.fasterxml.jackson.databind.ser.Serializers.Base
import com.waitring.waitring.store.domain.Store
import javax.persistence.*

/** 이미지 */
@Entity
class Image(
        store : Store,
        imageLink : String,
) : Base() {

    /** 이미지 시퀀스번호 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var imageId : Long? = null

    /** 가게 시퀀스번호 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    var store : Store = store
        protected set

    /** 이미지링크 */
    @Column(columnDefinition = "TEXT")
    var imageLink : String = imageLink
        protected set
}