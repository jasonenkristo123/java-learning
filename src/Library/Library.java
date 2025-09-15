package Library;
// * berisi kumpulan buku aka perpus
import java.util.ArrayList;


public class Library {
    private String name; // * nama perpustakaan
    private ArrayList<Category> categories; // * daftar kategori

    public Library (String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("nama tidak boleh kosong");
        }
        this.name = name.trim();
        this.categories = new ArrayList<>();
    }
    // * tambah kategori
    public void addCategory(Category category) {
        categories.add(category);
    }
    // * tampilkan semua kategori
    public void listCategory() {
        if (categories.isEmpty()) {
            throw new IllegalArgumentException("belum ada category di " + name);
        }
        System.out.println("list kategori: ");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i).getName());
        }
    }
    // * ambil kategori berdasarkan nomor
    public Category getCategory (int index) {
        if (index < 1 || index > categories.size()) {
            throw new IllegalArgumentException("nomor kategori tidak valid");
        }
        return categories.get(index - 1);
    }
}
