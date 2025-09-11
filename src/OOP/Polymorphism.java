package OOP;
class Polymorphism {
}
/*
 * Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. 
Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
For example, think of a superclass called Animal that has a method called animalSound(). 
Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):
 */
// contoh kita mau buat superclass yang isinya animal yang ada method animal sound yang didalamnya ada animal sound

class Animal {
    public void animalSound() {
        System.out.println("the animal makes a sound");
    }
}

class pig extends Animal {
    public void animalSound() {
        System.out.println("the pig says oink oink auuu");
    }
}

class dog extends Animal {
    public void animalSound() {
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