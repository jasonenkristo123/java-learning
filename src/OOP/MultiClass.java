package OOP;
// multi class in java
// You can also create an object of a class and access it in another class. 
//This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).

public class MultiClass {
    int x; // ini adalah atribut
    int y; // ini adalah atribut

    MultiClass(int x, int y) {
        this.x = x; // nilai parameter x (yang dikirim saat membuat objek) disimpan ke variabel instance x.
        this.y = y; // ------------------------------
    }
    static int Perkalian(int x, int y) {
        return x * y;
    }
}
