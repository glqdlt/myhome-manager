package com.glqdlt.myhome.webapp.service.member;

import com.glqdlt.myhome.persistence.member.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepo memberRepo;

}
