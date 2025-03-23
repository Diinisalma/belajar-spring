package com.github.diinisalma.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        Book book = (Book) ctx.getBean("book");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor().getName());
        EmailService emailService = (EmailService) ctx.getBean("emailService");
        try {
            emailService.sendMail();
            System.out.println("Email sent successfully");
        } catch (Exception e) {
            System.err.println("Error sending email: " + e.getMessage());
        }
    }
}
