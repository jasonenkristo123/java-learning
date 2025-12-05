
import java.util.ArrayList;
import java.util.Arrays;

public class perpustakaanAPP {
    public static void main(String[] args) {
        Library library = new Library("Perpus Filkom");
        Category teknologi = new Category("Teknologi");

        teknologi.addBook(new Book("Clean Code", Arrays.asList("Robert C. Martin")));
        teknologi.addBook(new Book("Introduction to Algorithms", Arrays.asList("Cormen", "Leiserson", "Rivest")));
        teknologi.addBook(new Book("AI: A Modern Approach", Arrays.asList("Russell", "Norvig")));
        teknologi.addBook(new Book("Design Patterns", Arrays.asList("Gamma", "Helm", "Johnson")));
        teknologi.addBook(new Book("Computer Networks", Arrays.asList("Tanenbaum")));
        library.addCategory(teknologi);


    }
}
