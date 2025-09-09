package OOP;

// kita sudah tau dengan "PUBLIC" keyword
// The public keyword is an access modifier, 
// meaning that it is used to set the access level for classes, attributes, methods and constructors.

// modifier dibagi menjadi 2 yaitu 
// Access Modifiers - controls the access level
// Non-Access Modifiers - do not control access level, but provides other functionality

// public = The class is accessible by any other class
// default / class = The class is only accessible by classes in the same package. This is used when you don't specify a modifier
/*
 * For attributes, methods and constructors, you can use the one of the following:
 * public= The code is accessible for all classes
 * private= The code is only accessible within the declared class
 * default=The code is only accessible in the same package. This is used when you don't specify a modifier. 
 * protected= The code is accessible in the same package and subclasses
 */

 // contoh antara public vs private

class person {
    public String nama = "Jason";
    private int umur = 19; // hanya bisa di akses di class ini saja
}

 public class Modifier {
    public static void main(String[] args) {
        person Obj = new person();
        System.out.println(Obj.nama); // tidak akan error karena public
        System.out.println(Obj.umur); // eror karena private
    }
}

// sekarang non-access modifier
// Non-access modifiers do not control visibility (like public or private), but instead add other features to classes, methods, and attributes.
// The most commonly used non-access modifiers are final, static, and abstract.

// contoh final = untuk menetapkan suatu value yang tidak bisa diubah ubahg
class finalEx {
    final int x = 10;
    final double PI = 3.14;
    final int y = 100;

    public static void main(String[] args) {
        finalEx Obj = new finalEx();
        Obj.x = 20; // eror karena variabel final dan tidak bisa diubah
        Obj.PI = 40; // eror juga
        System.out.println(Obj.y);
    }
}

// sekarang static 
// A static method means that it can be accessed without creating an object of the class, unlike public:
class staticEx {
    static void myStatic() {
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublic() {
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args) {
        myStatic(); // tidak usah buat object bisa di panggil

        staticEx Obj = new staticEx ();
        Obj.myPublic(); // harus dipanggil lewat objek

    }
}