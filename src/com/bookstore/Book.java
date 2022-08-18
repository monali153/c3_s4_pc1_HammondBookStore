package com.bookstore;


public class Book extends Author {

    private long isbnNo;
    private String title;
    private String description;
    private double price;

    public long getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(long isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayBookDetails() {

        System.out.println("Title = " + getTitle());
        System.out.println("ISBN No = " + getIsbnNo());
        System.out.println("Description = " + getDescription());
        System.out.println(toString());
        System.out.println("Price = " + getPrice());
    }

}
