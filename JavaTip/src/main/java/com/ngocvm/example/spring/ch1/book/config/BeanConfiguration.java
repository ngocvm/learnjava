package com.ngocvm.example.spring.ch1.book.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({TitlesConfiguration.class, ChaptersConfiguration.class, BooksConfiguration.class})
@Configuration
public class BeanConfiguration {

}
