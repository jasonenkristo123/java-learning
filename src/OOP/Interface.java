package OOP;
public class Interface {
}
// Another way to achieve abstraction in Java, is with interfaces.
// An interface is a completely "abstract class" that is used to group related methods with empty bodies:

// example
// interface Animal {
//   public void animalSound(); // interface method (does not have a body)
//   public void run(); // interface method (does not have a body)
// }
/*
 * To access the interface methods, 
 * the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). 
 * The body of the interface method is provided by the "implement" class:
 */
// example
interface Animall {
    public void animalSound();
    public void sleep();
}
// pig implements the animal interface
class Dogs implements Animall {
    public void animalSound() { // body of animalSound provided here
        System.out.println("hahahahah goinkkkk");
    }
    @Override // membuat ulang method yang sudah ada di parent class/interface
    public void sleep() {
        System.out.println("brbbbbb zzzzz");
    }
}
class printInfo7 {
    public static void main(String[] args) {
        Dogs Obj = new Dogs();
        Obj.animalSound();
        Obj.sleep();
    }
}

/*
Like abstract classes, interfaces cannot be used to create objects
(in the example above, it is not possible to create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).
2  Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
However, it can be achieved with interfaces, because the class can implement multiple interfaces. 
Note: To implement multiple interfaces, separate them with a comma (see example below).
 */

 interface firstInterface {
    public void myMethod1();
 }

 interface secondInterface {
    public void myMethod2();
 }

 class demoClass implements firstInterface, secondInterface {
    public void myMethod1() {
        System.out.println("halo sayang");
    }
    public void myMethod2() {
        System.out.println("apa sayang");
    }
 }

 class printInfo8 {
    public static void main(String[] args) {
        demoClass obj = new demoClass();
        obj.myMethod1();
        obj.myMethod2();
    }
 }