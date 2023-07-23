package com.example.effectivejava.chapter01.item03.serialization;

import java.io.Serializable;
import java.time.LocalDate;

/*
Serializable >> 직렬화를 하겠다는 의도를 표시
객체를 직렬화하기 위해선 java.io.Serializable 인터페이스를 implements 해야 된다.
그렇지 않으면 NotSerializableException 런타임 예외가 발생된다.
Serializable 인터페이스는 아무런 내용도 없는 마커 인터페이스Visit Website 로서,
직렬화를 고려하여 작성한 클래스인지를 판단하는 기준으로 사용된다.
*/
public class Book implements Serializable {

    public static String name;
    private String isbn;
    private String title;
    private String author;
    private LocalDate published;

    /*
    transient를 붙이면 직렬화를 하지 않음
    Serialize하는 과정에서 제외하고 싶은 경우 선언하는 키워드
    패스워드와 같은 보안정보가 직렬화 과정에 제외되게 하고 싶은 경우에 사용함
    다양한 이유로 데이터를 전송하고 싶지않은 상황에서 선언함
    */
    private transient int numberOfSold;

    public Book(String isbn, String title, String author, LocalDate published) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", published=" + published +
                ", numberOfSold=" + numberOfSold +
                '}' + Book.name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    public int getNumberOfSold() {
        return numberOfSold;
    }

    public void setNumberOfSold(int numberOfSold) {
        this.numberOfSold = numberOfSold;
    }
}
