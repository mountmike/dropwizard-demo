package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class Saying {
    private long id;

    private String content;

    private LocalDateTime createdAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @SuppressWarnings("unused")
    public Saying() {
        // Jackson deserialization
    }

    public Saying(long id, String content, LocalDateTime createdAt) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Saying{" + "id=" + id + ", content='" + content + '\'' + '}';
    }
}
