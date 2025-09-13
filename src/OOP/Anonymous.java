package OOP;

/*
 * An anonymous class is a class without a name. It is created and used at the same time.
* You often use anonymous classes to override methods of an existing class or interface, without writing a separate class file.
* Here, we create an anonymous class that extends another class and overrides its method:
 */

class Binatang { // normal class
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        // anonymou class that override makesound()
        Binatang myAnimal = new Binatang() {
           
        public void makeSound() {
            System.out.println("woof woof woof");
           }
        }; // semicolon is required to end the line of code that creates the object

        myAnimal.makeSound();
    }
}

// anonymous class from interface
interface greeting {
    void sayHello();
}

class ngengok {
    public static void main(String[] args) {
        greeting greet = new greeting() {
            public void sayHello() {
                System.out.println("hello world");
            }
        };
        greet.sayHello();
    }
}