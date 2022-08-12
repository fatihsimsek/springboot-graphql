package org.simsek.graphql.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.simsek.graphql.entity.Author;
import org.simsek.graphql.repository.AuthorRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorQueryResolver implements GraphQLQueryResolver {
    private final AuthorRepository authorRepository;

    public AuthorQueryResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAuthors() {
        return this.authorRepository.findAll();
    }
}
