package main;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "book")
@XmlType(propOrder={"author", "title", "genre", "price", "publish_date"})
public class Book {
    private String author;
    private String title;
    private String genre;
    private double price;
    private String publish_date;

    public Book(){
        super();
    }

    public Book(String author, String title, String genre, double price, String publish_date) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.publish_date = publish_date;
    }

    public String getAuthor() {
        return author;
    }

    @XmlElement
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @XmlElement
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    @XmlElement
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    @XmlElement
    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublish_date() {
        return publish_date;
    }

    @XmlElement
    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", publish_date='" + publish_date + '\'' +
                '}';
    }
}
