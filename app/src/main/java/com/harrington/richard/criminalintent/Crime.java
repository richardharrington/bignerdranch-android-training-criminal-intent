package com.harrington.richard.criminalintent;

import java.util.UUID;

public class Crime {
    private UUID id;
    private String title;

    public Crime() {
        id = UUID.randomUUID();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}
