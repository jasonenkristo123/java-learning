import java.util.List;
import java.util.ArrayList;

class Book {
    public String title; // nama buku
    public List<String> authors; // pakai list karena bisa lebih dari 1 penulis

    public Book(String title, List<String> authors) {
        this.title = title;
        this.authors = authors;
    }
}

class Category {
    public String name;
    public List<Book> books; // menyimpan banyak list buku dalam 1 kategori

    public Category(String name) {
        this.name = name;
        this.books = new ArrayList<>(); // buat list kosong untuk menyimpan buku buku;
    }

    public void addBook(Book buku) { // method untuk menambah buku ke kategori
        books.add(buku);
    }
}

class Library { // mewakili perpustakaan
    public String name; // untuk nama perpusnya
    public List<Category> categories; // 

    public Library(String name) {
        this.name = name;
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category kategori) {
        categories.add(kategori); // simpan kategori ke list
    }
}












class perpustakaan {
    
}
