package Projects;


public class BookManagerTest {
    public static void main(String[] args) {
        BookManager manager = new BookManager();

        manager.addBook("Clean code", "John Lennon", 2007);
        manager.addBook("Effective Java", "Robert C. Martin", 1902);
        manager.addBook("Design Patterns", "Joshua Bloch", 1625);
        manager.addBook("Data Structure", "Elon Musk", 2024);
        manager.addBook("How to become successful like Jason Enkristo", "Jason Tatum", 2006);

        System.out.println("Daftar buku: ");
        manager.bookList();

        manager.bookSearch("Java");
    }
}
