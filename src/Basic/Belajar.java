package Basic;
// File: HelloWorld.java
/*
 * Basic Java Example: Hello World
 * Save this file as HelloWorld.java
 */
// lagi belajar java jangan dihujat ya
/*
 * nah kalo ini emang buat multi line comment jadi 
 * bisa lebih dari satu baris hehe
 */
import java.util.Random;

public class Belajar {
    public static void main(String[] args) {
        System.out.println("aku lagi belajar java");
        System.out.println(2 * 10);
        System.out.print("halo namaku steven");
        System.out.print(", aku di SMU sekarang");
    }
}

// belajar string dulu -> string adalah tipe data yang digunakan untuk menyimpan teks
 class Stringexample { //ini tidak ada public karena sudah ada public class helloworld diatas
    public static void main(String[] args) {
        String name = "Jason Enkristo";
        String namadepan = "Steven";
        String namabelakang = " Chiang";
        String namapanjang = ("halo semua namaku " + namadepan + namabelakang); // menggabungkan string
        System.out.println(namapanjang);
        System.out.println("hello my name is " + name);
    }
}

// sekarang integer
class IntegerExample {
    public static void main(String[] args) {
    int myNum = 18;
    myNum = 20; // mengubah nilai myNum
    myNum = myNum + 2; // menambah nilai myNum
    int x = 5;
    int y = myNum;
    int z = x + y; // mengalikan x dan y
    int a = 3, b = 4, c = 5; // mendeklarasikan beberapa variabel sekaligus
    System.out.println(a + b + c); // menampilkan hasil penjumlahan
    System.out.println(z); // menampilkan hasil perkalian
    System.out.println(("angka kebruntunganku adalah ") + z); // menampilkan string dengan variabel

    }
}

class Floatex { // tipe data float digunakan untuk menyimpan angka desimal
    public static void main(String[] args) {
    float tinggi = 5.7f; // tipe data float harus diakhiri dengan 'f'
    System.out.println(("halo tinggi aku, ") + tinggi + "feet atau " + (tinggi * 30.48) + "cm");
    }
}

class Booleanex {
    public static void main(String[] args) {
        boolean javaSeru = true; // tipe data boolean hanya bisa true atau false
        System.out.println(javaSeru);
    }
}

class Testing {
    public static void main(String[] args) {
        String nama = "JM";
        int nim = 123456;
        int umur = 19;
        String jeniskelamin = "Laki-laki";
        float ipk = 2.5f;
        char grade = 'B';

        System.out.println("nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("umur: " + umur);
        System.out.println("jenis kelamin: " + jeniskelamin);
        System.out.println("ipk: " + ipk);
        System.out.println("grade: " + grade);
    }
}

// menghitung luas persegi panjang
class Persegipanjang {
    public static void main(String[] args) {
        int length = 10; // panjang
        int width = 5; // lebar
        int luas = length * width; // menghitung luas

        System.out.println("Panjang dari persegi panjang adalah(cm): " + length);
        System.out.println("Lebar dari persegi panjang adalah(cm): " + width);
        System.out.println("Luas dari persegi panjang adalah(cm): " + luas);
    }
}

// widening dan narrowing conversion
// widening conversion adalah konversi tipe data dari tipe data kecil ke tipe data besar
 class Wide {
  public static void main(String[] args) {
    int myInt = 11;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);
    System.out.println(myDouble);
  }
}

// narrowing conversion adalah konversi tipe data dari tipe data besar ke tipe data kecil
 class Narrow {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Explicit casting: double to int

    System.out.println(myDouble);
    System.out.println(myInt);
  }
}

// contoh penggunaan dari typecasting dimana kita menggunakannya untuk memastikan bahwa hasilnya adalah floating-point bukan integer
class Typecastingexample {
    public static void main(String[] args) {
        int maxScore = 1000;
        int nilaiUser = 543; // nilai user yang didapatkan
        float persentase = (float) nilaiUser / maxScore * 100; // typecasting dari int ke float
        System.out.println("Persentase nilai user adalah: " + persentase + "%"); // sehingga hasilnya adalah float dari int
    }
}

