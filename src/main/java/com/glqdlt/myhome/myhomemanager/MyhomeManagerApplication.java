package com.glqdlt.myhome.myhomemanager;

import com.glqdlt.myhome.myhomemanager.persistence.author.entity.Author;
import com.glqdlt.myhome.myhomemanager.persistence.author.repository.AuthorRepo;
import com.glqdlt.myhome.myhomemanager.persistence.book.entity.ScanBook;
import com.glqdlt.myhome.myhomemanager.persistence.book.entity.Tag;
import com.glqdlt.myhome.myhomemanager.persistence.book.repository.ScanBookRepo;
import com.glqdlt.myhome.myhomemanager.persistence.book.repository.TagRepo;
import com.glqdlt.myhome.myhomemanager.persistence.member.entity.Member;
import com.glqdlt.myhome.myhomemanager.persistence.member.entity.MemberType;
import com.glqdlt.myhome.myhomemanager.persistence.member.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@SpringBootApplication
public class MyhomeManagerApplication implements CommandLineRunner {

    @Autowired
    ScanBookRepo scanBookRepo;

    @Autowired
    TagRepo tagRepo;

    @Autowired
    MemberRepo memberRepo;

    @Autowired
    AuthorRepo authorRepo;

    public static void main(String[] args) {
        SpringApplication.run(MyhomeManagerApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

//        Tag javaTag = new Tag();
//        javaTag.setValue("Java");
//
//        Tag programmingTag = new Tag();
//        programmingTag.setValue("Programming");
//
//        Author author = new Author();
//        author.setName("SomeWriter");
//
//        Member member = new Member();
//        member.setId("testId");
//        member.setName("testUserName");
//        member.setPassword("testPassword");
//        member.setType(MemberType.ADMIN);
//
//        ScanBook scanBook = new ScanBook();
//        scanBook.setRegister(member);
//        scanBook.setTitle("Happy Java");
//        scanBook.setTags(Arrays.asList(javaTag,programmingTag));
//        scanBook.setAuthor(author);
//
//        memberRepo.saveAndFlush(member);
//        tagRepo.saveAndFlush(javaTag);
//        tagRepo.saveAndFlush(programmingTag);
//        authorRepo.saveAndFlush(author);
//        scanBookRepo.saveAndFlush(scanBook);

    }
}
