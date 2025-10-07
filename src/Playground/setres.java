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

class setres1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah array: ");
        int jumlahArray = in.nextInt();

        int arr[] = new int[jumlahArray];

        for (int i = 0; i < jumlahArray; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < jumlahArray; i++) {
            System.out.println("Array saat ini adalah = " + arr[i]);
        }

        int avg, sum = 0;
        for (int i = 0; i < jumlahArray; i++) {
            sum += arr[i];
        }
        avg = sum / jumlahArray;

        int nmax = arr[0];
        int nmin = arr[0];

        for (int i = 0; i < jumlahArray; i++) {
            if (arr[i] > nmax) {
                nmax = arr[i];
            } else if (arr[i] < nmin) {
                nmin = arr[i];
            }
        }

        // mencari berapa angka yang ganjil dan genap di array tersebut
        int genap = 0;
        int ganjil = 0;
        for (int i = 0; i < jumlahArray; i++) {
            if (arr[i] % 2 == 0) {
                genap++;
            } else if (arr[i] % 2 == 1) {
                ganjil++;
            }
        }

        // menampilkan array secara terbalik
        
        for (int i = jumlahArray - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        // mengubah nilai negatif menjadi 0

        for (int i = 0; i < jumlahArray; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.println("Jumlah semua angka: " + sum);
        System.out.println("rata ratanya adalah: " + avg);
        System.out.println("nilai max: " + nmax);
        System.out.println("nilai min: " + nmin);
        System.out.println("Terdapat angka ganjil sebanyak: " + ganjil + ", dan genap: " + genap);
        

        // mencari apakah ada nilai di array
        boolean ketemu = true;
        
        int cari;
        while (ketemu) {
            System.out.print("Mau mencari angka di array (ya/tidak)?: ");
            String jawab = in.next();
            if (jawab.equalsIgnoreCase("tidak")) {
                ketemu = false;
            } else if (jawab.equalsIgnoreCase("ya")) {
                System.out.print("Masukkan angka tersebut: ");
                cari = in.nextInt();
                for (int i = 0; i < jumlahArray; i++) {
                    if (arr[i] == cari) {
                        System.out.println("angka ditemukan!");
                        break;
                    } else {
                        System.out.println("angka tidak ditemukan");
                        break;
                    }
                }
            }
        }
    }
}

class setres2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan baris: ");
        int baris = in.nextInt();

        System.out.print("Masukkan kolom: ");
        int kolom = in.nextInt();

        int arr[][] = new int [baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan angka ke [" + i + "][" + j + "]: "); 
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Array saat ini: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // menambahkan semua array 
        int sum = 0;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Jumlah dari semua array: " + sum);
    }
}