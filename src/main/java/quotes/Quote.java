package quotes;

public class Quote {

  String author;
  String text;

  public Quote(String author, String text) {
    this.author = author;
    this.text = text;
  }

  public Quote(APIQuote quote) {
    this.author = quote.quote.author;
    this.text = quote.quote.body;
  }

  public Quote(APIQuoteContent quote) {
    this.author = quote.author;
    this.text = quote.body;
  }

  public String toString() {
    return text + " - " + author;
  }
}
