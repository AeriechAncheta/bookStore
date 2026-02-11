package com.weCode.bookStore.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.List;
import com.weCode.bookStore.dto.BookDto;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BookController {
    
    @GetMapping("api/v1/books")
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto book = BookDto.builder()
                .title("The Great Gatsby")
                .build();

        List<BookDto> books = List.of(book);
        return ResponseEntity.ok(books);
    }
}
