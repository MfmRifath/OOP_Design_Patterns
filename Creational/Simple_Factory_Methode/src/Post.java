import java.time.LocalDateTime;

public abstract class Post {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime creationOn;
    private LocalDateTime publishedOn;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreationOn() {
        return creationOn;
    }

    public void setCreationOn(LocalDateTime creationOn) {
        this.creationOn = creationOn;
    }

    public LocalDateTime getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(LocalDateTime publishedOn) {
        this.publishedOn = publishedOn;
    }
}
