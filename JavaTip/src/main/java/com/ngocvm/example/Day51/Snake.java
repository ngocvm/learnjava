package com.ngocvm.example.Day51;

public class Snake extends AbstractAnimal{
    public void crawl() {
        System.out.println("Snake crawling...");
    }

    @Override
    public void move() {
        crawl();
    }
}
