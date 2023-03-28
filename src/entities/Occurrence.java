package entities;

import java.time.LocalDateTime;

public class Occurrence {
    private Long userId;
    private final LocalDateTime localDateTime = LocalDateTime.now();

    public Occurrence(Long userId) {
        this.userId = userId;
    }

    public Occurrence() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    @Override
    public String toString() {
        return "Occurrence{" +
                "userId=" + userId +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
