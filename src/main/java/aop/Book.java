package aop;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Prestup. i Nakaz.")
    private String name;

    @Value("F. Dostoevskiy")
    private String author;

    @Value("1866")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearOfPublication(){
        return yearOfPublication;
    }

}
