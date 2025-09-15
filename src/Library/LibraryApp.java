package Library;
import java.util.Scanner;


public class LibraryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Library lib = new Library("Perpustakaan UB");

        Category matematika = new Category("Matematika");
        matematika.addBook(new Book("Aljabar Linear", "Gilbert Strang", 2016));
        matematika.addBook(new Book("Kalkulus", "James Stewart", 2015));

        Category fisika = new Category("Fisika");
        fisika.addBook(new Book("Fisika Dasar", "Halliday & Resnick", 2014));
        fisika.addBook(new Book("Mekanika", "Feynman", 1963));

        Category komputer = new Category("Ilmu Komputer");
        komputer.addBook(new Book("Clean Code", "Robert C. Martin", 2008));
        komputer.addBook(new Book("Design Patterns", "Gamma et al.", 1994));

        lib.addCategory(matematika);
        lib.addCategory(fisika);
        lib.addCategory(komputer);

        while (true) {
            System.out.println("Pilih nomor kategori (atau ketik exit): ");
            String line = input.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int categoryIndex = Integer.parseInt(line);
                Category chosen = lib.getCategory(categoryIndex);

                System.out.println("\nAnda memilih kategori: " + chosen.getName());
                chosen.listBooks();

                System.out.println("Ketik nomor buku untuk melihat detail, atau tekan Enter untuk kembali.");
                System.out.print("Pilihan: ");
                String bookChoice = input.nextLine();

                if (!bookChoice.isEmpty()) {
                    int bookIndex = Integer.parseInt(bookChoice);
                    Book selectedBook = chosen.getBooks().get(bookIndex - 1);

                    System.out.println("\nDetail Buku:");
                    System.out.println("Judul : " + selectedBook.getTitle());
                    System.out.println("Penulis: " + selectedBook.getAuthor());
                    System.out.println("Tahun  : " + selectedBook.getYear());
                }

            } catch (Exception e) {
                System.out.println("Input tidak valid, coba lagi.");
            }
        }

        System.out.println("Terima kasih sudah menggunakan aplikasi perpustakaan!");
    }
}