package com.example.modulemember.dto;

import com.example.modulemember.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class CreateMemberCommand {

    private String email;
    private String password;
    private String name;

    public Member toEntity() {
        return Member.builder().email(getEmail()).password(getPassword()).name(getName()).build();
    }
}
