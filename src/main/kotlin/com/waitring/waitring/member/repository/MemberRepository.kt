package com.waitring.waitring.member.repository

import com.waitring.waitring.member.domain.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {
    fun findMemberByPhoneNo(phoneNo: String) : Member?
    fun findMemberByPhoneNoAndPassword(phoneNo : String, password : String) : Member?
}