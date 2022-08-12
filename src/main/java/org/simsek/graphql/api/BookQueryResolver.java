package org.simsek.graphql.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.simsek.graphql.entity.Book;
import org.simsek.graphql.repository.BookRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookQueryResolver implements GraphQLQueryResolver {
    private final BookRepository bookRepository;

    public BookQueryResolver(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return this.bookRepository.findAll();
    }

    public Optional<Book> getById(String id) {
        return this.bookRepository.findById(id);
    }
}
