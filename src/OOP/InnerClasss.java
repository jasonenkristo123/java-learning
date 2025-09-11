package OOP;
public class InnerClasss {
}

/*
 * In Java, it is also possible to nest classes (a class within a class). 
 * The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
 */

class outerClass {
    int x = 10;

    class innerClass {
        int y = 5;
    }
}

class printInfo2 {
    public static void main(String[] args) {
        outerClass outer = new outerClass();
        outerClass.innerClass inner = outer.new innerClass();
        System.out.println(outer.x + inner.y);
    }
}

// private inner class
// Unlike a "regular" class, an inner class can be private or protected. 
// If you don't want outside objects to access the inner class, declare the class as private:

class outerClass1 {
    int x = 10;

    private class innerClass1 {
        int y = 100;
    }
}

class printInfo3 {
    public static void main(String[] args) {
        outerClass1 myOuter = new outerClass1();
        outerClass1.innerClass1 myInner = myOuter.new innerClass1(); // akan eror karena classnya di private
    }
}

// static inner class
// An inner class can also be static, which means that you can access it without creating an object of the outer class:
class outerClass2 {
    int x = 100;

    static class innerClass2 {
        int y = 200;
    }
}

class printInfo4 {
    public static void main(String[] args) {
        outerClass2.innerClass2 myInner = new outerClass2.innerClass2();
        System.out.println(myInner.y);
    }
}