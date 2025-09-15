package Project;

public class TeskManagerTest {
    public static void main(String[] args) {
        TaskManager task = new TaskManager();
        
        // menambah beberapa tugas
        task.addTask("belajar coding");
        task.addTask("olahraga");
        task.addTask("kerjain tugas");

        // lihat daftar tugas
        System.out.println("Daftar tugas: ");
        task.listTask();
        
        // tandai tugas yang selesai
        task.markTaskCompleted(1);
        task.markTaskCompleted(2);

        task.listTask();

        // misal hapus tugas ke 3
        task.removeTask(3);
        task.listTask();

        task.markTaskCompleted(10);
    }
}
