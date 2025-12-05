// package Projects;

// import java.util.ArrayList;
// public class BookManager {
//     private ArrayList<Book1> books; // buat array

//     public BookManager() { // constructor
//         books = new ArrayList<>(); // * buat new objek array
//     }
    
//     // * menambah buku baru
//     public void addBook (String title, String author, int year) {
//         books.add(new Book1(title, author, year));
//         System.out.println("Buku berhasil ditambahkan " + title);
//     }

//     // * untuk menampilkan semua buku
//     public void bookList() {
//         if (books.isEmpty()) {
//             throw new IllegalArgumentException("buku tidak ada");
//         }
//         System.out.println("Daftar buku-buku : ");
//         for (int i = 0; i < books.size(); i++) {
//             System.out.println((i + 1) + ". " + books.get(i));
//         }
//     }

//     // * menghapus buku berdasarkan nomor 
//     public void removeBook(int index) {
//         if (index < 1 || index > books.size()) {
//             System.out.println("nomor buku tidak valid");
//         }
//         Book1 removed = books.remove(index - 1);
//         System.out.println("Buku \"" + removed.getTitle() + "\" berhasil dihapus.");
//     }

//     // * mencari buku berdasarkan judul 
//     public void bookSearch(String keyword) {
//         boolean found = false;
//         for (Book1 b : books) {
//             if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
//                 System.out.println("ditemukan: " + b);
//                 found = true;
//             }
//         }
//         if (!found) {
//             System.out.println("Tidak ada judul yang mengandung" + keyword);
//         }
//     }
}