// sekarang adalah contoh operator 
 class Operasi {
  public static void main(String[] args) {
    int sum1 = 100 + 100;
    int sum2 = sum1 + 290;
    int sum3 = sum2 + sum2;
    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);  
  }
}

/*
 * Java dibagi menjadi beberapa operator
 * 1. Arithmetic operators - digunakan untuk operasi matematika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian.
 * 2. Assignment operators - digunakan untuk menetapkan nilai ke variabel.
 *    Contoh: =, +=, -=, *=, /=, %= =	x = 5	x = 5	
 * +=	x += 3	x = x + 3
 * -=	x -= 3	x = x - 3
 * *=	x *= 3	x = x * 3
 * /=	x /= 3	x = x / 3
 * %=	x %= 3	x = x % 3
 * 3. Comparison operators - digunakan untuk membandingkan dua nilai.
 *   Contoh: ==, !=, >, <, >=, <=
 * 4. Logical operators - digunakan untuk menggabungkan kondisi logika.
 *    Contoh: && (AND), || (OR), ! (NOT)
 *    && = true jika kedua kondisi benar
 *    || = true jika salah satu kondisi benar
 *    ! = membalikkan nilai boolean
  * 5. Bitwise operators - digunakan untuk operasi bit pada bilangan bulat.
 * 5. Bitwise operators
 */

 //contoh comparison operators
  class Membandingkan {
  public static void main(String[] args) {
    int x = 5;
    int y = 3;
    System.out.println(x > y); // returns true, because 5 is higher than 3
  }
}

// contoh logical operators
// && conditional AND
class Logika1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x > 3 && y < 5); // returns true, because both conditions are true
    }
}

// || conditional OR
class Logika2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        System.out.println(x > 3 || y > 10); // returns true, because one of the conditions is true
    }
}

// reverse conditional NOT
class Logika3 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(!(x > 3)); // returns false, because the condition is true and we are reversing it
    }
}

// java string methods
// contoh penggunaan string methods -> menghitung panjang string
class Stringmetode {
    public static void main(String[] args) {
        String txt = "ABCDFEGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Panjang dari string adalah: " + txt.length()); // menghitung panjang string
    }
}

// contoh penggunaan string methods -> mengubah string menjadi huruf kecil -> yaitu toLowerCase() 
// sebaliknya toUpperCase() untuk mengubah menjadi huruf besar

// sekarang yaitu mencari substring dari string atau chars tertentu dari string
class Substring {
    public static void main(String [] args) {
        String txt = "Hello There People"; 
        System.out.println(txt.indexOf("People")); // mencari index dari string People -> hasil akan 12 karena per huruf di hitung dari 0 termasuk spasi
    }
}

// string concatenation -> menggabungkan string
class concatenation {
    public static void main(String[] args) {
        String FirstName = "Jason";
        String LastName = " Enkristo";
        System.out.println(FirstName.concat(LastName)); // menggabungkan string dengan concat()
    }
}

// string bisa di gabungkan dengan integer
class Stringconcat {
    public static void main(String[] args) {
        int x = 10;
        String y = "20";
        String z = x + y;
        System.out.println(z); // menggabungkan string dengan integer
    }
}

// String special characters
class SpecialChars {
    public static void main(String[] args) {
        String txt = "Hello \"World\""; // menggunakan backslash untuk menghindari karakter khusus
        String txt2 = "It\'s a beautiful day"; // menggunakan backslash untuk menghindari karakter khusus
        System.out.println(txt2); // hasilnya akan It's a beautiful day
        System.out.println(txt); // hasilnya akan Hello "World"
    }
}

/* Java Special Characters
 * \n	New Line	
 * \r	Carriage Return	
 * \t	Tab	
 * \b	Backspace	
 * \f	Form Feed	
 * \'	Single Quote    
 * \"	Double Quote
*/

