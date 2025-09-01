// belajar scanner untuk input dari user
import java.util.Scanner; // import scanner dari java.util

public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { // membuat objek scanner dengan try-with-resources
            System.out.print("Masukkan nama kamu: "); // meminta input dari user
            String nama = input.nextLine(); // membaca input dari user
            System.out.println("Halo " + nama + ", selamat datang!"); // menampilkan output ke user
        } // scanner akan otomatis ditutup setelah blok try selesai
    }
}