package com.ngocvm.example.spring.ch1.book.data;

public class Title {
    private String titleValue;

    public Title() {}

    public Title(String titleValue) {
        this.titleValue = titleValue;
    }

    public String getTitleValue() {
        return titleValue;
    }

    public void setTitleValue(String titleValue) {
        this.titleValue = titleValue;
    }
}
