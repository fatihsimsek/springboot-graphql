package org.simsek.graphql.service;

import org.simsek.graphql.entity.Author;
import org.simsek.graphql.entity.Book;
import org.simsek.graphql.port.BookCreateRequest;
import org.simsek.graphql.repository.AuthorRepository;
import org.simsek.graphql.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookService {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository,
                       AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public Book create(BookCreateRequest bookCreateRequest) {
        Author author = this.authorRepository.getById(bookCreateRequest.getAuthorId());

        Book book = Book.builder().id(UUID.randomUUID().toString())
                                  .name(bookCreateRequest.getName())
                                  .author(author)
                                  .stock(bookCreateRequest.getStock())
                                  .amount(bookCreateRequest.getAmount())
                                  .build();

        return bookRepository.saveAndFlush(book);
    }
}
