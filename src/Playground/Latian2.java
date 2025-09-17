package Playground;

import java.util.Scanner;
public class Latian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int saldo = 0;
        while (true) { 
        System.out.println("---------- Vending Machine ----------");
        System.out.println("Beberapa pilihan sebagai berikut:");
        System.out.println("Coca cola (Rp. 7000)");
        System.out.println("Teh Pucuk (Rp. 5000)");
        System.out.println("Air Mineral (Rp. 3000)");
        System.out.println("-------------------------------------");
        System.out.println("1. Isi saldo");
        System.out.println("2. Beli Minuman");
        System.out.println("3. Exit");
        System.out.print("Pilihan: ");

        int pilihan = input.nextInt();
        int coca = 7000;
        int pucuk = 5000;
        int mineral = 3000;
        

            switch (pilihan) {
                case 1:
                    System.out.println("Mau isi saldo berapa: ");
                    int isiSaldo = input.nextInt();
                    if (saldo >= 0) {
                    saldo += isiSaldo;
                    System.out.println("Berhasil! sekarang saldomu: " + saldo);
                    } else {
                        System.out.println("input saldo tidak valid");
                    }
                    break;
                case 2:
                    System.out.println("Masukkan nomor minuman yang mau dibeli");
                    int menu = input.nextInt();
                    System.out.println("Mau beli berapa: ");
                    int jumlah = input.nextInt();
                    int totalharga = 0;
                    if (menu == 1) {
                        totalharga = coca * jumlah;
                    } else if (menu == 2) {
                        totalharga = pucuk * jumlah;
                    } else if (menu == 3) {
                        totalharga = mineral * jumlah;
                    } else {
                        System.out.println("Pilihan minuman tidak tersedia");
                        break;
                    }
                    if (saldo >= totalharga) {
                        saldo -= totalharga;
                        System.out.println("Berhasil dibeli! sekarang saldomu adalah " + saldo);
                    } else {
                        System.out.println("maaf saldomu kurang tidak bisa beli");
                    }
                    break;
                    case 3:
                        System.out.println("Terimakasih sudah belanja!");
                        return;
                    default:
                        System.out.println("menu tidak valid silahkan coba lagi");
                }
            }
        }
    }
