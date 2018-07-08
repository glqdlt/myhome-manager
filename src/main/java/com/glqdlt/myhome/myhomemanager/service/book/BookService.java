package com.glqdlt.myhome.myhomemanager.service.book;

import com.glqdlt.myhome.myhomemanager.persistence.book.entity.Book;
import com.glqdlt.myhome.myhomemanager.persistence.book.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    public Book findById(Integer seq) {
        return bookRepo.findBookBySeq(seq);
    }

    public void saveBook(Book book){
        bookRepo.saveAndFlush(book);
    }

}
