public class Article {
    int id;
    String title;
    String author;

    public Article(int i, String title, String author) {
        id = i;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return String.format("\t %d | %s | %S-->\n", id, title, author);
    }
}
