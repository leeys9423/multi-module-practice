package com.example.modulemember.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.modulemember.repository")
@EntityScan(basePackages = "com.example.modulemember.entity")
public class MemberJpaConfig {}
