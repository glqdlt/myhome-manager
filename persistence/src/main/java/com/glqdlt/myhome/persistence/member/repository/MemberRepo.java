package com.glqdlt.myhome.persistence.member.repository;

import com.glqdlt.myhome.persistence.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member,Integer> {
    Member findById(String id);
}
