package com.waitring.waitring.mall.domain

enum class MallType(val value : String) {
    /** 백화점 */
    SEOUL("서울점"),
    GREATER_SEOUL("수도권점"),
    PROVINCE("지방점"),

    /** 아울렛 */
    PREMIUN_OUTLET("프리미엄 아울렛"),
    OUTLET("아울렛"),
    LCUBE("엘큐브"),

    /** 쇼핑몰 */
    SHOPPING_MALL("쇼핑몰")
}