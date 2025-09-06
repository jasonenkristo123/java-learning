package OOP;

public class Atribut {
    int x = 10; // atribut x, jika tidak ingin diganti value nya diberi final -> final int x = 10;

    public static void main(String[] args) {
        Atribut myObj = new Atribut();
        myObj.x = 30; // nilai x menjadi 30
        System.out.println(myObj.x);
    }
}

// multiple object
class Object2 {
    int x = 10;

    public static void main(String[] args) {
        Object2 myObj10 = new Object2();
        Object2 myObj11 = new Object2();
        myObj11.x = 30;
        System.out.println(myObj10.x);
        System.out.println(myObj11.x);
    }
}

// multiple atribute
class Object3 {
    String firstName = "Jason";
    String secondName = "Enkristo";
    int umur = 18;

    public static void main(String[] args) {
        Object3 myObj = new Object3();
        System.out.println("nama panjang saya adalah " + myObj.firstName + " " + myObj.secondName + ", saya umur " + myObj.umur);
    }
}

