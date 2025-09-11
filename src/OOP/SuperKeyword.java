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

// You can also use super to access an attribute from the parent class if they have an attribute with the same name:

class Animal1 {
    String type = "Animal"; // parent attribute
}

class cat extends Animal1 {
    String type = "dawg"; // sub class/child

    public void printType() {
        System.out.println(super.type); // acess parent attribute, karena super untuk parent class
        System.out.println(this.type); // akan output dawg karena this kusus untuk child class
    }
}

class keyword1 {
    public static void main(String[] args) {
        cat obj = new cat();
        obj.printType(); // akan manggil printType dan ke print Animal
    }
}

// call parent constructor
// Use super() to call the constructor of the parent class. This is especially useful for reusing initialization code.
class Animal2 {
    Animal2() {
        System.out.println("Animal is created");
    }
}
class doggy extends Animal2 {
    doggy() {
        super();
        System.out.println("Doggy is coming");
    }
}
class printInfo1 {
    public static void main(String[] args) {
        doggy obj = new doggy();
    }
}