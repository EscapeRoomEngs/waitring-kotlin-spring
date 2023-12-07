package com.waitring.waitring

import com.waitring.waitring.mall.domain.Mall
import com.waitring.waitring.mall.domain.MallCategory
import com.waitring.waitring.mall.domain.MallState
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
             * 쇼핑센터카케고리 테스트 데이터
             */
            val mallCtg1 = MallCategory(
                    mallCtgNm = "롯데백화점",
                    seq = 1,
                    useFg = true
            )
            em.persist(mallCtg1)

            val mallCtg2 = MallCategory(
                    mallCtgNm = "아울렛",
                    seq = 2,
                    useFg = true
            )
            em.persist(mallCtg2)

            val mallCtg3 = MallCategory(
                    mallCtgNm = "쇼핑몰",
                    seq = 3,
                    useFg = true
            )
            em.persist(mallCtg3)

            /**
             * 쇼핑센터 테스트 데이터
             */
            val mall1 = Mall(
                    mallNm = "본점",
                    mallSt = MallState.OPERATE,
                    region = "서울",
                    zipcode = "04533",
                    address = "서울특별시 중구 남대문로 81",
                    mallLat = "126.98173999657001",
                    mallLng = "37.56491911400273"
            )
            em.persist(mall1)

            /**
             * 가게카테고리 테스트 데이터
             */
            val storeCtg1 = StoreCategory(
                    storeCtgNm = "뷰티",
                    seq = 1,
                    useFg = true
            )
            em.persist(storeCtg1)

            val storeCtg2 = StoreCategory(
                    storeCtgNm = "리빙/가전",
                    seq = 2,
                    useFg = true
            )
            em.persist(storeCtg2)

            val storeCtg3 = StoreCategory(
                    storeCtgNm = "식품관",
                    seq = 3,
                    useFg = true
            )
            em.persist(storeCtg3)

            val storeCtg4 = StoreCategory(
                    storeCtgNm = "엔터",
                    seq = 4,
                    useFg = true
            )
            em.persist(storeCtg4)

            val storeCtg5 = StoreCategory(
                    storeCtgNm = "명품",
                    seq = 5,
                    useFg = true
            )
            em.persist(storeCtg5)

            val storeCtg6 = StoreCategory(
                    storeCtgNm = "패션",
                    seq = 6,
                    useFg = true
            )
            em.persist(storeCtg6)

            val storeCtg7 = StoreCategory(
                    storeCtgNm = "행사장",
                    seq = 7,
                    useFg = true
            )
            em.persist(storeCtg7)

            val storeCtg8 = StoreCategory(
                    storeCtgNm = "스포츠",
                    seq = 8,
                    useFg = true
            )
            em.persist(storeCtg8)
        }
    }
}