package com.day.study.datasource.springbootseparation.service.impl;

import com.day.study.datasource.springbootseparation.common.entity.Member;
import com.day.study.datasource.springbootseparation.mapper.MemberMapper;
import com.day.study.datasource.springbootseparation.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fengyu
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberMapper memberMapper;

    @Override
    public void add(Member member) {
        memberMapper.add(member);
    }
}
