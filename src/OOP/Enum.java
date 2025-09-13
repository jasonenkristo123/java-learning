package OOP;

// An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
// To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. 
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