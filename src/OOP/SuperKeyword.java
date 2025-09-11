package OOP;
public class SuperKeyword {
}

/*
In Java, the super keyword is used to refer to the parent class of a subclass.
The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.
It can be used in two main ways:
To access attributes and methods from the parent class
To call the parent class constructor
 */

 // kita gunakan contoh seperti di polymorphism yang memiliki nama method yang sama

class Animal {
    public void animalSound() {
        System.out.println("the animal makes a sound");
    }
}
class pig extends Animal {
    public void animalsound() {
        super.animalSound(); 
            System.out.println("the pig says oink oink auuu");
    }
}
class dog extends Animal {
    public void animalSound() {
        super.animalSound(); 
            System.out.println("the dog is barking augh augh augh rawrr");
    }
}
class printInfo {
    public static void main(String[] args) {
        Animal obj = new Animal(); // create animal object
        Animal objpig = new pig(); // create pig object
        Animal objdog = new dog(); // create dog object
        obj.animalSound();
        objpig.animalSound();
        objdog.animalSound();
    }
}