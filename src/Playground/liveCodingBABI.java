package Playground;

import java.util.*;
public class liveCodingBABI {
    static Scanner in = new Scanner(System.in);
    static double ipk = 0;
    static double sum = 0;
    static double ipkmin = 4;
    static double ipkmax = 0;
    static String nilai;
    static String status = "";
    static double rata = 0;
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            nilai = in.next();
            switch (nilai) {
            case "A":
                ipk = 4.0;
                break;
            case "B+":
                ipk = 3.5;
                break;
            case "B":
                ipk = 3.0;
                break;
            case "C+":
                ipk = 2.5;
                break;
            case "C":
                ipk = 2.0;
                break;
            case "D+":
                ipk = 1.5;
                break;
            case "D":
                ipk = 1.0;
                break;
            case "E":
            case "K":
                ipk = 0;
                break;
            default:
                ipk = 0;
                System.out.println("Nilai tidak valid: " + nilai + " (dianggap 0.00)");
            }
            sum += ipk;
            rata = sum / 5;
        }
        System.out.println("=== HASIL PERHITUNGAN IPK ===");
        System.out.printf("%-16s: %.2f\n", "IPK Rata-rata", rata);
        ipkMaks();
        ipkMin();
        Status();

    }
    static void ipkMaks() {
        if (ipk > ipkmax) {
            ipkmax = ipk;
        }
        System.out.printf("%-16s: %.2f\n", "IPK Tertinggi", ipkmax);
    }
    static void ipkMin() {
        if (ipk < ipkmin) {
            ipkmin = ipk;
        }
        System.out.printf("%-16s: %.2f\n", "IPK Terendah", ipkmin);
    }
    static void Status() {
        if (rata > 2.75) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }
        System.out.println("Status: " + status);
    }
}

class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kalimat = in.nextLine();

        String hasilTeks = ubahFormat(kalimat);
        int jumlahVokal = hitungVokal(kalimat);

        tampilHasil(hasilTeks, jumlahVokal);
    }
    static String ubahFormat(String teks) {
        teks = teks.toUpperCase();
        teks = teks.replace(" ", "-");
        return teks;
    }
    static int hitungVokal(String teks) {
        teks = teks.toUpperCase();
        int jumlah = 0;
        for (int i = 0; i < teks.length(); i++) {
            char vokal = teks.charAt(i);
            if (vokal == 'A' || vokal == 'I' || vokal == 'U' || vokal == 'E' || vokal == 'O') {
                jumlah++;
            }
        }
        return jumlah;
    }
    static void tampilHasil(String hasil, int vokal) {
        System.out.println("Kalimat hasil format: " + hasil);
        System.out.println("Jumlah huruf vokal: " + vokal);
    }
}