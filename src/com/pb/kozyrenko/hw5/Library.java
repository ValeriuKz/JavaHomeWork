package com.pb.kozyrenko.hw5;



public class Library {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.bookAuthor = "Tommas Anderson";
        book2.bookAuthor = "Kirill Enshtein";
        book3.bookAuthor = "Dem Mihailov";

        book1.title = "Snegurochka";
        book2.title = "Krasnaia shapochka";
        book3.title = "Karlson";

        book1.yearOfPublishing = 1876;
        book2.yearOfPublishing = 1377;
        book3.yearOfPublishing = 1573;

        System.out.println("Книги:");
        System.out.println(book1.outputOnDisplayBook());
        System.out.println(book2.outputOnDisplayBook());
        System.out.println(book3.outputOnDisplayBook());

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        reader1.dateOfBirth = "29.05.95";
        reader2.dateOfBirth = "20.03.67";
        reader3.dateOfBirth = "19.07.89";

        reader1.faculty = "filosofiya";
        reader2.faculty = "vishMat";
        reader3.faculty = "programirovanie";

        reader1.fullName = "Жиженко Жижевич Жижа";
        reader2.fullName = "Тазашо Олег Петрович";
        reader3.fullName = "Давалкина Анжела Адольфовна";

        reader1.libraryCardNumber = 23;
        reader2.libraryCardNumber = 11;
        reader3.libraryCardNumber = 27;

        reader1.phone = "0993445567";
        reader2.phone = "0974356543";
        reader3.phone = "0672352342";



        System.out.println("Посетители:");
        System.out.println(reader1.outputOnDisplayReader());
        System.out.println(reader2.outputOnDisplayReader());
        System.out.println(reader3.outputOnDisplayReader());
        System.out.println();


        System.out.println("Кто сколько взял? У меня все записано:");
        reader1.takeBook("Жиженко Жижевич Жижа",2);
        reader2.takeBook("Тазашо Олег Петрович",1);
        reader3.takeBook("Давалкина Анжела Адольфовна",3);
        System.out.println();

        reader1.takeBook("filosofiya","vishMat","programirovanie");
        reader2.takeBook("filosofiya","programirovanie");
        reader3.takeBook("filosofiya","vishMat");

        reader1.takeBook(book1,book2,book3);
        reader2.takeBook(book1,book3);
        reader3.takeBook(book2,book3);

        System.out.println("Посетители вернувшие книги:");
        reader1.returnBook("Жиженко Жижевич Жижа вернул",2);
        reader2.returnBook("Тазашо Олег Петрович вернул",1);
        reader3.returnBook("Давалкина Анжела Адольфовна вернул",3);
        System.out.println();

        reader1.returnBook("filosofiya","vishMat","programirovanie");
        reader2.returnBook("filosofiya","programirovanie");
        reader3.returnBook("filosofiya","vishMat");

        reader1.returnBook(book1,book2,book3);
        reader2.returnBook(book1,book3);
        reader3.returnBook(book2,book3);

        Reader[] readers = {reader1, reader2, reader3};
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();


    }
}
