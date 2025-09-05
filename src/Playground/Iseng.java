package Playground;

public class Iseng {
    public static void main(String[] args) {
    int x = 5;
    int y = 10;
        System.out.println(!(x > y)); // * ini outputnya bakal true
    }
}

class Latihan1 {
    public static void main(String[] args) {
        int nilai1 = 985;
        int nilai2 = 843;

        float rata = (float) nilai1 / nilai2 * 100;
        System.out.println("Jadi nilai rata rata adalah " + rata);
    }
}

class Latihan2 {
    public static void main(String[] args) {
        int z = 10;
        z++;
        System.out.println(z);
    }
}

class Latihan3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 29;

        if (x > y) {
            System.out.println("salah bos");
        } else if (x < y) {
            System.out.println("benerr");
        } else {
            System.out.println("x = 0");
        }
    }
}

class Latihan4 {
    public static void main(String[] args) {
        int x = 3;
        String result;
        result = (x < 5) ? "x kurang dari 5" : "x lebih besar dari 5";
        System.out.println(result);
    }
}
