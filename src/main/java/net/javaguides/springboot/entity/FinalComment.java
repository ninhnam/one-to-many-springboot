package net.javaguides.springboot.entity;

import javax.persistence.Column;

public class FinalComment {

    private long post_id;

    private String title;

    private String description;

    private long id_comment;

    private String text;

    public long getPost_id() {
        return post_id;
    }

    public void setPost_id(long post_id) {
        this.post_id = post_id;
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

    public long getId_comment() {
        return id_comment;
    }

    public void setId_comment(long id_comment) {
        this.id_comment = id_comment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
