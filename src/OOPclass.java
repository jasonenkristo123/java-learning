// * object-oriented programming is about creating objects that contain both data and methods.
// * OOP is faster and easier to execute
// * OOP provides a clear structure for the programs
// * OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
// * OOP makes it possible to create full reusable applications with less code and shorter development time
// * The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.

// * contohnya yaitu class itu fruit objectnya ada apple, orange, mango
// * So, a class is a template for objects, and an object is an instance of a class.
// *When the individual objects are created, they inherit all the variables and methods from the class.

public class OOPclass { // * terdapat class yaitu OOPclass
    int x = 5;
}

// * object itu di buat dari class dan menggunakan "new" contohnya
class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x); // * outpiut akan 5
    }
}