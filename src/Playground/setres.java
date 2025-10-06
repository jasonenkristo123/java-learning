package Playground;

import java.util.Scanner;

public class setres {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Berapa jumlah mahasiswa?: ");
        int jumlah = in.nextInt();

        int mahasiswa[] = new int[jumlah];
        int sum = 0;
        // mau menginput nilai mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            mahasiswa[i] = in.nextInt();
            
            sum += mahasiswa[i];
        }
            double avg = sum / jumlah;
            
            int nilaiTerendah = mahasiswa[0];
            int nilaiTertinggi = mahasiswa[0];

        for (int i = 0; i < jumlah; i++) {
            if (mahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = mahasiswa[i];

            }
            if (mahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = mahasiswa[i];
                
            }
        }

        int jumlahGenap = 0;
        int jumlahGanjil = 0;

        // mencari jumlah angka genap dan ganjil
        for (int j = 0; j < jumlah; j++) {
            if (mahasiswa[j] % 2 == 0) {
                jumlahGenap += mahasiswa[j];
            } else if (mahasiswa[j] % 2 == 1) {
                jumlahGanjil += mahasiswa[j];
            }
        }

        // mencari banyaknya angka genap dan ganjil
        int banyakGenap = 0;
        int banyakGanjil = 0;

        for (int i = 0; i < jumlah; i++) {
            if (mahasiswa[i] % 2 == 0) {
                banyakGenap++;
            } else {
                banyakGanjil++;
            }
        }


        System.out.println("Total seluruh nilai: " + sum);
        System.out.println("Rata-rata: " + avg);
        System.out.println("Nilai terendah adalah: " + nilaiTerendah);
        System.out.println("Nilai tertinggi adalah: " + nilaiTertinggi);
        System.out.println("Jumlah angka genap: " + jumlahGenap);
        System.out.println("Jumlah angka ganjil: " + jumlahGanjil);
        System.out.println("Banyaknya angka genap: " + banyakGenap);
        System.out.println("Banyaknya angka ganjil: " + banyakGanjil);
        

    }
}
