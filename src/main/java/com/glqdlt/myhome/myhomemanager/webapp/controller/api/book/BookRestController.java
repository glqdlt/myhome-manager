package com.glqdlt.myhome.myhomemanager.webapp.controller.api.book;


import com.glqdlt.myhome.myhomemanager.persistence.book.entity.Book;
import com.glqdlt.myhome.myhomemanager.service.book.BookService;
import com.glqdlt.myhome.myhomemanager.webapp.controller.api.DataTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// API endpoint 에 관한 좋은 이야기 => https://spoqa.github.io/2012/02/27/rest-introduction.html
@RequestMapping("/api/books")
@RestController
public class BookRestController {

    @Autowired
    BookService bookService;

    @GetMapping()
    public ResponseEntity<DataTableModel> findAllBooks() {
        return new ResponseEntity<>(new DataTableModel<>(bookService.findAll()), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findBookById(@PathVariable("id") String id) {
        return new ResponseEntity<>(bookService.findById(Integer.parseInt(id)), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateBookById(@PathVariable("id") String id) {
        return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeBookById(@PathVariable("id") String id) {
        return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
    }

}
