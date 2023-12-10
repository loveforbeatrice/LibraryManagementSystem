package DataAccessLayer;
import BusinessLayer.Book;
import BusinessLayer.Magazine;
import BusinessLayer.Item;
import BusinessLayer.Priority;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    public List<Item> readItemsFromFile(String fileName) {
        List<Item> items = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] veri = line.split(";");

                String itemNumber = veri[0];
                String title = veri[1];
                Priority priority = Priority.valueOf(veri[2].replace("i", "ı").toUpperCase().replace(" ", "_"));
                String itemType = veri[3];
                String commonField = veri[5]; // Common field for author/genre and publisher/producer
                String startDate = veri[7];
                String endDate = veri[8];

                if (itemType.equals("book")) {
                    String author = commonField; // Assuming it's the author field
                    String publisher = veri[6]; // Publisher field for Book class
                    items.add(new Book(itemNumber, title, priority, itemType, author, publisher, startDate, endDate));
                } else if (itemType.equals("magazine")) {
                    String genre = commonField; // Assuming it's the genre field
                    String producer = veri[6]; // Producer field for Magazine class
                    items.add(new Magazine(itemNumber, title, priority, itemType, genre, producer, startDate, endDate));
                }



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(items.get(1).toString());
        return items;
    }
}