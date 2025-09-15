package Project;

public class Task {
    private String description; // isi tugasnya
    private boolean completed; // udah selesai atau belum

    public Task(String description) {
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("tugas belum ada");
        }
        this.description = description.trim();
        this.completed = false; // default kalau belum selesai
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }
    @Override
    public String toString() {
        return (completed ? "[X]" : "[ ] ") + description;
    }
}