// contoh penggunaan escape character
class EscapeCharacter {
    public static void main(String[] args) {
        String txt = "Hello\nGuys"; // \n untuk new line
        String txt2 = "Hello\tGuys"; // \t untuk tab
        String txt3 = "Helloo\bGuys"; // \b untuk backspace
        String txt4 = "Hello\fGuys"; // \f untuk form feed
        String txt5 = "Hello\'Guys"; // \' untuk single quote
        String txt6 = "Hello\"Guys\""; // \" untuk double quote
        System.out.println(txt); // hasilnya akan Hello di baris baru Guys
        System.out.println(txt2); // hasilnya akan Hello di tab Guys
        System.out.println(txt3); // hasilnya akan Hello Guys (backspace)
        System.out.println(txt4); // hasilnya akan Hello Guys (form feed)
        System.out.println(txt5); // hasilnya akan Hello'Guys
        System.out.println(txt6); // hasilnya akan Hello"Guys"
    }
}

// Java Math Class
// contoh (x,y)
 class MathClassExample {
  public static void main(String[] args) {
    System.out.println(Math.max(5, 10));  // yang ke print adalah 10 karena itu adalah nilai maksimum
    System.out.println(Math.min(10, 11));
    System.out.println(Math.sqrt(625)); // mencari akar kuadrat dari 625
    System.out.println(Math.abs(-5.5)); // mencari nilai absolut dari -5.5
    System.out.println(Math.random()); // menghasilkan angka random antara 0.0 dan 1.0
    int randomNum = (int)(Math.random() * 200); // menghasilkan angka random antara 0 dan 200
    System.out.println(randomNum); // menampilkan angka random antara 0 dan 200
  }
}

// boolean expression
class Booleanexamples {
    public static void main(String[] args) {
        boolean javaSeru = true;
        boolean belajarJava = false;
        System.out.println("Apakah belajar Java itu seru? " + javaSeru);
        System.out.println("Apakah belajar Java itu sulit? " + belajarJava);

        int myAge = 18;
        int votingAge = 17;

        if (myAge >= votingAge) {
            System.out.println("udah cukup umur untuk voting");
        } else {
            System.out.println("belum cukup umur untuk voting"); // output akan udah cukup umur karena myAge 18 lebih besar dari votingAge 17
        }
    }
}

// sekarang java if...else statement
class ifelse {
    public static void main(String[] args) {
        int x = 12;
        if (x >= 10) {
            System.out.println("x lebih besar dari 10"); // output akan x lebih besar dari 10 karena x 12 lebih besar dari 10
        }
    }
}

// contoh penggunaan if...else statement
class ifelse2 {
    public static void main(String[] args) {
        int time = 20; // waktu dalam jam
        if (time < 10) {
            System.out.println("selamat pagi");
        } else if (time < 20) { // else if digunakan untuk kondisi lain jika kondisi sebelumnya tidak terpenuhi
            System.out.println("selamat siang"); 
        } else { // else digunakan jika semua kondisi salah
            System.out.println("selamat malam"); // output akan selamat malam karena time 20 lebih besar dari 10
        }
    }
}

// shorthand if else statement dimana kita menggunakan tanda tanya (?) dan titik dua (:) untuk menyingkat if else statement
class shorthand {
    public static void main(String[] args) {
        int x = 10;
        String result = (x > 5) ? "x lebih besar dari 5" : "x lebih kecil dari 5"; // : digunakan seperti else
        System.out.println(result); // output akan x lebih besar dari 5 karena x 10 lebih besar dari 5
    }
}

// contoh di mana kita mencari apakah angka tersebut genap atau ganjil
class genapganjil {
    public static void main(String[] args) {
        int angka = 10;
        if (angka % 2 == 0) {
            System.out.println("angka tersebut adalah genap");
        } else {
            System.out.println("angka tersebut ganjil"); // output akan angka tersebut genap karena 10 % 2 == 0
        }
    }
}

        // contoh lain -> yaitu mencari positif atau negatif
        class PositifNegatif {
    public static void main(String[] args) {
        int angka2 = -238;
        if (angka2 > 0) {
            System.out.println("angka tersebut adalah positif");
        } else if (angka2 < 0) {
            System.out.println("angka tersebut adalah negatif");
        } else {
            System.out.println("angka itu adalah nol"); // output akan angka tersebut adalah negatif karena angka2 -238 lebih kecil dari 0
        }
    }
}

