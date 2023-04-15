import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        /*
            PatikaDev Java102 - Book Sorter
        Example of sorting books by title and number of pages.

            Patika.Dev homework description:
        Design a class called Book. Inherit this class from the Comparable interface and override the "compareTo" method.
        In this method, write the code that sorts the book from A to Z by name.
        Create 5 objects of this class and store them in a structure of type Set.
        Then use a second data structure of type Set and make it sort the books by the number of pages.
        Book class consists of book name, number of pages, author's name, publication date variables.
         */

        Book b1 = new Book("Nexus", 534, "Ramez NAAM","2012");
        Book b2 = new Book("Crux", 568, "Ramez NAAM","2013");
        Book b3 = new Book("Apex", 656, "Ramez NAAM","2015");
        Book b4 = new Book("Atomic Habits", 320, "James CLEAR","2019");
        Book b5 = new Book("Kürk Mantolu Madonna", 177, "Sabahattin ALİ","1943");

        System.out.println("\n********** List ordered by title of the book **********");
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(b1);
        bookSetByName.add(b2);
        bookSetByName.add(b3);
        bookSetByName.add(b4);
        bookSetByName.add(b5);

        for (Book book : bookSetByName){
            System.out.println(book);
        }

        System.out.println("\n********** List ordered by the number of pages of the book **********");
        Set<Book> bookSetByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageCount() - o2.getPageCount();
            }
        });

        bookSetByPageCount.add(b1);
        bookSetByPageCount.add(b2);
        bookSetByPageCount.add(b3);
        bookSetByPageCount.add(b4);
        bookSetByPageCount.add(b5);

        for (Book book : bookSetByPageCount){
            System.out.println(book);
        }
    }
}