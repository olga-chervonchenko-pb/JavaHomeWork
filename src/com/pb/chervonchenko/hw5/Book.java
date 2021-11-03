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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public void bookInfo() {
            System.out.println("Текущая книга:" + getName() + "," +autor+ "," + year +".");

        }

}