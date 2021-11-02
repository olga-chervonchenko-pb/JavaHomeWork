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

    public void bookInfo1(String name, String autor, String year) {
            System.out.println("Книга1:" + name + "," +autor+ "," + year +".");
        }

    public void bookInfo2(String name, String autor, String year) {
        System.out.println("Книга2:" + name + "," +autor+ "," + year +".");
    }

    public void bookInfo3(String name, String autor, String year) {
        System.out.println("Книга3:" + name + "," +autor+ "," + year +".");
    }

    }