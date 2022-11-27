import java.io.*;

public class Project2Test {
    BufferedReader fileReader;

    public static void main(String[] args) {
        Project2Test test = new Project2Test("datafile.txt");
    }

    public Project2Test(String fileName) {
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
            while (readNextRecord()) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean readNextRecord() {
        if (fileReader == null) {
            System.out.println("Error: You must open the file first");
            return false;
        } else {
            try {
                String data = fileReader.readLine();
                if (data == null)
                    return false;
                System.out.println(data); // testing
                int titelID = Integer.parseInt(data);
                String title = fileReader.readLine();
                String author = fileReader.readLine();
                int numKeys = Integer.parseInt(fileReader.readLine());
                Article article = new Article(titelID, title, author);
                System.out.println(article); // testing
                String keyword;
                for (int i = 0; i < numKeys; i++) {
                    keyword = fileReader.readLine();

                }
                fileReader.readLine();

            } catch (NumberFormatException e) {
                System.out.println("ERRROORR " + e);
                return false;
            } catch (Exception e) {
                System.out.println("Fatal Error: " + e);
                return false;
            }
        }
        return true;
    }
}

class Article {
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

class Node<E> {
    E element;
    Node<E> next;

    public Node(E e) {
        element = e;
    }

    public String toString() {
        return "" + element;
    }
}