package com.waitring.waitring.mall.service

import com.waitring.waitring.mall.dto.FindMallCtgAllOutput
import com.waitring.waitring.mall.dto.MallCategoryCondition
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class MallMainService(
        private val mallCategoryService: MallCategoryService
){

    /**
     * 쇼핑센터카테고리 목록조회
     * @param condition 쇼핑센터카테고리 검색 조건
     * @return 쇼핑센터카테고리 리스트
     */
    fun findMallCtgAll(condition : MallCategoryCondition) : FindMallCtgAllOutput {
        return mallCategoryService.findMallCtgAll(condition)
    }
}