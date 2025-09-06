package OOP;
// seperti method yang telah kita pelajari
// we created a static method, which means that it can be accessed without creating an object of the class, 
// unlike public, which can only be accessed by objects:

// example
public class ClassMethod {
    // Static Method
    static void myStaticMethod() { // karena dia static dia bisa langsung dipanggil
        System.out.println("Static methods can be called without creating objects");
    }

public void myPublicMethod() { // tidak static sehingga kalau mau dipanggil harus buat object baru
    System.out.println("Public methods must be called by creating objects");
    }

public static void main(String[] args) {
    myStaticMethod(); // call the static method -> langsung panggil karena static 

// myPublicMethod(); This would compile an error
        ClassMethod myObj = new ClassMethod(); // create object of ClassMethod -> harus buat object dulu
        myObj.myPublicMethod(); // call the public method -> memanggil untuk di print
    }
}


