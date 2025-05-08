package org.zero.b_b_erp.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.zero.b_b_erp.member.dto.MemberDTO;
import org.zero.b_b_erp.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberMapper memberMapper;

    @Autowired
    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<MemberDTO> getAllMembers() {
        return memberMapper.findAll();
    }
}
