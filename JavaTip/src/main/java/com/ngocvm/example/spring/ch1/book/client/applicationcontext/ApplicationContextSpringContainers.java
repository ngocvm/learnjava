package com.ngocvm.example.spring.ch1.book.client.applicationcontext;

import com.ngocvm.example.spring.ch1.book.data.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextSpringContainers {

    public static void main(String[] args) {
        // File system resource
        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("D:\\NgocVM\\HaNamMinhJavaTraniningCourse\\3.Project\\2.Source\\learnjava\\JavaTip\\src\\main\\resources\\spring-bean.xml");
        Book myFirstSpringBook1 = (Book) applicationContext1.getBean("myFirstSpringBook");
        System.out.println("Book 1 title: " + myFirstSpringBook1.getTitle().getTitleValue());

        // Multiple File system resource
        ApplicationContext applicationContext2 = new FileSystemXmlApplicationContext(
                "D:\\NgocVM\\HaNamMinhJavaTraniningCourse\\3.Project\\2.Source\\learnjava\\JavaTip\\src\\main\\resources\\books.xml",
                "D:\\NgocVM\\HaNamMinhJavaTraniningCourse\\3.Project\\2.Source\\learnjava\\JavaTip\\src\\main\\resources\\chapters.xml",
                "D:\\NgocVM\\HaNamMinhJavaTraniningCourse\\3.Project\\2.Source\\learnjava\\JavaTip\\src\\main\\resources\\titles.xml");
        Book myFirstSpringBook2 = (Book) applicationContext2.getBean("myFirstSpringBook");
        System.out.println("Book 2 title: " + myFirstSpringBook2.getTitle().getTitleValue());

        // Class path resource
        ApplicationContext applicationContext4 = new ClassPathXmlApplicationContext("spring-bean.xml");
        Book myFirstSpringBook4 = (Book) applicationContext4.getBean("myFirstSpringBook");
        System.out.println("Book 3 title: " + myFirstSpringBook4.getTitle().getTitleValue());

        // Multiple Class path resource
        ApplicationContext applicationContext5 = new ClassPathXmlApplicationContext(
                "books.xml",
                "chapters.xml",
                "titles.xml");
        Book myFirstSpringBook5 = (Book) applicationContext5.getBean("myFirstSpringBook");
        System.out.println("Book 4 title: " + myFirstSpringBook5.getTitle().getTitleValue());
    }

}
