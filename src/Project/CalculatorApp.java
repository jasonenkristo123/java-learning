package Project;

import java.util.Scanner;
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membaca input
        Calculator calc = new Calculator(); // buat object dari class calculator

        while (true) { // looping agar user bisa pakai terus
            System.out.println("Masukkan perhitungan (10 + 5) atau exit: ");
            String line = input.nextLine();
            
            if (line.equalsIgnoreCase("exit")) { // kalau exit, keluar loop
                break;
            }

            try { // -> bagian yang rawan eror 
                // memecah input berdasarkan spasi

                // trim() → membersihkan spasi di depan/belakang input.
                //split(" ") → memecah string berdasarkan spasi.
                //Contoh: "10 + 5".split(" ") → hasil: ["10", "+", "5"].

                String[] parts = line.trim().split(" "); // maksutnya adalah di pisah per angka misal "10", "+", "5"
                double a = Double.parseDouble(parts[0]); // index 0 adalah angka 1
                String Operator = parts[1]; // index 1 adalah operatorr
                double b = Double.parseDouble(parts[2]); // index 2 adalah angka 2

                double hasil = calc.calculate(a, b, Operator); // hasilnya sesuai dengan perhitungan di file calculator
                System.out.println("Hasilnya: " + hasil);

            } catch (Exception e) { // kalau eror akan menampilkan pesan
                System.out.println("Error: " + e.getMessage()); // 
            }
        }
        System.out.println("program selesai");
    }
}
