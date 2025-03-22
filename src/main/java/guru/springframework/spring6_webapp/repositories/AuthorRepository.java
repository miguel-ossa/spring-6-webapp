package guru.springframework.spring6_webapp.repositories;

import guru.springframework.spring6_webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
