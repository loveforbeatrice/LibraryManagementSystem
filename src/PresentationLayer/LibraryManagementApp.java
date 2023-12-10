package PresentationLayer;
import DataAccessLayer.FileIO;


public class LibraryManagementApp {
    public static void main(String[] args) {
        FileIO fileIO = new FileIO();
        fileIO.readItemsFromFile("src\\items.csv");
    }
}
