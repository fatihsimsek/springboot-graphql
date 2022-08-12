package org.simsek.graphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.simsek.graphql.entity.Book;
import org.simsek.graphql.port.BookCreateRequest;
import org.simsek.graphql.service.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookMutationResolver implements GraphQLMutationResolver {
    private final BookService bookService;

    public BookMutationResolver(BookService bookService) {
        this.bookService = bookService;
    }

    public Book createBook(BookCreateRequest book) {
        return this.bookService.create(book);
    }
}
