package com.github.diinisalma.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.diinisalma.spring.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // XML Configuration
        // ApplicationContext ctx = new
        // ClassPathXmlApplicationContext("application-context.xml");
        // Book book = (Book) ctx.getBean("book");
        // System.out.println(book.getTitle());
        // System.out.println(book.getAuthor().getName());
        // EmailService emailService = (EmailService) ctx.getBean("emailService");
        // try {
        // emailService.sendMail();
        // System.out.println("Email sent successfully");
        // } catch (Exception e) {
        // System.err.println("Error sending email: " + e.getMessage());
        // }

        // Java Configuration
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Author author1 = (Author) ctx.getBean("author1");
        System.out.println(author1.getName());

        Book book1 = (Book) ctx.getBean("book1");
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor().getName());

        EmailService emailService = (EmailService) ctx.getBean("emailService");
        try {
            emailService.sendMail();
            System.out.println("Email sent successfully");
        } catch (Exception e) {
            System.err.println("Error sending email: " + e.getMessage());
        }
    }
}
