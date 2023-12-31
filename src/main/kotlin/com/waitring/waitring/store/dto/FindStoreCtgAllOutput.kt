package com.waitring.waitring.store.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "가게카테고리 목록조회 응답")
data class FindStoreCtgAllOutput (

        @field:Schema(description = "가게카테고리목록")
        var storeCtgList : List<StoreCategoryInfo>,
)