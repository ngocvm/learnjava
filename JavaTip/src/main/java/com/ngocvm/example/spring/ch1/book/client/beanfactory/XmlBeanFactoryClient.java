package com.ngocvm.example.spring.ch1.book.client.beanfactory;

import com.ngocvm.example.spring.ch1.book.data.Book;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class XmlBeanFactoryClient {
    public static void main(String[] args) {
        // Classpath resource
        Resource resource = new ClassPathResource("beansWithValue.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Book myFirstBook = (Book) beanFactory.getBean("myFirstSpringBook");
        System.out.println("Book title: " + myFirstBook.getTitle().getTitleValue());

        // File system resource
        Resource resource2 = new FileSystemResource("D:\\NgocVM\\HaNamMinhJavaTraniningCourse\\3.Project\\2.Source\\learnjava\\JavaTip\\src\\main\\resources\\beansWithValue.xml");
        BeanFactory beanFactory2 = new XmlBeanFactory(resource2);
        Book myFirstSpringBook2 = (Book) beanFactory2.getBean("myFirstSpringBook");
        System.out.println("Book title 2: " + myFirstSpringBook2.getTitle().getTitleValue());
    }
}
