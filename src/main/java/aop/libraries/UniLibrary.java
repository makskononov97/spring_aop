package aop.libraries;

import aop.Book;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We took the book from UniLibrary");
        System.out.println("----------------------------------");
    }
    public String returnBook() {
        int a = 10/0;
        System.out.println("We return book in UniLibrary");
        return "Voina i mir";
    }
    public void getMagazine() {
        System.out.println("We took the magazine from UniLibrary");
        System.out.println("----------------------------------");
    }
    public void returnMagazine() {
        System.out.println("We return magazine in UniLibrary");
        System.out.println("----------------------------------");
    }
    public void addBook(String person_name, Book book) {
        System.out.println("We add the book in UniLibrary");
        System.out.println("----------------------------------");
    }
    public void addMagazine() {
        System.out.println("We add magazine in UniLibrary");
        System.out.println("----------------------------------");
    }

}
