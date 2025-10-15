import java.util.*;

// ===== Base Class (Encapsulation + Abstraction) =====
abstract class Book {
    private String title;
    private String author;
    private int copies;

    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getCopies() { return copies; }

    public void setCopies(int copies) { this.copies = copies; }

    public abstract double calculateLateFee(int daysLate);
}

