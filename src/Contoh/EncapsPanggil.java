package Contoh;

// public class EncapsPanggil {
    // public static void main(String[] args) {
    //    Encaps Obj = new Encaps();
    //    Obj.name = "jason";
    //    System.out.println(Obj.name); // kalau variable name private akan eror karena kita panggil di class lain
        // maka dari itu perlu menggunakan setname dan get name
   //  }
// }

// contoh cara memanggil private variable
public class EncapsPanggil {
    public static void main(String[] args) {
        Encaps Obj = new Encaps();
        Obj.setName("Jason"); // set name untuk set value
        System.out.println(Obj.getName()); // untuk return value tersebut
    }
}
