package com.micaros.books.pojo;

import lombok.Data;

@Data
public class Pay {
    private Integer id;
    public String BorName;
    public String BookId;
    public String BookName;
    public String BookAuthor;
    public String NowTime;
}
