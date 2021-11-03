package com.pb.chervonchenko.hw5;

public class Book {

    private String name;
    private String autor;
    private String year;

    public Book(String name, String autor, String year) {
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public String getYear() {
        return year;
    }

    public void bookInfo1(Book book1) {
            System.out.println("Книга1:" + book1.getName() + "," +autor+ "," + year +".");
        }

    public void bookInfo2(Book book2) {
        System.out.println("Книга2:" + book2.getName() + "," +autor+ "," + year +".");
    }

    public void bookInfo3(Book book3) {
        System.out.println("Книга3:" + book3.getName() + "," +autor+ "," + year +".");
    }

}