package org.simsek.graphql.service;

import org.simsek.graphql.entity.Author;
import org.simsek.graphql.port.AuthorCreateRequest;
import org.simsek.graphql.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author create(AuthorCreateRequest authorCreateRequest) {
        Author author = Author.builder().id(UUID.randomUUID().toString()).name(authorCreateRequest.getName()).build();

        return authorRepository.saveAndFlush(author);
    }
}
