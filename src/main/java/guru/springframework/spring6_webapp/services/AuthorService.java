package guru.springframework.spring6_webapp.services;

import guru.springframework.spring6_webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
