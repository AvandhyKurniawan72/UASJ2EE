package com.kurniawan.avandhy.api.controller
import com.kurniawan.avandhy.api.entity.Books
import com.kurniawan.avandhy.api.service.BooksService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/books')
class BooksController {
    @Autowired
    private final BooksService booksService

    @GetMapping('')
    List<Books> findAll() {
        booksService.findAll()
    }

    @GetMapping('{id}')
    Books findById(@PathVariable('id') int id) {
        booksService.findById(id)
    }

    @PostMapping()
    Books save(@RequestBody Books books) {
        booksService.save(books)
    }

    @PutMapping("{id}")
    Books update(@RequestBody Books newBooks, @PathVariable Integer id) {
        BooksService.update(books, id);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Integer id) {
        booksService.delete(id);
    }
}