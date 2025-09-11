package OOP;

// The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
// declare class variables/attributes as private
// provide public "get and set" methods to access and update the value of a private variable

// You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). 
// However, it is possible to access them if we provide public get and set methods.
// The get method returns the variable value, and the set method sets the value.

public class Encapsulation {
    private String name; // private string

    // Getter - return the value
    public String getName() { // The get method returns the value of the variable name.
        return name;
    }
    // set the value
    public void setName(String newName) { //The set method takes a parameter (newName) and assigns it to the name variable. 
        this.name = newName; // The this keyword is used to refer to the current object.
    } // However, as the name variable is declared as private, we cannot access it from outside this class:
}

// kenapa harus pakai encapsulation?
/*
 * Better control of class attributes and methods
 * Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
 * Flexible: the programmer can change one part of the code without affecting other parts
 * Increased security of data
 */