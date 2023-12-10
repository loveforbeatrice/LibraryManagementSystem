package BusinessLayer;


public abstract class Item {
    private String itemNumber;
    private String title;
    private Priority priority;

    private String itemType;

    private String startDate;
    private String endDate;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    //full argument constructer
    public Item(String itemNumber, String title, Priority priority, String itemType, String startDate, String endDate){
        this.itemType=itemType;
        this.title=title;
        this.priority=priority;

        this.itemNumber=itemNumber;
        this.startDate = startDate;
        this.endDate= endDate;
    }

    //boş constructrer yapmazsak hata veriyordu ondan attım
    public Item(){

    }

    public String toString(){
        return getItemNumber()+" "+getTitle()+" "+getPriority()+" "+getItemType()+" "+getStartDate()+" "+getEndDate();
    }
    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }


}
