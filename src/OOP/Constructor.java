package OOP;

// A constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created.
// It can be used to set initial values for object attributes:

// contoh, (constructor tidak bisa mengembalikan nilai)
public class Constructor {
    int x;


public Constructor() {
    x = 10;
}

public static void main(String[] args) {
    Constructor Obj = new Constructor();
    System.out.println(Obj.x);
    
    }
}

