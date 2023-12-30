package com.waitring.waitring.mall.service

import com.waitring.waitring.mall.dto.FindMallAllOutput
import com.waitring.waitring.mall.dto.MallCondition
import com.waitring.waitring.mall.dto.MallInfo
import com.waitring.waitring.mall.mapper.MallMapper
import com.waitring.waitring.mall.repository.MallRepository
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class MallService(private val repository: MallRepository){

    companion object {
        private val mapper = Mappers.getMapper(MallMapper::class.java)
    }

    /**
     * 쇼핑센터 목록조회
     * @param condition 쇼핑센터 검색 조건
     * @return 쇼핑센터 리스트
     */
    fun findMallAll(condition : MallCondition) : FindMallAllOutput {
        // 1. 쇼핑센터 목록조회
        val mallList = repository.getMallList(condition)

        // 2. 계층구조로 매핑
        val output = mutableMapOf<String, MutableList<MallInfo>>()
        mallList.forEach {
            if (output.containsKey(it.mallType.value)) {
                output[it.mallType.value]?.add(mapper.toMallInfo(it))
            } else {
                output[it.mallType.value] = mutableListOf(mapper.toMallInfo(it))
            }
        }

        return FindMallAllOutput(output)
    }
}