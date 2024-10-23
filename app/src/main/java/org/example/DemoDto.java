package org.example;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class DemoDto {

    private String id;

    private String name;

    private LocalDateTime createdAt;

    private List<String> tags;

    private Map<String, Object> attributes;

    private boolean isActive;

    // Default constructor
    public DemoDto() {
    }

    // Parameterized constructor
    public DemoDto(String id, String name, LocalDateTime createdAt, List<String> tags, Map<String, Object> attributes, boolean isActive) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.tags = tags;
        this.attributes = attributes;
        this.isActive = isActive;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "DemoDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", tags=" + tags +
                ", attributes=" + attributes +
                ", isActive=" + isActive +
                '}';
    }
}
