package Project;
import java.util.ArrayList;

/*
 * StudentManager bertugas untuk menyimpan dan mengelola daftar mahasiswa.
 * - Bisa menambah mahasiswa baru
 * - Bisa menampilkan semua mahasiswa
 * - Bisa mencari mahasiswa berdasarkan nama
 * - Bisa menghitung rata-rata nilai mahasiswa
 */

public class StudentManager {
    // Menyimpan banyak Student dalam sebuah list
    private ArrayList<Student> students;

    public StudentManager() {
         // Konstruktor: saat object StudentManager dibuat, siapkan ArrayList kosong
        students = new ArrayList<>();
    }

    // Method untuk menambah mahasiswa
    public void addStudent (Student s) {
        if (s == null) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        students.add(s); // menambah ke list students
    }
    // Method untuk menampilkan semua mahasiswa
    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("belum ada mahasiswa yang terdaftar");
            return;
        }
        
        for (Student s : students) {
            // s.toString() otomatis dipanggil → misal "Budi - 85.0"
            System.out.println(s + " - grade: " + s.getLetterGrade());
        }
    }
    // Method untuk mencari mahasiswa berdasarkan nama
    public Student findStudent(String name) {
        for (Student s : students) { // looping semua student 
            if (s.getName().equalsIgnoreCase(name)) {
                return s; // jika ketemu, kembalikan student
            }
        }
        return null; // kalau tidak ada, return null
    }

    // Method untuk menghitung rata-rata nilai
    public double getAverageGrade() {
        if (students.isEmpty()) {
            return 0;
        }

        double total = 0;
        for (Student s : students) {
            total += s.getGrade();
        }
        return total / students.size();
    }
}
