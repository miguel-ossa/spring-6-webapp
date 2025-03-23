package guru.springframework.spring6_webapp.repositories;

import guru.springframework.spring6_webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
