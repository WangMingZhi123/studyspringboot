package com.spring.study.controller.book;

import com.spring.study.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    Book book;

    @RequestMapping("/book")
    public String book(){
        return book.toString();
    }
}
