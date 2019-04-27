package com.spring.study.controller.book;

import com.spring.study.entity.Book;
import com.spring.study.entity.SanGuo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    Book book;

    @RequestMapping("/book")
    public ModelAndView book(){
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setName("我");
        b1.setAuthor("我");
        b1.setPrice(33.3f);
        b1.setPublicationDate(new Date());
        SanGuo sanGuo = new SanGuo();
        sanGuo.setAuthor("罗贯中");
        sanGuo.setBookName("三国演义");
        sanGuo.setPrice(500.23);
        //创建喜爱运动
        List<String> fa2 = new ArrayList<>();
        fa2.add("sjahk".toUpperCase());
        fa2.add("SHJKSHAJK".toLowerCase());
        b1.setFavorites(fa2);
        Book b2 = new Book();
        b2.setName("你");
        b2.setAuthor("你dfg");
        b2.setPrice(33.3f);
        b2.setSanGuo(sanGuo);
        books.add(b1);
        books.add(b2);

        ModelAndView mv = new ModelAndView();
        mv.addObject("books",books);
        mv.setViewName("book/books");
        return mv;
    }

    @GetMapping("/sanguobook")
    public Book books(){
        Book book2 = new Book();

        SanGuo s1 = new SanGuo();
        s1.setPrice(120.56);
        s1.setAuthor("罗贯中");
        s1.setBookName("三国演义");

        List<String> fa = new ArrayList<>();
        fa.add("足球");
        fa.add("篮球");

        book2.setPrice(521.23f);
        book2.setAuthor("王明智");
        book2.setName("大帅哥");
        book2.setPublicationDate(new Date());
        book2.setSanGuo(s1);
        book2.setFavorites(fa);

        return book2;
    }
}
