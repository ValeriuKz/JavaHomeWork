package com.pb.kozyrenko.hw5;

public class Reader {
    String fullName;
    int libraryCardNumber;
    String faculty;
    String dateOfBirth;
    String phone;

    public  Reader(String FullName, int libraryCardNumber, String faculty, String DateOfBirth, String phone){
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = DateOfBirth;
        this.phone = phone;
    }

    public  Reader(String FullName, int libraryCardNumber, String faculty){
        this.fullName = FullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
    }

    public Reader(){
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public int getLibraryCardNumber(){
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber){
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty(){
        return faculty;
    }

    public void setFaculty(String faculty){
        this.faculty = faculty;
    }

    public String getDateOfBirthe(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getInfo() {
        return "{" +
                "fullName='" + fullName + '\'' +
                ", phone=" + phone +
                ", faculty='" + faculty + '\'' +
                ", date of Birth='" + dateOfBirth + '\'' +
                ", library card number='" + libraryCardNumber + '\'' +
                '}';
    }





    public void takeBook(String fullName, int takeBook) {
        System.out.println (fullName + " взял(а) " + takeBook + " книг(у/и).");

    }

    public void takeBook(String... books) {
        System.out.println(this.fullName + " взял следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }


    public void takeBook(Book... books){
        System.out.println(this.fullName + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getTitle() + ", автора - " + book.getBookAuthor() + book.getYearOfPublishing() + "гг.");
        }
        System.out.println();
    }




    public void returnBook(String fullName, int title) {
        System.out.println (fullName + " вернул(а)  книг(у/и)" + title + ".");
    }

    public void returnBook(String... books) {
        System.out.println(this.fullName + " Вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books){
        System.out.println(this.fullName + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getTitle() + ", автора - " + book.getBookAuthor() + book.getYearOfPublishing() + "гг.");
        }
        System.out.println();
    }








    String outputOnDisplayReader() {
        return "[ФИО: " + fullName + ", номер читательского билета: "+ libraryCardNumber + ", факультет: "+ faculty +
                ", дата рождения: " + dateOfBirth + ", телефон: " + phone + "]";
    }


}
