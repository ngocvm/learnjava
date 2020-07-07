package com.ngocvm.example.spring.ch1.book.client.applicationcontext;

import com.ngocvm.example.spring.ch1.book.config.BeanConfiguration;
import com.ngocvm.example.spring.ch1.book.config.BooksConfiguration;
import com.ngocvm.example.spring.ch1.book.config.ChaptersConfiguration;
import com.ngocvm.example.spring.ch1.book.config.TitlesConfiguration;
import com.ngocvm.example.spring.ch1.book.data.Book;
import com.ngocvm.example.spring.ch1.book.data.Chapter;
import com.ngocvm.example.spring.ch1.book.data.Title;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(TitlesConfiguration.class);
        Title chapter1Title = (Title) applicationContext1.getBean("chapter1Title");
        System.out.println(chapter1Title.getTitleValue());

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(ChaptersConfiguration.class);
        Chapter chapter1 = (Chapter) applicationContext2.getBean("chapter1");
        System.out.println(chapter1.getTitle().getTitleValue());

        ApplicationContext applicationContext3 = new AnnotationConfigApplicationContext(BooksConfiguration.class);
        Book myFirstSpringBook1 = (Book) applicationContext3.getBean("myFirstSpringBook");
        System.out.println(myFirstSpringBook1.getTitle().getTitleValue());

        ApplicationContext applicationContext4 = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Book myFirstSpringBook2 = (Book) applicationContext4.getBean("myFirstSpringBook");
        System.out.println(myFirstSpringBook2.getTitle().getTitleValue());

//        ApplicationContext applicationContext5 = new AnnotationConfigApplicationContext(MyAppBeansConfiguration.class);
//        Book myFirstSpringBook5 = (Book) applicationContext5.getBean("myFirstSpringBook");
//        System.out.println(myFirstSpringBook5.getTitle().getTitleValue());

        ApplicationContext applicationContext6 = new AnnotationConfigApplicationContext(TitlesConfiguration.class,ChaptersConfiguration.class,BooksConfiguration.class);
        Book myFirstSpringBook6 = (Book) applicationContext6.getBean("myFirstSpringBook");
        System.out.println(myFirstSpringBook6.getTitle().getTitleValue());

    }
}
