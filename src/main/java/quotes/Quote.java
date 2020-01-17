package quotes;

public class Quote {

  String[] tags;
  String author;
  String likes;
  String text;

  public Quote(String[] tags, String author, String likes, String text) {

    this.tags = tags;
    this.author = author;
    this.likes = likes;
    this.text = text;
  }

  public Quote(String author, String text) {
    this.author = author;
    this.text = text;
  }

  @Override
  public String toString() {
    return "Quote{" +
        "tags='" + tags + '\'' +
        ", author='" + author + '\'' +
        ", likes='" + likes + '\'' +
        ", text='" + text + '\'' +
        '}';
  }
}
