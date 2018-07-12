package com.glqdlt.myhome.myhomemanager.webapp.controller.api.book;


import com.glqdlt.myhome.myhomemanager.persistence.book.entity.Book;
import com.glqdlt.myhome.myhomemanager.service.book.BookService;
import com.glqdlt.myhome.myhomemanager.webapp.controller.api.DataTableModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
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
//    public ResponseEntity saveBook(@RequestBody Book book) {
    public ResponseEntity saveBook(
            @RequestParam(value = "title") String title,
            @RequestParam(value = "author") String author,
            @RequestParam(value = "bookType") BookType bookType,
//            @RequestParam(value = "expireDate", required = false) String expireDate,
            @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam(value = "expireDate", required = false) String expireDate,
            @RequestParam(value = "descriptionUrl", required = false) String descriptionUrl,
            @RequestParam(value = "thumbnailUrl", required = false) String thumbnailUrl,
            @RequestParam(value = "uploadFile", required = false) MultipartFile file,
            @RequestParam(value = "tags", required = false) String tags) {

        ScanBookDto scanBookDto = new ScanBookDto();
        scanBookDto.setBookType(bookType);
        scanBookDto.setTitle(title);
        scanBookDto.setAuthor(author);
        scanBookDto.setUploadFile(file);
        scanBookDto.setDescriptionUrl(descriptionUrl);
        scanBookDto.setThumbnailUrl(thumbnailUrl);
        scanBookDto.setExpireDate(expireDate);
        scanBookDto.setTags(tags);
        log.info(scanBookDto.toString());

        bookService.saveBook(scanBookDto);
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
