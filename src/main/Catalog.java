package main;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Catalog {
    @XmlElement(name = "book")
    private ArrayList<Book> booksCatalog = new ArrayList<>();

    public Catalog(){
        super();
    }

    public void add(Book book){
        if (book != null){
            booksCatalog.add(book);
        }
    }

    public ArrayList<Book> getBooksCatalog() {
        return booksCatalog;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Book b : booksCatalog) {
            stringBuilder.append(b).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
