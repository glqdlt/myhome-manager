package com.glqdlt.myhome.myhomemanager.service.book;

import com.glqdlt.myhome.myhomemanager.persistence.book.entity.Book;
import com.glqdlt.myhome.myhomemanager.persistence.book.repository.BookRepo;
import com.glqdlt.myhome.myhomemanager.webapp.controller.api.book.BookType;
import com.glqdlt.myhome.myhomemanager.webapp.controller.api.book.ScanBookDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;


    @Value("${myhome.upload.dir}")
    String UPLOAD_DIR;


    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    public Book findById(Integer seq) {
        Optional<Book> book = bookRepo.findBookBySeq(seq);
        return book.isPresent() ? book.get() : null;
    }

    public void saveBook(ScanBookDto scanBookDto) {

        if (BookType.SCAN == scanBookDto.getBookType()) {

            if (scanBookDto.getUploadFile() == null) {
                log.info("file is empty");
                return;
            }

            try {
                Path uploadedPath = uploadFile(scanBookDto.getUploadFile());
                log.info("uploadedPath : {}", uploadedPath);
            } catch (IOException e) {
                log.error(e.getMessage(), e);
            }

        } else if (BookType.RIDI == scanBookDto.getBookType()) {

        } else {

        }

//        bookRepo.saveAndFlush(book);

    }


    private Path uploadFile(MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        return Files.write(Paths.get(UPLOAD_DIR + file.getOriginalFilename()), bytes);
    }

}
