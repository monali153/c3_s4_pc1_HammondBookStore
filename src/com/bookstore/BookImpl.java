package com.bookstore;


public class BookImpl {
    public static void main(String[] args) {

        Book book = new Book();

        book.setTitle("Java Programming");
        book.setIsbnNo(123456789012L);
        book.setDescription("Introduction of Java Programming and Implementation");
        book.setPrice(500);

        book.setAuthorName("James Gosling");
        book.setAuthorPenName("James Gosling's Pen");

        book.displayBookDetails();


    }


}
