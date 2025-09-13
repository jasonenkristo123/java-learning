package OOP;

// An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
// Note that they should be in uppercase letters:
enum Level {
    LOW,   // kayak array 
    MEDIUM,// kayak array 
    HIGH// kayak array 
}

public class Enum {
    public static void main(String[] args) {
        Level obj = Level.HIGH; // buat objek buat print
        System.out.println(obj);
    }
}

// enum bisa ada di class
class Enum1 {
    enum Level {
        Low,
        medium,
        high,
        veryhard
    }

    public static void main(String[] args) {
        Level obj = Level.veryhard;
        System.out.println(obj);
    }
}

// enum di switch 

enum Level1 {
    easy,
    medium,
    hard,
    impossible
}

class enum1 {
    public static void main(String[] args) {
        Level1 level = Level1.impossible;

        switch(level) {
            case easy:
                System.out.println("gampang banget");
            break;
            case medium:
                System.out.println("mayan susah si");
            break;
            case hard:
                System.out.println("susah ni dahan");
            break;
            case impossible:
                System.out.println("gabakal bisa si ini");
            break;
        }
    }
}

// Loop di enum
enum nama {
    jason,
    arfa,
    brian,
    hanif,
    habibi,
    qhalbi,
    rafi
}

class nama1 {
    public static void main(String[] args) {
        for (nama objNama : nama.values()) {
        System.out.println(objNama);
        }
    }
}

/*
*Difference between Enums and Classes
*An enum can, just like a class, have attributes and methods. 
*The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
*An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
* Why And When To Use Enums?
Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
 */

 // enum constructor
/*
 * An enum can also have a constructor just like a class.
* The constructor is called automatically when the constants are created. You cannot call it yourself.
* Here, each constant in the enum has a value (a string) that is set through the constructor:
 */

enum levels {
    // * enum constants ada deskripsi sendiri 
    LOW("guampang"),
    MEDIUM("lumayan susah"),
    HARD("Susah loh ini");

    private String description; // * // Field (variable) to store the description text

    private levels(String description){ //* Constructor (runs once for each constant above)
        this.description = description;
    }
    // * Getter method to read the description
    public String getDescription() {
        return description;
    }
}

class printInfo9 {
    public static void main(String[] args) {
        levels obj = levels.HARD; //* pick one enum constant
        System.out.println(obj.getDescription());
        // * kalau mau di loop
        for (levels objLevels : levels.values()) {
            System.out.println(objLevels + ":" + objLevels.getDescription());
        }
    }
}
