package BusinessLayer;

public class Magazine extends Item {

    private String genre;
    private String producer;
    public Magazine(String itemNumber, String title, Priority priority, String itemType, String genre, String producer, String startDate, String endDate){
        super(itemNumber,title,priority,itemType, startDate, endDate);
        this.genre=genre;
    }

    public Magazine(){

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
