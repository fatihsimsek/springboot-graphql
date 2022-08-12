package org.simsek.graphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.simsek.graphql.entity.Author;
import org.simsek.graphql.port.AuthorCreateRequest;
import org.simsek.graphql.service.AuthorService;
import org.springframework.stereotype.Component;

@Component
public class AuthorMutationResolver implements GraphQLMutationResolver {
    private final AuthorService authorService;

    public AuthorMutationResolver(AuthorService authorService) {
        this.authorService = authorService;
    }

    public Author createAuthor(AuthorCreateRequest author) {
        return this.authorService.create(author);
    }
}
