package com.waitring.waitring.mall.service

import com.waitring.waitring.mall.dto.FindMallCtgAllOutput
import com.waitring.waitring.mall.dto.MallCategoryCondition
import com.waitring.waitring.mall.mapper.MallCategoryMapper
import com.waitring.waitring.mall.repository.MallCategoryRepository
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class MallCategoryService(private val repository: MallCategoryRepository){

    companion object {
        private val mapper = Mappers.getMapper(MallCategoryMapper::class.java)
    }

    /**
     * 쇼핑센터카테고리 목록조회
     * @param condition 쇼핑센터카테고리 검색 조건
     * @return 쇼핑센터카테고리 리스트
     */
    fun findMallCtgAll(condition : MallCategoryCondition) : FindMallCtgAllOutput {
        val mallCtgList = repository.getMallCategoryList(condition)
        return FindMallCtgAllOutput(mapper.toMallCtgInfoList(mallCtgList))
    }
}