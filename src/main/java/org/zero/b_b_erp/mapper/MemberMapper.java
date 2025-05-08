package org.zero.b_b_erp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.zero.b_b_erp.member.dto.MemberDTO;

import java.util.List;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM ejobb.public.bb_member")
    List<MemberDTO> findAll();
}
