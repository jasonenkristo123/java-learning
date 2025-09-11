package OOP;

// In Java, it is possible to inherit attributes and methods from one class to another. 
// We group the "inheritance concept" into two categories:
// subclass (child) - the class that inherits from another class
// superclass (parent) - the class being inherited from
// To inherit from a class, use the extends keyword.

class Inheritance {
    protected String brand = "Nike";
    public void shoe() {
        System.out.println("keren bet sepatu gw");
    }
}

class sepatu extends Inheritance {
    private String namaSepatu = "Air force";
    public static void main(String[] args) {
        sepatu obj = new sepatu();
        obj.shoe(); // memanggil print di method shoe
        System.out.println(obj.brand + " " + obj.namaSepatu); // manggil yag ada di atas
    }
}

/*
 * Did you notice the protected modifier in Vehicle?

We set the brand attribute in Vehicle to a protected access modifier. 
If it was set to private, the Car class would not be able to access it.
Why And When To Use "Inheritance"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
Tip: Also take a look at the next chapter, Polymorphism, which uses inherited methods to perform different tasks.
 */

 // kalau tidak mau class lain di inherit dari sebuah class, pakai final
 final class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Main extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Main myFastCar = new Main();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
