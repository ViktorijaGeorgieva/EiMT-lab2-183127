package mk.ukim.finki.eimtlab2183127.service.impl;

import mk.ukim.finki.eimtlab2183127.model.Author;
import mk.ukim.finki.eimtlab2183127.model.Book;
import mk.ukim.finki.eimtlab2183127.model.dto.BookDto;
import mk.ukim.finki.eimtlab2183127.model.enumerations.Category;
import mk.ukim.finki.eimtlab2183127.model.exceptions.AuthorNotFoundException;
import mk.ukim.finki.eimtlab2183127.model.exceptions.UnfilledArgumentsException;
import mk.ukim.finki.eimtlab2183127.repository.BookRepository;
import mk.ukim.finki.eimtlab2183127.service.AuthorService;
import mk.ukim.finki.eimtlab2183127.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final AuthorService authorService;

    public BookServiceImpl(BookRepository bookRepository, AuthorService authorService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
    }

    @Override
    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Optional<Book> save(String name, Category category, Long authorId, Integer availableCopies) {
        if(name.equals(""))
            throw new UnfilledArgumentsException();
        Optional<Author> author = this.authorService.findById(authorId);
        if(author.isEmpty())
            throw new AuthorNotFoundException(authorId);

        Author a = author.get();
        Book book = new Book(name, category, a, availableCopies);
        return Optional.of(this.bookRepository.save(book));
    }

    @Override
    public Optional<Book> save(BookDto bookDto) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> update(Long id, String name, Category category, Long authorId, Integer availableCopies) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> update(Long id, BookDto bookDto) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<Book> markAsTaken(Long id) {
        return Optional.empty();
    }
}
