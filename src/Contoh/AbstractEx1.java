package OOP;

// An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:
abstract class AbstractEx1 {
    public String nama = "Toji";
    int umur = 30;
    public abstract void person(); // abstract method
}

// subclass (inherit from abstractex1)
class Student extends AbstractEx1 {
    public int graduationYear = 2000;
    public void person() {
        System.out.println("Studying all day long");
    }
}
// lanjut ke abstract panggil
