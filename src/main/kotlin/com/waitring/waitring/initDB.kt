package com.waitring.waitring

import com.waitring.waitring.store.domain.StoreCategory
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.persistence.EntityManager
import javax.transaction.Transactional

/**
 * 테스트 데이터
 */
@Component
@Profile("!test")
class InitDB(private val initService: InitService) {

    @PostConstruct
    fun init() {
        initService.dbInit()
    }

    @Component
    @Transactional
    class InitService(private val em: EntityManager) {

        @Transactional
        fun dbInit() {
            /**
             * 가게카테고리 테스트 데이터
             */
            val storeCtg1 = StoreCategory(
                    storeCtgNm = "여성패션",
                    seq = 1,
                    useFg = true
            )
            em.persist(storeCtg1)

            val storeCtg2 = StoreCategory(
                    storeCtgNm = "영패션",
                    seq = 2,
                    useFg = true
            )
            em.persist(storeCtg2)

            val storeCtg3 = StoreCategory(
                    storeCtgNm = "패션 액세서리",
                    seq = 3,
                    useFg = true
            )
            em.persist(storeCtg3)

            val storeCtg4 = StoreCategory(
                    storeCtgNm = "화장품",
                    seq = 4,
                    useFg = true
            )
            em.persist(storeCtg4)

            val storeCtg5 = StoreCategory(
                    storeCtgNm = "남성패션",
                    seq = 5,
                    useFg = true
            )
            em.persist(storeCtg5)

            val storeCtg6 = StoreCategory(
                    storeCtgNm = "레저/스포츠",
                    seq = 6,
                    useFg = true
            )
            em.persist(storeCtg6)

            val storeCtg7 = StoreCategory(
                    storeCtgNm = "해외패션",
                    seq = 7,
                    useFg = true
            )
            em.persist(storeCtg7)

            val storeCtg8 = StoreCategory(
                    storeCtgNm = "리빙/가전",
                    seq = 8,
                    useFg = true
            )
            em.persist(storeCtg8)

            val storeCtg9 = StoreCategory(
                    storeCtgNm = "식품관",
                    seq = 9,
                    useFg = true
            )
            em.persist(storeCtg9)

            val storeCtg10 = StoreCategory(
                    storeCtgNm = "F&B",
                    seq = 10,
                    useFg = true
            )
            em.persist(storeCtg10)

            val storeCtg11 = StoreCategory(
                    storeCtgNm = "엔터테인먼트",
                    seq = 11,
                    useFg = true
            )
            em.persist(storeCtg11)
        }
    }
}