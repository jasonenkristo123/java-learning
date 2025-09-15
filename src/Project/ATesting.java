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

        System.out.println("nilai rata rata adalah " + manager.getAverageGrade());
    }
}
