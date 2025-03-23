package guru.springframework.spring6_webapp.bootstrap;

import guru.springframework.spring6_webapp.domain.Author;
import guru.springframework.spring6_webapp.domain.Book;
import guru.springframework.spring6_webapp.domain.Publisher;
import guru.springframework.spring6_webapp.repositories.AuthorRepository;
import guru.springframework.spring6_webapp.repositories.BookRepository;
import guru.springframework.spring6_webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle(("Domain Driven Design"));
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        eric.setFirstName("Rod");
        eric.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle(("J2EE Development without EJB"));
        noEJB.setIsbn("54757585");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);

        Publisher pub = new Publisher();
        pub.setPublisherName("Eric Publishing");
        pub.setAddress("Rua Percebe");
        pub.setCity("Buttle");
        pub.setZip("90002");
        pub.setState("Montana");

        Publisher pubSaved = publisherRepository.save(pub);

        publisherRepository.save(pubSaved);

        System.out.println(("In Bootstrap"));
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());

    }
}
