package com.waitring.waitring.member.service

import com.waitring.waitring.core.dto.ErrorCode
import com.waitring.waitring.core.exception.ConflictRuntimeException
import com.waitring.waitring.member.domain.AccountState
import com.waitring.waitring.member.domain.Authority
import com.waitring.waitring.member.dto.LoginInput
import com.waitring.waitring.member.dto.SignUpInput
import com.waitring.waitring.member.mapper.MemberMapper
import com.waitring.waitring.member.repository.MemberRepository
import org.mapstruct.factory.Mappers
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class MemberService(private val repository: MemberRepository, private val passwordEncoder: PasswordEncoder) {

    companion object {
        private val mapper = Mappers.getMapper(MemberMapper::class.java)
    }

    /**
     * 회원가입
     * @param input 회원가입 요청 정보
     */
    fun signUp(input: SignUpInput) {
        val member = mapper.toMember(
                input,
                passwordEncoder.encode(input.password),
                AccountState.ACTIVATE,
                Authority.USER
        )
        repository.save(member)
    }

    /**
     * 로그인
     * @param input 로그인 요청 정보
     */
    fun login(input : LoginInput) {
        // 1. 사용자 조회
        val member = repository.findMemberByPhoneNo(input.phoneNo) ?: throw ConflictRuntimeException(ErrorCode.BAD_CREDENTIALS)

        // 2. 비밀번호 일치 체크
        check(passwordEncoder.matches(input.password, member.password)) { throw ConflictRuntimeException(ErrorCode.BAD_CREDENTIALS) }
    }
}