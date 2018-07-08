package com.glqdlt.myhome.myhomemanager.security;

import com.glqdlt.myhome.myhomemanager.persistence.member.entity.Member;
import com.glqdlt.myhome.myhomemanager.persistence.member.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginUserService implements UserDetailsService {

    @Autowired
    MemberRepo memberRepo;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Member member = memberRepo.findById(id);
        if (member != null) {
            return new LoginUserDetail(member);
        }
        throw new UsernameNotFoundException("Not Found User");
    }
}