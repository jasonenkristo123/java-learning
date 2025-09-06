package Contoh;
// contoh menggunakan public void dan public static void
public class LatihanMethod {
    public void throttle() {
        System.out.println("mobil ini kencang banget");
    }

    public void kecepatan(int maxSpeed) {
        System.out.println("kecepatannya sampai " + maxSpeed + " kilometer per jam");
    }

    public static void main(String[] args) {
        LatihanMethod myObj = new LatihanMethod();
        myObj.throttle();
        myObj.kecepatan(200);
    }
}
