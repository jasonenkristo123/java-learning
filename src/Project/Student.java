package Project;

/*
 * Class Student
 * Tujuan: menampung data 1 mahasiswa (nama + nilai) dengan prinsip encapsulation.
 * Catatan singkat sebelum baca kode:
 * - Encapsulation = menyembunyikan data (field) agar hanya bisa diakses lewat method (getter/setter).
 * - Constructor = method khusus untuk membuat object baru dan inisialisasi field.
 * - toString() = method yang dipanggil ketika object dicetak (System.out.println(object)).
 * - Kita menggunakan tipe primitif double untuk nilai (grade) supaya bisa menampung desimal.
 */

public class Student {
    private String name; // field untuk nama mahasiswa
    private double grade; // field untuk nilai mahasiswa

    public Student(String name, double grade) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("nama tidak boleh kosong");
        }

        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("nilai harus diantara 0 sampai 100");
        }
        
        this.name = name.trim(); // inisialisasi nama
        this.grade = grade; // inisialisasi nilai
        }
    // getter method
        /*
        * Mengembalikan nama mahasiswa.
        * Kita tidak memberikan setter (untuk contoh ini) agar object bersifat "immutable" secara sebagian.
        * Kalau butuh ubah nama/grade nanti, kita bisa tambahkan setter dengan validasi.
        */
    public String getName() {
        return name;
    }
    public Double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " - " + grade;
    }

    public String getLetterGrade() {
        if (grade >= 80) return "A";
        if (grade >= 70) return "B";
        if (grade >= 50) return "C";
        if (grade >= 20) return "D";
        return "E";
    }
}


