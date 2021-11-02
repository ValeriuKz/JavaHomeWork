package com.pb.kozyrenko.hw5;

public class Book {
    String title;
    String bookAuthor;
    int yearOfPublishing;

    public  Book(String title, String bookAuthor, int yearOfPublishing){
        this.title = title;
        this.bookAuthor = bookAuthor;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book(){
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getBookAuthor(){
        return bookAuthor;
    }

    public void setBookAuthor(String fullName){
        this.bookAuthor = bookAuthor;
    }
    public int getYearOfPublishing(){
        return yearOfPublishing;
    }

    public void setYearOfPublishing(String fullName){
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getInfo() {
        return "{" +
                "name='" + title + '\'' +
                ", author='" + bookAuthor + '\'' +
                "year of publishing" + yearOfPublishing +
                '}';
    }





    String outputOnDisplayBook() {
     return "[Название: " + title + ", Автор книги: "+ bookAuthor + ", год издания: "+ yearOfPublishing +"]";
    }


    public void title(String... titles){
        System.out.println(titles[0]);
    }


}
