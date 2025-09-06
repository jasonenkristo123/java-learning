package OOP;
// seperti method yang telah kita pelajari
// we created a static method, which means that it can be accessed without creating an object of the class, 
// unlike public, which can only be accessed by objects:

// example
public class ClassMethod {
    // Static Method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
    }

public static void main(String[] args) {
    myStaticMethod(); // call the static method  

// myPublicMethod(); This would compile an error
        ClassMethod myObj = new ClassMethod();
        myObj.myPublicMethod();
    }
}