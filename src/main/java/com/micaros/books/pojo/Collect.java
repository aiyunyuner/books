package com.micaros.books.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collect {
    private Integer id;
    public String BorName;
    public String BookId;
    public String BookName;
    public String BookAuthor;
    public String NowTime;
}