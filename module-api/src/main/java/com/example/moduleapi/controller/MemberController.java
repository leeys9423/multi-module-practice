package com.example.moduleapi.controller;

import com.example.moduleapi.dto.member.request.CreateMemberRequest;
import com.example.modulemember.dto.CreateMemberCommand;
import com.example.modulemember.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    @RequestMapping("/auth/members")
    public ResponseEntity<Void> createMember(@RequestBody @Valid CreateMemberRequest request) {
        // API DTO를 Domain DTO로 변환
        CreateMemberCommand command =
                CreateMemberCommand.builder()
                        .email(request.getEmail())
                        .password(request.getPassword())
                        .name(request.getEmail())
                        .build();

        memberService.createMember(command);

        return ResponseEntity.ok().build();
    }
}
