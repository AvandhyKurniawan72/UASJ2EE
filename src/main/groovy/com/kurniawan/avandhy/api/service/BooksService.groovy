package com.kurniawan.avandhy.api.service
import com.kurniawan.avandhy.api.entity.Books
interface BooksService {
    List<Books> findAll()
    Books findById(int id)
    Books save(Books books)
    Books update(Books books, int id)
    Books delete(int id)
}