package com.example.fessutival.schedule;

import android.os.Bundle;

public class Event {
    private String name; // 섹션 제목

    public Event(String title) {
        this.name = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}