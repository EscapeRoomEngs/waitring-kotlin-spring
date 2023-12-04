package com.waitring.waitring.member.mapper

import com.waitring.waitring.member.domain.AccountState
import com.waitring.waitring.member.domain.Authority
import com.waitring.waitring.member.domain.Member
import com.waitring.waitring.member.dto.SignUpInput
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper(componentModel = "spring")
interface MemberMapper {

    @Mappings(
            Mapping(source = "password", target = "password")
    )
    fun toMember(
            input: SignUpInput,
            password : String,
            accountSt : AccountState,
            authority : Authority
    ) : Member
}