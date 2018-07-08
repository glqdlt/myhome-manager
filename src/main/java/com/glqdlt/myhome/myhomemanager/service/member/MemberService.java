package com.glqdlt.myhome.myhomemanager.service.member;

import com.glqdlt.myhome.myhomemanager.persistence.member.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepo memberRepo;

}
