package com.glqdlt.myhome.myhomemanager.persistence.member.repository;

import com.glqdlt.myhome.myhomemanager.persistence.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member,Integer> {
    Member findById(String id);
}
