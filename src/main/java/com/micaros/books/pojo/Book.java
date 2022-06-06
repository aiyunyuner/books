package com.micaros.books.pojo;

import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String BookId;//书号（图书的ISBN）
    private String BookName;
    private String BookType;
    private String BookWriter;
    private String BookPublicer;//出版社
    private String BookPrice;
    private String BookRank;//等级或者评分
    private String BookComment;//简介
    private String img;
}
