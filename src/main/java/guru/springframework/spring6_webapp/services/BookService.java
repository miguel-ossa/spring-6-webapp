package guru.springframework.spring6_webapp.services;

import guru.springframework.spring6_webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
