package com.booleanuk.core;

public class TodoItem {
    private String title;
    private String detail;
    public String status;

    public TodoItem(String title, String detail, String status) {
        this.title = title;
        this.setDetail(detail);
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
