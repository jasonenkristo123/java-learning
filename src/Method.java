// belajar java method
/*
*A method is a block of code which only runs when it is called.
*You can pass data, known as parameters, into a method.
*Methods are used to perform certain actions, and they are also known as functions.
*Why use methods? To reuse code: define the code once, and use it many times.
 */

public class Method {
    static void myMethod() {
    }
}
/*
 * myMethod() is the name of the method
* static means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
* void means that this method does not have a return value. You will learn more about return values later in this chapter
 */

// contoh 

class Method1 {
    static void myMethod() {
        System.out.println("Aku ke execute");
    }
    public static void main(String[] args) {
        myMethod();
        myMethod(); 
        myMethod(); // sehingga ke print 3 kali karena myMethod menggantikan println
    }
}

// Method Parameter adalah variable atau string di dalam method tersebut
class Method2 {
    static void myMethod(String nama) { // ini untuk membuat variable nama string
        System.out.println(nama + " Enkristo"); // untuk outputnya nanti seperti apa
    }
        public static void main(String[] args) {
            myMethod("Jason"); // maksutnya adalah isi variablenya adalah ini
            myMethod("Aldo"); // isi variable
    }
}

// bisa juga kalau multiparameter
class Method3 {
    static void myMethod(String nama, int umur) {
        System.out.println("nama aku adalah " + nama + " umur aku " + umur + " Tahun");
    }
    public static void main(String[] args) {
        myMethod("Jason", 18);
        myMethod("Steven", 20);
    }
}

// sekarang menggunakan if else
class Method4 {
    static void checkAge(int umur) { // checkAge adalah method tapi kita namakan lain hal
        if (umur >= 18) {
            System.out.println("kamu sudah cukup umur sana masuk");

        } else {
            System.out.println("kamu belum cukup umur tunggu sampe 18 ya");
        }

    }
        public static void main(String[] args) {
            checkAge(17);
    }
}

// sekarang yaitu return value, return menggantikan void agar method tersebut return some value
class Method5 {
    static int myMethod(int x) { // deklarasi bahwa methodnya mempunyai nilai x
        return 10 * x; // kondisi yang akan di output kan atau instruksi
    }
    public static void main(String[] args) {
        System.out.println(myMethod(5)); // akan mengeprint method instruksi tadi dengan ketentuan yaitu x nya 5 sehingga hasil 50 -> 10x5
    }
}

// contoh parameter
// misal buat 2 variable yang akan dijumlahkan
class Method6 {
    static int myMethod(int x, int y, int z) { // mendeklarasi 3 variable int yaitu x y z
        return x * z + y; // instruksi yang akan di print
    }
    public static void main(String[] args) {
        int z = myMethod(3, 5, 10);
        System.out.println(z); // memasukkan nilai variable yaitu x = 3, y = 5 z = 10
    }
}

// contoh seru pakai loop 
class Method7 {
    static int myMethod(int x) {
        return x * 3;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("jika dikalikan 3 dari " + i + " adalah = " + myMethod(i));
        }
    }
}

// method overloading
static int myMethod1(int x, int y) {
    return x + y;
}

static double myMethod2(double x, double y) {
    return x * y;
}

public static void main(String[] args) {
int num1 = myMethod1(10, 30);
double num2 = myMethod2(2.3, 4.2);
System.out.println(num1);
System.out.println(num2);
}

// scope method 
/*
 * A block of code refers to all of the code between curly braces { }.
 * Variables declared inside a block of code are only accessible by the code between the curly braces, and only after the line in which the variable was declared:
 */

  class Main2 {
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

  // Code here CANNOT use x
  
  }
}

// Loop Scope 
class Main4 {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      System.out.println(i); // i is accessible here
    }

    // i is NOT accessible here
  }
}

// Why this matters?
/*
 * Loop variables are not available outside the loop.
 * You can safely reuse the same variable name (i, j, etc.) in different loops in the same method:
 */
// example
class Nenek1 { // terjadi 2 loop berbeda
  public static void main(String[] args) {

    for (int i = 0; i < 3; i++) {
      System.out.println("Loop 1: " + i);
    }

    for (int i = 0; i < 2; i++) {
      System.out.println("Loop 2: " + i);
    }
  }
}

// *class scope 
// *Variables declared inside a class but outside any method have class scope (also called fields). These variables can be accessed by all methods in the class:

class Ngawur1 {
    int x = 6; // *class variable
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}