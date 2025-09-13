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