package org.zero.b_b_erp.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zero.b_b_erp.mapper.MemberMapper;
import org.zero.b_b_erp.member.dto.MemberDTO;

import java.util.List;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberMapper memberMapper;

    // 전체 회원 조회
    @GetMapping
    public List<MemberDTO> findAll() {

        return memberMapper.findAll();
    }
}
