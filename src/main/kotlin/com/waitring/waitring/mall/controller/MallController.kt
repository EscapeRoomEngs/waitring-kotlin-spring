package com.waitring.waitring.mall.controller

import com.waitring.waitring.core.dto.ApiResponse
import com.waitring.waitring.core.dto.SuccessCode
import com.waitring.waitring.mall.dto.FindMallAllOutput
import com.waitring.waitring.mall.dto.MallCondition
import com.waitring.waitring.mall.service.MallMainService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "쇼핑센터 API")
@RestController
@RequestMapping("/malls")
class MallController(private val mallMainService: MallMainService) {

    /**
     * 쇼핑센터 목록조회
     * @param condition 쇼핑센터 검색 조건
     * @return 쇼핑센터 목록조회 응답
     */
    @Operation(summary = "쇼핑센터 목록조회")
    @GetMapping
    fun findMallAll(condition : MallCondition): ApiResponse<FindMallAllOutput> {
        val output = mallMainService.findMallAll(condition)
        return ApiResponse.respSuccess(SuccessCode.FIND_MALL_ALL_OK, output)
    }
}