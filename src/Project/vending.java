package Project;
import java.util.Scanner;

public class vending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kodeBarang = input.next();
        int jumlahBarang = input.nextInt();
        double jumlahUang = input.nextDouble();

        int stok = 0;
        double harga = 0;
        String namaProduk = "";
        boolean kodeValid = true;

        if (jumlahBarang <= 0 ) {
            System.out.println("Anda tidak melakukan pembelian apapun");
            input.close();
            return;
        }
        
        switch (kodeBarang) {
            case "A":
                namaProduk = "susu";
                stok = 3;
                harga = 7500;
                break;
            case "B":
                namaProduk = "snack";
                stok = 4;
                harga = 10000;
                break;
            case "C":
                namaProduk = "air mineral";
                stok = 1;
                harga = 6500;
                break;
            default:
                System.out.println("Kode barang tidak valid");
                kodeValid = false;
                break;
        }
        if (kodeValid) {
            double hargaTotal = jumlahBarang * harga;
            if (jumlahBarang > stok) {
                System.out.println("Stok tidak mencukupi");
            } else if (jumlahUang < hargaTotal) {
                System.out.println("Uang anda tidak cukup");
            } else {
                double kembalian = jumlahUang - hargaTotal;
                System.out.printf("Kamu sudah beli %s, dan mendapat kembalian sejumlah Rp%,.2f", namaProduk, kembalian);
            }
        }
    }
}
