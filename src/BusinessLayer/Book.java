package BusinessLayer;

public class Book extends Item {

    private String author;
    private String publisher;



    public Book(String itemNumber, String title, Priority priority, String itemType, String author, String publisher , String startDate, String endDate){
        super(itemNumber,title,priority,itemType, startDate, endDate);

        this.author=author;
        this.publisher=publisher;
    }

    public Book(){

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
