package app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.BookDTO;
import app.services.JsonService;

@RestController
public class BookController extends BaseController {

    private JsonService<BookDTO> service;

    public BookController() {
        service = new JsonService<BookDTO>();
    }

    @GetMapping("/books")
    public List<BookDTO> getBookList() {
        return service.getList("books.json", BookDTO.class);
    }
}
