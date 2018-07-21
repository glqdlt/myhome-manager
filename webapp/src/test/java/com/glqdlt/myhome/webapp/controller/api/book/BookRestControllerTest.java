package com.glqdlt.myhome.webapp.controller.api.book;

import com.glqdlt.myhome.webapp.service.book.BookService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@Slf4j
@ActiveProfiles("test")
@WebMvcTest(value = BookRestController.class, secure = false)
@RunWith(SpringRunner.class)
public class BookRestControllerTest {


    @Autowired
    private MockMvc mockMvc;

//    Unsatisfied dependency expressed through field .. exception
    @MockBean
    private BookService bookService;

    private MockHttpServletRequestBuilder requestBuilder;


    @Test
    public void findAllBooks() {
    }

    @Test
    public void findBookById() throws Exception {
        when(bookService.findById(Mockito.anyInt())).thenReturn(null);
        this.requestBuilder = MockMvcRequestBuilders.get("/api/books/1");
        MvcResult result = mockMvc.perform(this.requestBuilder).andDo(print()).andReturn();
    }

    @Test
    public void saveBook() {


    }

    @Test
    public void updateBookById() {
    }

    @Test
    public void removeBookById() {
    }
}