// belajar switch case
class Switchexample {
    public static void main(String[] args) {
        int day = 5; // hari dalam angka
        switch (day) { // switch case digunakan untuk memilih salah satu dari beberapa pilihan
            case 1:
            System.out.println("Senin");
            break; // break digunakan untuk keluar dari switch case -> kalau tidak ada break, maka akan terus menjalankan case berikutnya
            case 3:
            System.out.println("Rabu");
            break;
            case 5:
            System.out.println("Hari Jumat"); // output akan Jumat karena day 5
            break;
        }
    }
}

// belajar while loop
class WhileLoopExample {
  public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }  
  }
}

// belajar do while loop
class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("i adalah " + i);
            i++;
            }
        while (i < 0); // do while loop akan menjalankan kode di dalamnya setidaknya sekali, meskipun kondisi tidak terpenuhi
        // output akan i adalah 0 karena do while loop akan menjalankan kode di dalamnya
    }
}

// contoh melempar dadu dengan random

class Dadu {
    public static void main(String[] args) {
        Random rand = new Random(); // membuat objek random untuk menghasilkan angka acak
        int dadu = 0;
        
        while (dadu != 6) {
            dadu = rand.nextInt(6) + 1; // menghasilkan angka acak antara 1 dan 6
            // nextInt(6) menghasilkan angka antara 0 dan 5, jadi kita tambahkan 1 untuk mendapatkan angka antara 1 dan 6
            if (dadu < 6) { // jika dadu tidak 6, maka akan mencetak lempar dadu dan mencoba lagi
                System.out.println("Lempar dadu: " + dadu + ", coba lagi!"); // jika dadu tidak 6, maka akan mencetak lempar dadu dan mencoba lagi
            }
            else {
                System.out.println("Lempar dadu: " + dadu + ", kamu menang!"); // jika dadu 6, maka akan mencetak lempar dadu dan kamu menang
            }
        }
    }
}       

// contoh for loop
class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) { // for loop digunakan untuk mengulang kode sebanyak yang ditentukan
            System.out.println("Angka: " + i); // output akan angka 1 sampai 5
        }
    }
}

// nestedloop
// nested loop adalah loop di dalam loop
class Main {
  public static void main(String[] args) {
    // Outer loop.
    for (int i = 1; i <= 2; i++) { 
      System.out.println("Outer: " + i); // Executes 2 times
      
      // Inner loop 
      for (int j = 1; j <= 3; j++) { // inner loop akan berjalan 3 kali untuk setiap iterasi outer loop
        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
      }
    } 
  }
}

// contoh multipliation table dengan nested loop
class MultiplicationTable {
  public static void main(String[] args) {
    for (int i = 1; i <= 3; i++) { // outer di eksekusi 1 kali dulu baru inner di selesaikan. jadi selalu outer dulu baru inner
      for (int j = 1; j <= 3; j++) {
        System.out.print(i * j + " ");
      }
        System.out.println(); // untuk membuat baris baru setelah inner loop selesai
    }
  }
}

// bikin star pattern dengan nested loop
class ContohStar {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // print bintang tanpa newline
            }
            System.out.println(); // print newline setelah inner loop selesai
        }
    }
}

// contoh lagi nested loop
class NestedLoopContoh {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

// for each loop
class ForEachLoopExample {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // array of string
        for (String i : cars) { // for each loop digunakan untuk mengulang array
            System.out.println(i); // output akan Volvo, BMW, Ford, Mazda
        }
    }
}

// belajar break and continue
class Eek {
    public static void main(String[] args) {
        for (int i = 0; i<=5; i++) {
            if (i == 2) {
                continue; // continue digunakan untuk melewati iterasi tertentu
            }
            if (i == 4) {
                break; // break digunakan untuk menghentikan loop
            }
            System.out.println(i);
        }
    }
}

