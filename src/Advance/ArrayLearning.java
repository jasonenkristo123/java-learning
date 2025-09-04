package Advance;
public class ArrayLearning {
    public static void main(String[] args) {
        String[] names = {"Aldo", "Babi", "Bobo", "Astaga"};
        System.out.println(names[2]);
    }
}

// loop through array 
class LoopArray {
    public static void main(String[] args) {
        String[] names = {"baba", "bibi", "bubu", "bobo"};
        for (int i = 2; i < names.length; i++) { // output akan bubu bobo karrena dimulai dari index 2 yaitu i nya, setiap nama di itung dari 0
            System.out.println(names[i]);
        }
    }
}

//bisa juga dengan for each
class LoopArrayForEach {
    public static void main(String[] args) {
        String[] names = {"eek", "ook", "iik"};
        for (String i : names) { // for each loop, untuk setiap nama di dalam array names
            System.out.println(i);
        }
    }
}

// sekkarang menggunakan array untuk mencari rata rata umur 

class AverageAge {
    public static void main(String[] args) {
        int ages[] = {20, 22, 24, 26, 28, 30, 35, 40};
        float avg, sum = 0; // inisialisasi variabel avg dan sum

        // get the length of the array
        int length = ages.length; // mendapatkan panjang array

        // Loop through the array
        for (int age : ages) { // for each loop
            sum += age; // sum = sum + age
        }
        avg = sum / length; // menghitung rata rata
        
        System.out.println("the average is: " + avg); // menampilkan rata rata
    }
}


class ArrayLoopLearn {
  public static void main(String[] args) {
    // An array storing different ages
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70}; // ini adalah list array yang kita buat/deklarasi

    float avg, sum = 0; // membuat variable avg dan sum dimulai dari 0

    // Get the length of the array
    int length = ages.length; // membuat variable length yang adalah panjang dari variable umur yang sudah kita buat

    // Loop through the elements of the array
    for (int i = 0; i < ages.length; i++) { // looping variable age adalah nilai di array tersebut
      sum += ages[i]; // sum = sum + age tersebut
    }
    
    // Calculate the average by dividing the sum by the length
    avg = sum / length; // avg = sum dibagi length

    // Print the average
    System.out.println("The average age is: " + avg);
  }
}

// contoh mencari umur terendah

class Taek {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 58, 60, 70, 100};

        int length = ages.length;

        int lowestAge = ages[0];

        for (int i = 0; i < ages.length; i++) {
            if (lowestAge > ages[i]){
            lowestAge = ages[i];
            }                
        }
            System.out.println("umur terendahnya adalah " + lowestAge);
    }
}

// multidimentional array -> dimana adalah array di dalam array
// berguna untuk store data dijadikan form tabel dan rrow
// contoh
class Ngengek {
    public static void main(String[] args) {
        int [][] myNumber = {{1, 2, 3, 4,}, {5, 6, 7}}; // tabel 0 dan tabel 1 -> tiap elemen juga dimulai dari 0
        myNumber [1][1]= 10; // mengganti tabel 1 urutan 1 menjadi 10 
        System.out.println(myNumber[1][2]); // outut akan 7 karena instruksinya adalah tabel 1 dan urutan ke 2
    }
}

//looping di multi array
class Sipal {
    public static void main(String[] args) {
        int[][] nomor = { {1, 2, 3, 4, 5, 6,}, {7, 9, 10} };
        for (int i = 0; i < nomor.length; ++i) {
            for (int j = 0; j < nomor[i].length; ++j) {
                System.out.println(nomor[i][j]);
            }
        }
    }
}

// atau kalau mau lebih simple
class Annyeong {
    public static void main(String[] args) {
        int[][] nomor = {{1, 3, 5, 7}, {10, 20, 30}};
        for (int[] row : nomor) { // maksutnya adalah int[] adalah baris di dalam nomor -> dia mewakili tiap baris yang akan di loop
            for (int i : row) { // ini maksutnya adalah i itu adalah angka di dalam barisnya dan nantinya akan di print sehingga sama saja akan di print semuanya
                System.out.println(i);
            }
        }
    }
}

