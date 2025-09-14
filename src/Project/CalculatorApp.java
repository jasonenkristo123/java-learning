package Project;

import java.util.ArrayList;
import java.util.Scanner; // untuk fitur history

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membaca input
        Calculator calc = new Calculator(); // buat object dari class calculator

        ArrayList<String> history = new ArrayList<>(); // membuat tabel array namanya history

        while (true) { // looping agar user bisa pakai terus
            System.out.println("Masukkan perhitungan misal (10 + 5), ketik help untuk lebih lanjut: ");
            String line = input.nextLine();
            if (line.equalsIgnoreCase("help")) {
                System.out.println("Perintah yang tersedia");
                System.out.println("- ketik \"exit\" untuk keluar");
                System.out.println("- ketik \"history\" untuk melihat history");
                System.out.println("- ketik \"clear\" untuk menghapus history");
                System.out.println("- operasi aritmatika yang tersedia: +, -, *, /, %, sqrt");
            }
            if (line.equalsIgnoreCase("exit")) { // kalau exit, keluar loop
                break;
            }
            
            if (line.equalsIgnoreCase("history")) {
                if (history.isEmpty()) {
                    System.out.println("belum ada history");
                } else {
                    System.out.println("History: ");
                    for (String h : history) 
                    System.out.println(h); // segala elemen yang ada di history di print
                }
            }   

            if (line.equalsIgnoreCase("clear")) {
                history.clear();
                System.out.println("history semua di clear");
                continue;
            }
            
            if (line.toLowerCase().startsWith("sqrt")) {
                try {
                
                String numberStr = line.substring(4).trim(); // mengambil angka setelah sqrt
                double a = Double.parseDouble(numberStr);

                if (a < 0) {
                    System.out.println("tidak bisa angka negatif di akar");
                } else {
                    double hasil = Math.sqrt(a);
                    history.add("akar dari " + a + " = " + hasil);
                    System.out.println("hasil = " + hasil);
                }
            } catch (Exception e) {
                System.out.println("error input akar");
            }
            continue;
        }

            try { // -> bagian yang rawan eror 
                // memecah input berdasarkan spasi

                // trim() → membersihkan spasi di depan/belakang input.
                //split(" ") → memecah string berdasarkan spasi.
                //Contoh: "10 + 5".split(" ") → hasil: ["10", "+", "5"].

                String lineFormatted = line.replaceAll("([+\\-\\*/%^])", " $1 ");
                String [] parts = lineFormatted.trim().split("\\s+"); // maksutnya 1 atau lebih spasi
                // maksutnya adalah di pisah per angka misal "10", "+", "5"
                double a = Double.parseDouble(parts[0]); // index 0 adalah angka 1
                String Operator = parts[1]; // index 1 adalah operatorr
                double b = Double.parseDouble(parts[2]); // index 2 adalah angka 2

                double hasil = calc.calculate(a, b, Operator); // hasilnya sesuai dengan perhitungan di file calculator
                System.out.println("Hasilnya: " + hasil);

                
                String ekspresi = a + " " + Operator + " " + b + " = " + hasil;
                history.add(ekspresi); // menambahkan ekspresi ke tabel history

            } catch (Exception e) { // kalau eror akan menampilkan pesan
                System.out.println(e.getMessage()); // getmessage adalah mengampil pesan yang di file satunya
            }
        }
        System.out.println("program selesai");
    }
}
