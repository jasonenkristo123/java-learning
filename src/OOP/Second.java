package OOP;
class Second {
    public static void main(String[] args) {
        MultiClass myObj = new MultiClass(100, 200); // manggil class Multiclass dan memasukkan value nya
        System.out.println(MultiClass.Perkalian(myObj.x, myObj.y)); // print hasil darri instruksi yang di class multiclass metode perkalian
    }
}

