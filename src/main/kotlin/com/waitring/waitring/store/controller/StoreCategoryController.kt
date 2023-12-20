package com.waitring.waitring.store.controller

import com.waitring.waitring.core.dto.ApiResponse
import com.waitring.waitring.core.dto.SuccessCode
import com.waitring.waitring.store.dto.FindStoreCtgAllOutput
import com.waitring.waitring.store.service.StoreMainService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "가게카테고리 API")
@RestController
@RequestMapping("/store/categories")
class StoreCategoryController(private val storeMainService: StoreMainService) {

    /**
     * 가게카테고리 목록조회
     * @return 가게카테고리 목록조회 응답
     */
    @Operation(summary = "가게카테고리 목록조회")
    @GetMapping
    fun findStoreCtgAll(): ApiResponse<FindStoreCtgAllOutput> {
        val output = storeMainService.findStoreCtgAll()
        return ApiResponse.respSuccess(SuccessCode.FIND_STORE_CTG_ALL_OK, output)
    }
}