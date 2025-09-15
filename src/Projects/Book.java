package Projects;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book (String title, String author, int year) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Judul tidak boleh kosong");
        }

        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Penulis tidak boleh kosong");
        }
        
        if (year < 0) {
            throw new IllegalArgumentException("Tahun tidak valid");            
        }  

        this.title = title.trim();
        this.author = author.trim();
        this.year = year;
    }
    // getter method
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" oleh " + author + "(" + year + ")";   
    }
}
