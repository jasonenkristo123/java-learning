package Project;
import java.util.ArrayList;

public class TaskManager {
    // menyimpan kumpulan task
    private ArrayList<Task> tasks;

    // Constructor → inisialisasi list kosong saat TaskManager dibuat
    public TaskManager() {
        tasks = new ArrayList<>();
    }
    // menambah task baru
    public void addTask(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("deskripsi tugas kosong");
        }
        tasks.add(new Task(description));// buat objek task baru lalu menyimpan deskripsi
    }

    // menampilkan semua task
    public void listTask() {
        if (tasks.isEmpty()) {
            System.out.println("belum ada tugas");
            return;
        }

        System.out.println("daftar tugas: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    // tandai task sesuai nomor
    public void markTaskCompleted(int index) {
        if (index < 1 || index > tasks.size()) {
            System.out.println("nomor tugas tidak valid");
            return;
        }   
        tasks.get(index - 1).markCompleted();
        System.out.println("Tugas ke- " + index + " selesai");
    }
        // hapus tasks berdasarkan nomor
        public void removeTask (int index) {
            if (index < 1 || index > tasks.size()) {
                System.out.println("nomor tugas tidak valid");
                return;
            }
            tasks.remove(index - 1);
            System.out.println("Tugas ke- " + index + " dihapus");
    }
}
