package com.glqdlt.myhome.myhomemanager.service.member;

import com.glqdlt.myhome.persistence.myhomepersistence.member.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepo memberRepo;

}
