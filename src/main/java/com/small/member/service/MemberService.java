package com.small.member.service;

import com.small.member.domain.Member;

import java.util.List;

public interface MemberService {
    public Member getMember(Long id);
    public Member addMember(Member member);
    public List<Member> getMembers();
    public Member getMemberByEmail(String email);
}
