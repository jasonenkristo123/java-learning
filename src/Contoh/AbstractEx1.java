package Contoh;

// An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:
abstract class AbstractEx1 { // kelas nya abstrak, boleh punya field, method, tapi tidak bisa dibuat objek
    public String nama = "Toji"; // field yang diwaris kan ke subclass
    int umur = 30; // field yang diwaris kan ke subclass

    // kontrak: setiap non-abstract subclass harus menyediakan implementasi method person().
    public abstract void person(); // abstract method - hanya tanda tangan - no body
}

// subclass (inherit from abstractex1)
class Student extends AbstractEx1 { // class tersebut di extend(mewarisi attribute di class abstractex1)
    public int graduationYear = 2000;
    public void person() { // implementasi dari abstract method study()
        System.out.println("Studying all day long");
    }
}
// lanjut ke abstract panggil
