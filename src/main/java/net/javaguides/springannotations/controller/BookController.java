package net.javaguides.springannotations.controller;

import net.javaguides.springannotations.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/books/create",
    consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @PutMapping(value="/books/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book updatedBook){
        System.out.println(id);
        System.out.println(updatedBook.getTitle());
        System.out.println(updatedBook.getDescription());
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping(value = "/books/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        System.out.println(id);
        return ResponseEntity.ok("Book deleted successfully");
    }

    @GetMapping("/books/{id}/{title}/{description}")
    public ResponseEntity<Book> pathVariableDemo(@PathVariable int id,
                                                 @PathVariable String title,
                                                 @PathVariable String description)
    {
        System.out.println(id);
        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setDescription(description);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/books/query")
    public ResponseEntity<Book> requestParamDemo(
            @RequestParam(name = "id") int id,
            @RequestParam(name = "title") String title,
            @RequestParam(name ="description") String description){
        System.out.println(id);
        System.out.println(title);

        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setDescription(description);

        return ResponseEntity.ok(book);
    }

}
