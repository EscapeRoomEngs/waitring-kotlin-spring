package com.waitring.waitring.mall.service

import com.waitring.waitring.mall.dto.FindMallAllOutput
import com.waitring.waitring.mall.dto.FindMallCtgAllOutput
import com.waitring.waitring.mall.dto.MallCategoryCondition
import com.waitring.waitring.mall.dto.MallCondition
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class MallMainService(
        private val mallCategoryService: MallCategoryService,
        private val mallService: MallService
){

    /**
     * 쇼핑센터카테고리 목록조회
     * @param condition 쇼핑센터카테고리 검색 조건
     * @return 쇼핑센터카테고리 리스트
     */
    fun findMallCtgAll(condition : MallCategoryCondition) : FindMallCtgAllOutput {
        return mallCategoryService.findMallCtgAll(condition)
    }

    /**
     * 쇼핑센터 목록조회
     * @param condition 쇼핑센터 검색 조건
     * @return 쇼핑센터 리스트
     */
    fun findMallAll(condition : MallCondition) : FindMallAllOutput {
        return mallService.findMallAll(condition)
    }
}