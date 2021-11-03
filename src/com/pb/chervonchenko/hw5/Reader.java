package com.pb.chervonchenko.hw5;

import java.util.Arrays;

public class Reader {

    private String fio;
    private int number;
    private String department;
    private String birthday;
    private String phone;
    private static int bookCount = 0;

    public static int getBookCount() {
        return bookCount;
    }

    public static void setBookCount(int bookCount) {
        Reader.bookCount = bookCount;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Reader(String fio, int number, String department, String birthday, String phone) {
        this.fio = fio;
        this.number = number;
        this.department = department;
        this.birthday = birthday;
        this.phone = phone;
    }

    public void takeBook(int bookCount) {
        System.out.println(fio + "взял" + bookCount + "книги.");
    }

    public void takeBook(String ...nameBook) {
        System.out.print(fio + " взяв книги:");
        for (String name : nameBook) {
            System.out.print(" " + name + ",");
            bookCount++;
        }
        System.out.println("\b");
    }

    public void takeBook(Book ...books) {
        System.out.print(fio + " взяв книги:");
        for (Book book : books) {
            System.out.println(book.getName()+ "(" +book.getAutor()+ "," +book.getYear()+ ")");
        }
        System.out.println("\b");
    }

    public void returnBook(int bookCount) {
        System.out.println(fio + "вернул" + bookCount + "книги.");
    }

    public void returnBook(String ...nameBook) {
        System.out.print(fio + " вернул книги:");
        for (String name : nameBook) {
            System.out.print(" " + name + ",");
            bookCount++;
        }
        System.out.println("\b");
    }

    public void returnBook(Book ...books) {
        System.out.print(fio + " вернул книги:");
        for (Book book : books) {
            System.out.println(book.getName()+ "(" +book.getAutor()+ "," +book.getYear()+ ")");
        }
        System.out.println("\b");
    }


    public void readerInfo1(Reader reader1) {
        System.out.println("Читатель 1:" + reader1.getFio() + "," +number+ "," + department +"," + birthday + "," +phone+ ".");
    }
    public void readerInfo2(Reader reader2) {
        System.out.println("Читатель 2:" + reader2.getFio() + "," +number+ "," + department +"," + birthday + "," +phone+ ".");
    }
    public void readerInfo3(Reader reader3) {
        System.out.println("Читатель 3:" + reader3.getFio() + "," +number+ "," + department +"," + birthday + "," +phone+ ".");
    }

}
