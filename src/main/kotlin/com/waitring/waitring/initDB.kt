package com.waitring.waitring

import com.waitring.waitring.common.domain.Image
import com.waitring.waitring.mall.domain.*
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
             * 회사 테스트 데이터
             */
            val company1 = Company(
                    companyNm = "롯데백화점",
                    companySt = CompanyState.OPERATE
            )
            em.persist(company1)

            /**
             * 쇼핑센터카테고리 테스트 데이터
             */
            val mallCtg1 = MallCategory(
                    company = company1,
                    mallCtgNm = "백화점",
                    seq = 1,
                    useFg = true
            )
            em.persist(mallCtg1)

            val mallCtg2 = MallCategory(
                    company = company1,
                    mallCtgNm = "아울렛",
                    seq = 2,
                    useFg = true
            )
            em.persist(mallCtg2)

            val mallCtg3 = MallCategory(
                    mallCtgNm = "쇼핑몰",
                    company = company1,
                    seq = 3,
                    useFg = true
            )
            em.persist(mallCtg3)

            /**
             * 쇼핑센터 테스트 데이터
             */
            // 백화점 - 서울
            val mall1 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "잠실점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SEOUL,
                    zipcode = "05554",
                    address = "서울특별시 송파구 올림픽로 240",
                    mallLat = "127.0985552869803",
                    mallLng = "37.51201141930842",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall1)

            val mall2 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "본점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SEOUL,
                    zipcode = "04533",
                    address = "서울특별시 중구 남대문로 81",
                    mallLat = "126.98175414832635",
                    mallLng = "37.564905601247865",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall2)

            val mall3 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "강남점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SEOUL,
                    zipcode = "06206",
                    address = "서울특별시 강남구 도곡로 401",
                    mallLat = "127.053281143657",
                    mallLng = "37.496959490738",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall3)

            val mall4 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "건대스타시티점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SEOUL,
                    zipcode = "05065",
                    address = "서울특별시 광진구 능동로 92",
                    mallLat = "127.07140800638",
                    mallLng = "37.538995238639366",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall4)

            val mall5 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "관악점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SEOUL,
                    zipcode = "08708",
                    address = "서울특별시 관악구 봉천로 209",
                    mallLat = "126.92495197933515",
                    mallLng = "37.49045140859353",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall5)

            val mall6 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "김포공항점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SEOUL,
                    zipcode = "07505",
                    address = "서울특별시 강서구 하늘길 38",
                    mallLat = "126.80324048423567",
                    mallLng = "37.563122163882205",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall6)

            val mall7 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "노원점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SEOUL,
                    zipcode = "01695",
                    address = "서울특별시 노원구 동일로 1414",
                    mallLat = "127.06133796050443",
                    mallLng = "37.65507468704351",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall7)

            val mall8 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "미아점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SEOUL,
                    zipcode = "01215",
                    address = "서울특별시 강북구 도봉로62",
                    mallLat = "127.06128594127864",
                    mallLng = "37.65520850994503",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall8)

            val mall9 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "영등포점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SEOUL,
                    zipcode = "07306",
                    address = "서울특별시 영등포구 경인로 846",
                    mallLat = "127.03051756499985",
                    mallLng = "37.6145927958119",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall9)

            val mall10 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "청량리점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SEOUL,
                    zipcode = "02555",
                    address = "서울특별시 동대문구 왕산로 214",
                    mallLat = "127.0476836634231",
                    mallLng = "37.58082967458468",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall10)

            // 백화점 - 수도권
            val mall11 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "인천점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.GREATER_SEOUL,
                    zipcode = "22242",
                    address = "인천광역시 미추홀구 연남로35",
                    mallLat = "126.701522440664",
                    mallLng = "37.4424069479441",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall11)

            val mall12 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "동탄점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.GREATER_SEOUL,
                    zipcode = "18478",
                    address = "경기도 화성시 동탄역로 160",
                    mallLat = "127.09791931212142",
                    mallLng = "37.20070867365914",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall12)

            val mall13 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "구리점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.GREATER_SEOUL,
                    zipcode = "11922",
                    address = "경기도 구리시 경춘로 261",
                    mallLat = "127.143884371108",
                    mallLng = "37.6026826461931",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall13)

            val mall14 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "분당점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.GREATER_SEOUL,
                    zipcode = "13595",
                    address = "경기도 성남시 분당구 황새울로 200번길 45",
                    mallLat = "127.11451444042125",
                    mallLng = "37.37832438530568",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall14)

            val mall15 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "수원점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.GREATER_SEOUL,
                    zipcode = "16621",
                    address = "경기도 수원시 권선구 세화로 134",
                    mallLat = "126.9985231516336",
                    mallLng = "37.26449820456967",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall15)

            val mall16 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "안산점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.GREATER_SEOUL,
                    zipcode = "15360",
                    address = "경기도 안산시 단원구 고잔1길 12",
                    mallLat = "126.834498457254",
                    mallLng = "37.3179924380679",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall16)

            val mall17 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "일산점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.GREATER_SEOUL,
                    zipcode = "10401",
                    address = "경기도 고양시 일산동구 중앙로 1283",
                    mallLat = "126.77213362798275",
                    mallLng = "37.66047104881414",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall17)

            val mall18 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "중동점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.GREATER_SEOUL,
                    zipcode = "14548",
                    address = "경기도 부천시 길주로 300",
                    mallLat = "126.77520420831686",
                    mallLng = "37.50256910703231",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall18)

            val mall19 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "평촌점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.GREATER_SEOUL,
                    zipcode = "14073",
                    address = "경기도 안양시 동안구 시민대로 180",
                    mallLat = "126.95046566549613",
                    mallLng = "37.39022151853505",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall19)

            // 백화점 - 지방
            val mall20 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "부산본점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "47285",
                    address = "부산광역시 부산진구 가야대로 772",
                    mallLat = "129.05641460694002",
                    mallLng = "35.15679136281396",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall20)

            val mall21 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "광복점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "48944",
                    address = "부산광역시 중구 중앙대로 2",
                    mallLat = "129.036850769407",
                    mallLng = "35.0982575242943",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall21)

            val mall22 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "광주점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "61470",
                    address = "광주광역시 동구 독립로 268",
                    mallLat = "126.91218246817256",
                    mallLng = "35.154552723031465",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall22)

            val mall23 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "대구점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "41581",
                    address = "대구광역시 북구 태평로 161",
                    mallLat = "128.5955140021621",
                    mallLng = "35.87565702475202",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall23)

            val mall24 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "대전점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "35299",
                    address = "대전광역시 서구 계룡로 598",
                    mallLat = "127.389624974978",
                    mallLng = "36.340653703926",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall24)

            val mall25 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "동래점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "47727",
                    address = "부산광역시 동래구 중앙대로 1393",
                    mallLat = "129.07761249874758",
                    mallLng = "35.2114324809731",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall25)

            val mall26 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "마산점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "51720",
                    address = "경상남도 창원시 마산합포구 동서동로 18",
                    mallLat = "128.573400629525",
                    mallLng = "35.2014778541727",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall26)

            val mall27 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "상인점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "42809",
                    address = "대구광역시 달서구 월배로 232",
                    mallLat = "128.53890166350524",
                    mallLng = "35.81879043423177",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall27)

            val mall28 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "센텀시티점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "48058",
                    address = "부산광역시 해운대구 센텀남대로 59",
                    mallLat = "129.1310930492833",
                    mallLng = "35.16981500549287",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall28)

            val mall29 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "울산점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "44719",
                    address = "울산광역시 남구 삼산로 288",
                    mallLat = "129.338882301276",
                    mallLng = "35.5387016444942",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall29)

            val mall30 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "전주점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "54946",
                    address = "전라북도 전주시 완산구 온고을로 2",
                    mallLat = "127.12181384514193",
                    mallLng = "35.83443204573435",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall30)

            val mall31 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "창원점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "51494",
                    address = "경상남도 창원시 성산구 중앙대로 124",
                    mallLat = "128.68183010928482",
                    mallLng = "35.22455489158161",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall31)

            val mall32 = Mall(
                    mallCtg = mallCtg1,
                    mallNm = "포항점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PROVINCE,
                    zipcode = "37718",
                    address = "경상북도 포항시 북구 학산로 62",
                    mallLat = "129.36967333780396",
                    mallLng = "36.04978187906813",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall32)

            // 아울렛 - 프리미엄 아울렛
            val mall33 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "타임빌라스",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PREMIUN_OUTLET,
                    zipcode = "16016",
                    address = "경기도 의왕시 바라산로 1",
                    mallLat = "127.009447690386",
                    mallLng = "37.375616005115546",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall33)

            val mall34 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "동부산점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PREMIUN_OUTLET,
                    zipcode = "46084",
                    address = "부산광역시 기장군 기장해안로 147",
                    mallLat = "129.21254446105058",
                    mallLng = "35.19166083470112",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 30),
            )
            em.persist(mall34)

            val mall35 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "기흥점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PREMIUN_OUTLET,
                    zipcode = "17087",
                    address = "경기도 용인시 기흥구 신고매로 124",
                    mallLat = "127.12095953681722",
                    mallLng = "37.225033744670185",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 30),
            )
            em.persist(mall35)

            val mall36 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "김해점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PREMIUN_OUTLET,
                    zipcode = "51011",
                    address = "경상남도 김해시 장유로 469",
                    mallLat = "128.82995517262307",
                    mallLng = "35.18500154458406",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall36)

            val mall37 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "이천점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PREMIUN_OUTLET,
                    zipcode = "17384",
                    address = "경기도 이천시 호법면 프리미엄아울렛로 177-74",
                    mallLat = "127.40047532651303",
                    mallLng = "37.24235547032522",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 30),
            )
            em.persist(mall37)

            val mall38 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "파주점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.PREMIUN_OUTLET,
                    zipcode = "10881",
                    address = "경기 파주시 문발로 284",
                    mallLat = "126.69264255226548",
                    mallLng = "37.718115211026245",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall38)

            // 아울렛 - 아울렛
            val mall39 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "고양점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "10551",
                    address = "경기도 고양시 덕양구 권율대로 420",
                    mallLat = "126.8627757076227",
                    mallLng = "37.629102132130924",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall39)

            val mall40 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "고양터미널점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "10450",
                    address = "경기도 고양시 일산동구 중앙로 1036",
                    mallLat = "126.78930650853795",
                    mallLng = "37.64335729784874",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall40)

            val mall41 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "광교점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "16508",
                    address = "경기도 수원시 영통구 이의동 1338",
                    mallLat = "127.05553891333668",
                    mallLng = "37.28652733603002",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall41)

            val mall42 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "광주수완점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "62225",
                    address = "광주광역시 광산구 장신로 98",
                    mallLat = "126.819878443113",
                    mallLng = "35.1903859345039",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall42)

            val mall43 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "광주월드컵점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "62048",
                    address = "광주광역시 서구 금화로 240",
                    mallLat = "126.87651971798942",
                    mallLng = "35.13316116556094",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall43)

            val mall44 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "구리점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "11915",
                    address = "경기도 구리시 동구릉로136번길 47",
                    mallLat = "127.140545094093",
                    mallLng = "37.6118767579425",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall44)

            val mall45 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "남악점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "58579",
                    address = "전라남도 무안군 삼향읍 남악로162번길 80",
                    mallLat = "126.46533260936238",
                    mallLng = "34.80341807670223",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall45)

            val mall46 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "대구율하점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "41097",
                    address = "대구광역시 동구 안심로 80",
                    mallLat = "128.6933841415493",
                    mallLng = "35.86843434173011",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall46)

            val mall47 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "부여점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "33115",
                    address = "충청남도 부여군 규암면 백제문로 387",
                    mallLat = "126.901902602516",
                    mallLng = "36.307144145572",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 30),
            )
            em.persist(mall47)

            val mall48 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "서울역점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "04509",
                    address = "서울특별시 용산구 한강대로 405",
                    mallLat = "126.97072225855301",
                    mallLng = "37.55492033491136",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall48)

            val mall49 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "이시아폴리스점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "41026",
                    address = "대구광역시 동구 팔공로49길 16",
                    mallLat = "128.63771129635438",
                    mallLng = "35.92183348439652",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall49)

            val mall50 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "청주점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "28360",
                    address = "충청북도 청주시 흥덕구 비하동 2순환로 1004",
                    mallLat = "127.42156642284309",
                    mallLng = "36.64532216539539",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall50)

            val mall51 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "팩토리가산점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.OUTLET,
                    zipcode = "08511",
                    address = "서울특별시 금천구 벚꽃로 278",
                    detailAddress = "1~3층",
                    mallLat = "126.88482847497752",
                    mallLng = "37.47934211576018",
                    openTm = LocalTime.of(11, 0),
                    closeTm = LocalTime.of(20, 30),
            )
            em.persist(mall51)

            // 아울렛 - 엘큐브
            val mall52 = Mall(
                    mallCtg = mallCtg2,
                    mallNm = "세종점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.LCUBE,
                    zipcode = "30121",
                    address = "세종특별자치시 갈매로 363",
                    mallLat = "127.262839551946",
                    mallLng = "36.4963971684303",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall52)

            // 쇼핑몰
            val mall53 = Mall(
                    mallCtg = mallCtg3,
                    mallNm = "광명점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SHOPPING_MALL,
                    zipcode = "14352",
                    address = "경기도 광명시 일직로 17",
                    mallLat = "126.88468709135093",
                    mallLng = "37.42342871033342",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall53)

            val mall54 = Mall(
                    mallCtg = mallCtg3,
                    mallNm = "군산점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SHOPPING_MALL,
                    zipcode = "54072",
                    address = "전라북도 군산시 조촌동 450-21",
                    mallLat = "126.73902742893507",
                    mallLng = "35.976344898549605",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall54)

            val mall55 = Mall(
                    mallCtg = mallCtg3,
                    mallNm = "수지점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SHOPPING_MALL,
                    zipcode = "16847",
                    address = "경기도 용인시 수지구 성복2로 38",
                    mallLat = "127.08123935293986",
                    mallLng = "37.31302728758052",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(22, 0),
            )
            em.persist(mall55)

            val mall56 = Mall(
                    mallCtg = mallCtg3,
                    mallNm = "여수점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SHOPPING_MALL,
                    zipcode = "59761",
                    address = "전라남도 여수시 국포1로 36",
                    mallLat = "127.72140327226303",
                    mallLng = "34.72848048948264",
                    openTm = LocalTime.of(10, 0),
                    closeTm = LocalTime.of(20, 0),
            )
            em.persist(mall56)

            val mall57 = Mall(
                    mallCtg = mallCtg3,
                    mallNm = "은평점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SHOPPING_MALL,
                    zipcode = "03306",
                    address = "서울특별시 은평구 통일로 1050",
                    mallLat = "126.917745736334",
                    mallLng = "37.637627926333",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(22, 0),
            )
            em.persist(mall57)

            val mall58 = Mall(
                    mallCtg = mallCtg3,
                    mallNm = "진주점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SHOPPING_MALL,
                    zipcode = "52851",
                    address = "경상남도 진주시 충무공동 35",
                    mallLat = "128.13979045382274",
                    mallLng = "35.180265821001036",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(21, 0),
            )
            em.persist(mall58)

            val mall59 = Mall(
                    mallCtg = mallCtg3,
                    mallNm = "피트인 산본점",
                    mallSt = MallState.OPERATE,
                    mallType = MallType.SHOPPING_MALL,
                    zipcode = "15866",
                    address = "경기도 군포시 번영로 485",
                    mallLat = "126.93071683413",
                    mallLng = "37.357726034092",
                    openTm = LocalTime.of(10, 30),
                    closeTm = LocalTime.of(22, 0),
            )
            em.persist(mall59)

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