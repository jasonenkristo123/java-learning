package Library;

// * untuk menyimpan banyak buku
import java.util.ArrayList;
public class Category {
    private String name; // * untuk nama kategori misal (matematika,fisika,apapun)
    private ArrayList<Book> books; // * seperti biasa buat array

    public Category(String name) { // constructor
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("nama kategori tidak boleh kosong");
        }
        this.name = name.trim();
        this.books = new ArrayList<>();
    }

    // getter lagi
    public String getName() {
        return name;
    }
    // * buat nambah buku ke kategori
    public void addBook(Book book) {
        books.add(book);
    }
    // * nampilkan daftar buku
    public void listBooks() {
        if (books.isEmpty()) {
            throw new IllegalArgumentException("tidak ada buku di kategori" + name);
        }
        System.out.println("Daftar buku di kategori " + name + ": ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }
    // * ambil semua buku bila library perlu akses
    public ArrayList<Book> getBooks() {
        return books;
    }
}
