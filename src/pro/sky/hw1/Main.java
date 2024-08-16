package pro.sky.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // Домашка 1 работа с гит
    public static void main(String[] args) {
        int int1 = 14;
        Author author = new Author();
        author.setName("Толстой");
        Book book = new Book();
//        book.setName("Война и мир");
        book.setAuthor(author);

        System.out.println(book.getAuthor().getName());

        Book book1 = new Book();
//        book1.setName("book1");

        Book book2 = new Book();
//        book2.setName("book2");

        Book[] books = {book1, book2};

        Book book3 = new Book("Война и мир", 1980, new Author("asdfsdf", 100));

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);

        System.out.println(Arrays.toString(books));


    }
}
