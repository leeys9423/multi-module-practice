package com.example.modulemember.service;

import com.example.modulemember.dto.CreateMemberCommand;
import com.example.modulemember.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void createMember(CreateMemberCommand request) {
        memberRepository.save(request.toEntity());
    }
}
