package net.javaguides.springannotations.controller;

import net.javaguides.springannotations.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookController {
    @RequestMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping(value = {"/book", "/core-java", "/java"})
    public Book getBook(){
        Book book = new Book(1, "Core Java", "Java is Fun");
        return book;
    }
}
