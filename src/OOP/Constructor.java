package OOP;

// A constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created.
// It can be used to set initial values for object attributes:

// contoh, (constructor tidak bisa mengembalikan nilai)
public class Constructor {
    int x; // atribut awal


public Constructor() { 
    x = 10; // constructor membuat nilai
}

public static void main(String[] args) {
    Constructor Obj = new Constructor();
    System.out.println(Obj.x);

    }
}

// Note that the constructor name must match the class name, and it cannot have a return type (like void).
// Also note that the constructor is called when the object is created.
// All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. 
// However, then you are not able to set initial values for object attributes.

// sekarang constructor parameter

class Constructor1 { // seharusnya public class constructor1, cuman karena ada public class diatas
    int x;

    public Constructor1(int y) {
        x = y;
    }
    public static void main(String[] args) {
        Constructor1 Obj = new Constructor1(10);
        System.out.println(Obj.x);
    } 
}

