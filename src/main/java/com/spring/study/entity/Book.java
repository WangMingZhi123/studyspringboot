package com.spring.study.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@ConfigurationProperties(prefix = "book")   //获取yml中的book对象，实现反向代理
public class Book {

    //@Value("${book.name}")   //可以直接通过spring的@value来获取yml文件中的值
    private String name;

    private String author;

    /**
     * 价格
     * **/
    //@JsonIgnore
    private Float price;

    /**
    * 爱好
    * **/
    private List<String> favorites;

    /**
     * 三国图书
     * **/
    private SanGuo sanGuo;

    //@JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public SanGuo getSanGuo() {
        return sanGuo;
    }

    public void setSanGuo(SanGuo sanGuo) {
        this.sanGuo = sanGuo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", favorites=" + favorites +
                ", sanGuo=" + sanGuo +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
