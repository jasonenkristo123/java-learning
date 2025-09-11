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
