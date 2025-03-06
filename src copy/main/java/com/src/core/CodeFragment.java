package com.src.core;

import java.util.UUID;

public class CodeFragment {
    private final UUID id;
    private final String content;
    private boolean isCorrupted;

    public CodeFragment(String content) {
        this.id = UUID.randomUUID();
        this.content = content;
        this.isCorrupted = false;
    }

    public UUID getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public boolean isCorrupted() {
        return isCorrupted;
    }

    public void corrupt() {
        this.isCorrupted = true;
    }

    public void restore() {
        this.isCorrupted = false;
    }
}