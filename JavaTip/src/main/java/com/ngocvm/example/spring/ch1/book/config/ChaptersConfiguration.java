package com.ngocvm.example.spring.ch1.book.config;

import com.ngocvm.example.spring.ch1.book.data.Chapter;
import com.ngocvm.example.spring.ch1.book.data.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(TitlesConfiguration.class)
@Configuration
public class ChaptersConfiguration {
    @Autowired
    Title chapter1Title;
    @Bean
    public Chapter chapter1() {
        Chapter chapter = new Chapter();
        chapter.setContent("The content of chapter 1");
        chapter.setNumber(1);
        chapter.setTitle(chapter1Title);
        return chapter;
    }

    @Autowired
    Title chapter2Title;
    @Bean
    public Chapter chapter2() {
        return new Chapter(2, chapter2Title, "The content of chapter 2");
    }
}
