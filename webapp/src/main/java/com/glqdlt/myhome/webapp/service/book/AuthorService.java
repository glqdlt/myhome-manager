package com.glqdlt.myhome.webapp.service.book;

import com.glqdlt.myhome.persistence.book.entity.Author;
import com.glqdlt.myhome.persistence.book.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    AuthorRepo authorRepo;

    public Author findAuthorIfNotFoundedWithSave(String authorName){
        Optional<Author> searchAuthor = authorRepo.findByName(authorName);
        if(!searchAuthor.isPresent()){
            return authorRepo.save(new Author(authorName));
        }else{
            return searchAuthor.get();
        }
    }

}
