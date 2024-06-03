package org.example.model;

import java.time.LocalDate;

public class Book {
    private int id;
    private String title;
    private String author;
    private String description;
    private Double price;
    private Integer bookCount;
    private LocalDate date;

    public Book(int id, String title, String author, String description, Double price, Integer bookCount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.bookCount = bookCount;
        date = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public String publicInfo(){
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                "'}'";
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", bookCount=" + bookCount +
                ", date=" + date +
                '}';
    }
}
