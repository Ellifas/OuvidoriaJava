package entities;

import java.time.LocalDateTime;

public class Complaint extends Occurrence{

    private Long id;
    private String title;
    private String description;

    public Complaint(Long userId, Long id, String title, String description) {
        super(userId);
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Complaint(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Complaint() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
