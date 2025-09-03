// *Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simpler problems which are easier to solve.
// *Recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it.
// *Adding two numbers together is easy to do, but adding a range of numbers is more complicated. In the following example, 
// *recursion is used to add a range of numbers together by breaking it down into the simple task of adding two numbers:
public class Recursion {

    // Membuat method static bernama sum yang menerima parameter integer k
    public static int sum(int k) {
        // Kondisi rekursif: jika k lebih besar dari 0
        if (k > 0) {
            // Tambahkan k dengan hasil pemanggilan sum(k - 1)
            // Jadi, sum(k) = k + sum(k-1)
            return k + sum(k - 1);
        } else {
            // Basis dari rekursi: jika k sudah <= 0, kembalikan 0
            return 0; // * halting condition
        }
    }
    // Method utama yang akan dijalankan pertama kali oleh Java
    public static void main(String[] args) {
        // Memanggil fungsi sum dengan nilai awal 0
        int result = sum(10); // *karena k=10 jadi sesuai return-> 10 + sum(9)..... jadi 10+9+8+7+6+5+4+3+2+1+0
        // Menampilkan hasil ke console
        System.out.println(result);
    }
}

// * Halting Condition
// * (atau kondisi berhenti) adalah kondisi dalam sebuah fungsi rekursif yang menentukan kapan rekursi harus berhenti memanggil dirinya sendiri.
// * Biasanya berupa sebuah syarat (if) yang jika terpenuhi, fungsi akan mengembalikan nilai tanpa melakukan pemanggilan rekursif lagi.

class Halting1 {
    public static int sum(int start, int end) {
        if (end > start) { // * ini kondisi yang harus dipenuhi
            return end + sum(start, end - 1); // * di awal yaitu end = 10 > 5 -> return 10 + sum(5,9) -> 5 di dalam kurung untuk kondisi jadi apakah end lebih besar dari 5 atau tidak
        } else {
            return end; // * halting condition
        }
    }
        public static void main(String[] args) {
            int result = sum(5, 10); // * ini maksutnya adalah penjumlahan dari 10 ke 5 yaitu 10+9+8+7+6+5
            System.out.println(result);
        }
    }

// * countdown di recursion
class CountDown {
    static void countdown(int n) { // * void digunakan ketika hanya ingin melakukan perintah di console bukan mengembalikan angka
        if (n >= 0) {
            System.out.println(n + " ");
            countdown(n - 1); // * langsung (n - 1) karena nilai n tetap dan tidak diubah 
        }
    }
    public static void main(String[] args) {
        countdown (10);
    }
}

// * contoh menghitung factoial
class Factorial {
    static int factorial(int x) {
        if (x >= 1) {
            return x * factorial(x - 1);
        } else {
            return 1; // * maksutnya adalah faktorialnya berhenti sampai perkalian ke 1
        }
    }
    public static void main(String[] args) {
        System.out.println("faktorial dari 10 adalah: " + factorial(10));
    }
}