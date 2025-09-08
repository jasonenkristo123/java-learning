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
