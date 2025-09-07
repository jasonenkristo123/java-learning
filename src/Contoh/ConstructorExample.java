package Contoh;

public class ConstructorExample {
    int tahunBuat; // buat atribut
    String namaMobil; // atribut 2
    int kecepatan; // atribut 3

    public ConstructorExample(int year, String name, int speed) {
        tahunBuat = year; // menambah nilai
        namaMobil = name; // menambah nilai
        kecepatan = speed; // menambah nilai
    }
    public static void main(String[] args) {
        ConstructorExample Obj = new ConstructorExample(1998, "Mazda" , 200); // memberikan nilai ke variabel
        System.out.println("mobil tahun " + Obj.tahunBuat + " yaitu " + Obj.namaMobil + " dengan kecepatan maksimal " + Obj.kecepatan); // print
    }
}

class Cons1 {
    int satu;
    int dua;
    int tiga;
    int empat;
    double lima;
    double enam;

    public Cons1(int angka1, int angka2, int angka3, int angka4, double angka5, double angka6) {
        satu = angka1;
        dua = angka2;
        tiga = angka3;
        empat = angka4;
        lima = angka5;
        enam = angka6;

    }
    public static void main(String[] args) {
        Cons1 Obj = new Cons1(20, 39, 23, 238, 29.233, 2383.238);
        System.out.println(Obj.satu * Obj.dua + Obj.tiga / Obj.empat + Obj.lima * Obj.enam);
    }
}