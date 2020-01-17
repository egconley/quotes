package quotes;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class APIQuoteContent {
    String author;
    String body;

    public APIQuoteContent(String author, String body) {
        this.author = author;
        this.body = body;
    }

    public String toString() {
        return body + "\n" + " - " + author;
    }

    public void addToJSON(APIQuoteContent quote) {
        Gson gson = new Gson();
        System.out.println("made it into addToJSON method!!");
        try {
            File file = new File("assets/recentquotes.json");
            FileReader reader = new FileReader(file);
            ArrayList myArrayList = gson.fromJson(reader, ArrayList.class);
            System.out.println(myArrayList);
        } catch (FileNotFoundException e) {
            System.out.println("file not found " + e);
        }
    }
}
