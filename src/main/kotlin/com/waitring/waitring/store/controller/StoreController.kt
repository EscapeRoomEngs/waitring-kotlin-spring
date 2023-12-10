package com.waitring.waitring.store.controller

import com.waitring.waitring.core.dto.ApiResponse
import com.waitring.waitring.core.dto.SuccessCode
import com.waitring.waitring.store.dto.FindStoreDetailOutput
import com.waitring.waitring.store.service.StoreMainService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "가게 API")
@RestController
@RequestMapping("/store")
class StoreController(private val storeMainService: StoreMainService) {

    /**
     * 가게 상세조회
     * @param id 가게 시퀀스번호
     * @return 가게 상세조회 응답
     */
    @Operation(summary = "가게 상세조회")
    @Parameter(name = "id", description = "가게 시퀀스번호", example = "1")
    @GetMapping("/{id}")
    fun findStoreDetail(@PathVariable id: Long): ApiResponse<FindStoreDetailOutput> {
        val output = storeMainService.findStoreDetail(id)
        return ApiResponse.respSuccess(SuccessCode.FIND_STORE_DETAIL_OK, output)
    }
}