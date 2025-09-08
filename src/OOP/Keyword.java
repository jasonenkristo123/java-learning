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

    public thisLearn(String namaMotor) {
        this(2020, namaMotor);
    }
    public thisLearn(int tahunModel, String namaMotor){
        this.tahunModel = tahunModel;
        this.namaMotor = namaMotor;
    }

    public void printInfo() {
        System.out.println(tahunModel + " " + namaMotor);
    }
    public static void main(String[] args) {
        thisLearn Obj1 = new thisLearn("CBR");
        thisLearn Obj2 = new thisLearn(2025, "Ninja");

        Obj1.printInfo();
        Obj2.printInfo();
    }
}