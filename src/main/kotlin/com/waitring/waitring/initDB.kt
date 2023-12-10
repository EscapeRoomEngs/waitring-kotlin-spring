package com.waitring.waitring

import com.waitring.waitring.common.domain.Image
import com.waitring.waitring.mall.domain.Mall
import com.waitring.waitring.mall.domain.MallCategory
import com.waitring.waitring.mall.domain.MallState
import com.waitring.waitring.store.domain.Store
import com.waitring.waitring.store.domain.StoreCategory
import com.waitring.waitring.store.domain.StoreState
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import java.time.LocalTime
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
                    mallCtg = mallCtg1,
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

            /**
             * 가게 테스트 데이터
             */
            val store1 = Store(
                    mall = mall1,
                    storeCtg = storeCtg3,
                    storeNm = "한우리",
                    storeDetail = "1981년 도산대로 에서 최초 개점한 37년 전통의 한우를 주원료로 하는 샤브샤브,로스편채, 등심구이,국수전골등 한식전문 브랜드입니다.",
                    storeSt = StoreState.OPERATE,
                    locate = "13F F&B",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 30),
                    closeDay = "백화점 휴관일 휴무",
                    telNo = "02-772-3774",
                    waitingFg = true,
                    waitingTm = 5
            )
            em.persist(store1)

            val store2 = Store(
                    mall = mall1,
                    storeCtg = storeCtg3,
                    storeNm = "호우섬",
                    storeDetail = "홍콩의 대표 음식을 현지의 느낌 그대로 즐길수 있는 레스토랑 입니다.",
                    storeSt = StoreState.OPERATE,
                    locate = "14F F&B",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 30),
                    closeDay = "백화점 휴관일 휴무",
                    telNo = "02-726-4330",
                    waitingFg = true,
                    waitingTm = 6
            )
            em.persist(store2)

            val store3 = Store(
                    mall = mall1,
                    storeCtg = storeCtg3,
                    storeNm = "오제제",
                    storeDetail = "서울 3대 돈까스로 꼽히는 겉바속촉 프리미엄 돈까스 전문점",
                    storeSt = StoreState.OPERATE,
                    locate = "B1 F&B",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
                    closeDay = "백화점 휴관일 휴무",
                    telNo = "02-772-3140",
                    waitingFg = true,
                    waitingTm = 7
            )
            em.persist(store3)

            /**
             * 이미지 테스트 데이터
             */
            val image1 = Image(
                    store = store1,
                    imageLink = "https://minfo.lotteshopping.com/content/bnr/202302/0001/20230221153405822_6.jpeg"
            )
            em.persist(image1)

            val image2 = Image(
                    store = store2,
                    imageLink = "https://minfo.lotteshopping.com/content/bnr/202302/0001/20230221152945692_0.jpeg"
            )
            em.persist(image2)

            val image3 = Image(
                    store = store3,
                    imageLink = "https://minfo.lotteshopping.com/content/bnr/202302/0001/20230221163208312_0.jpeg"
            )
            em.persist(image3)
        }
    }
}