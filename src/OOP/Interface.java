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
     // membuat ulang method yang sudah ada di parent class/interface
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
 