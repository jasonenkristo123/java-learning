package Contoh;

public class ConstructorExample {
    int tahunBuat;
    String namaMobil;
    int kecepatan;

    public ConstructorExample(int year, String name, int speed) {
        tahunBuat = year;
        namaMobil = name;
        kecepatan = speed;
    }
    public static void main(String[] args) {
        ConstructorExample Obj = new ConstructorExample(1998, "Mazda" , 200);
        System.out.println("mobil tahun " + Obj.tahunBuat + " yaitu " + Obj.namaMobil + " dengan kecepatan maksimal " + Obj.kecepatan);
    }
}
