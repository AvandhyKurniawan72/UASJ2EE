package com.kurniawan.avandhy.api.service.impl
import com.kurniawan.avandhy.api.entity.Books
import com.kurniawan.avandhy.api.repository.BooksRepository
import com.kurniawan.avandhy.api.service.BooksService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BooksServiceImpl implements BooksService {
    @Autowired
    private final BooksRepository BooksRepository
    @Override
    List<Books> findAll() {
        BooksRepository.findAll()
    }

    @Override
    Books findById(int id) {
        BooksRepository.findById(id)
    }

    @Override
    Books save(Books books) {
        BooksRepository.save(books)
    }

    @Override
    Books update(Books books, int id) {
        def record = BooksRepository.findById(id)
        record.with {
        name = books.name
        description = books.description
        }
        BooksRepository.save(record)
        record
    }

    @Override
    Books delete(int id) {
        def record = BooksRepository.findById(id)
        BooksRepository.delete(record)
        record
    }
}