package com.pb.chervonchenko.hw5;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("Приключения", "Иванов И.И.", "2000 г.");
        Book book2 = new Book("Словарь", "Сидоров А.", "1980 г.");
        Book book3 = new Book("Энциклопедия", "Гусев К.В.", "2010 г.");

        Book[] books = new Book[] {book1, book2, book3};



        Reader reader1 = new Reader("Петров В.В.", 45, "History", "22.09.1988","0970000001");
        Reader reader2 = new Reader("Круглов В.В.", 2, "History", "28.09.1988","0970000002");
        Reader reader3 = new Reader("Сококлов В.В.", 28, "Design", "28.04.1995","0970000003");

        Reader[] readers = new Reader[] {reader1, reader2, reader3};


        reader1.takeBook(book1.getName(),book2.getName(),book3.getName());
        reader1.takeBook(book1,book2,book3);


        reader1.returnBook(book1.getName(),book2.getName(),book3.getName());
        reader1.returnBook(book1,book2,book3);


        book1.bookInfo();
        book2.bookInfo();
        book3.bookInfo();


        reader1.readerInfo();
        reader2.readerInfo();
        reader3.readerInfo();

    }
    }
