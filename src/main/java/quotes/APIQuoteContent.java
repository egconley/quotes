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

}
