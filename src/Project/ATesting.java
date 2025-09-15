package Project;

public class ATesting {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("Jason", 90));
        manager.addStudent(new Student("Brian", 60));
        manager.addStudent(new Student("Jason", 30));
        
        System.out.println("daftar mahasiswa");
        manager.printAllStudents(); 

        Student hasilcari = manager.findStudent("Jason");
        if (hasilcari != null) {
            System.out.println("Student ditemukan " + hasilcari);
        } else {
            System.out.println("tidak ditemukan");
        }

        System.out.println("nilai rata rata mahasiswa adalah " + manager.getAverageGrade());
    }
}

class testing1 {
    public static void main(String[] args) {
        Task task = new Task("Belajar java");
        Task task1 = new Task("Kerja math");

        System.out.println("daftar tugas awal");
        System.out.println(task);
        System.out.println(task1);

        task.markCompleted();
        task1.markCompleted();

        System.out.println("\nSetelah menandai satu selesai:");
        System.out.println(task);
        System.out.println(task1);

        
    }
}