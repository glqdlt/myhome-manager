package com.glqdlt.myhome.webapp;

import com.glqdlt.myhome.webapp.service.book.AuthorService;
import com.glqdlt.myhome.webapp.service.book.TagService;
import com.glqdlt.myhome.persistence.book.entity.Book;
import com.glqdlt.myhome.persistence.book.repository.AuthorRepo;
import com.glqdlt.myhome.persistence.book.repository.BookRepo;
import com.glqdlt.myhome.persistence.member.entity.Member;
import com.glqdlt.myhome.persistence.member.repository.MemberRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Slf4j
@ComponentScan(basePackages ={"com.glqdlt.myhome.webapp", "com.glqdlt.myhome.persistence"})
@SpringBootApplication
public class MyhomeWebApplication implements CommandLineRunner {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    AuthorRepo authorRepo;

    @Autowired
    MemberRepo memberRepo;

    @Autowired
    TagService tagService;

    @Autowired
    AuthorService authorService;

    public static void main(String[] args) {
        SpringApplication.run(MyhomeWebApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... strings) throws Exception {

        Member member = memberRepo.findById("Admin");

        Book book = new Book();
        book.setAuthor(authorService.findAuthorIfNotFoundedWithSave("SomeAuthor"));
        book.setTitle("Some Book");
        book.setTags(tagService.findTagsIfNotFoundedWithSave("mind,java,"));
        book.setRegister(member);

        Book book2 = new Book();
        book2.setTitle("New Design");
        book2.setTags(tagService.findTagsIfNotFoundedWithSave("design"));
        book2.setAuthor(authorService.findAuthorIfNotFoundedWithSave("haha-man"));
        book2.setRegister(member);

        bookRepo.save(Arrays.asList(book, book2));
    }
}
