package com.example.api.controller.exceptions;

import java.time.LocalDateTime;

public class StandardError {


    public StandardError() {

    }

    public StandardError(LocalDateTime timestamp, Integer status, String error, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String path;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getPath() {
        return path;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
