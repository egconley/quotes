package quotes;

public class APIQuote {
    String qotd_date;
    APIQuoteContent quote;


    public APIQuote(String qotd_date, APIQuoteContent quote) {
        this.qotd_date = qotd_date;
        this.quote = quote;
    }

    public String toString() {
        return "" + quote;
    }
}
