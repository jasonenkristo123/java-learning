package OOP;

// The this keyword in Java refers to the current object in a method or constructor.
//The this keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.
// Sometimes a constructor or method has a parameter with the same name as a class variable.
// When this happens, the parameter temporarily hides the class variable inside that method or constructor.
// contohnya
public class Keyword {
    int x; // variable
    int y;

    public Keyword(int x, int y) {
        this.x = x; // supaya tidak membingungkan
        this.y = y;
    }

    public static void main(String[] args) {
        Keyword Obj = new Keyword(10, 20);
        System.out.println(Obj.x * Obj.y);
    }
}

// memanggil constructor dari constructor lain
// You can also use this() to call another constructor in the same class.
// This is useful when you want to provide default values or reuse initialization code instead of repeating it.

class thisLearn {
    int tahunModel;
    String namaMotor;
    // constructor dengan 1 parameter
    public thisLearn(String namaMotor) {
        this(2020, namaMotor);
    }
    // constructor dengan 2 parameter
    public thisLearn(int tahunModel, String namaMotor){
        this.tahunModel = tahunModel;
        this.namaMotor = namaMotor;
    }
    // method buat print
    public void printInfo() {
        System.out.println(tahunModel + " " + namaMotor);
    }
    public static void main(String[] args) {
        thisLearn Obj1 = new thisLearn("CBR"); // ini cuma beri nama karena tahun model di atas sudah di tentukan
        thisLearn Obj2 = new thisLearn(2025, "Ninja"); // ini memasukan 2 value soalnya belum ada value di atas

        Obj1.printInfo(); // print obj 1
        Obj2.printInfo(); // print obj 2
    }
}

// The call to this() must be the first statement inside the constructor.
// kapan harus menggunakan ini?
// When a constructor or method has a parameter with the same name as a class variable, use this to update the class variable correctly.
// To call another constructor in the same class and reuse code.