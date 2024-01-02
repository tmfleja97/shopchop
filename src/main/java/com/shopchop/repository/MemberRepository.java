package com.shopchop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopchop.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email);
}
