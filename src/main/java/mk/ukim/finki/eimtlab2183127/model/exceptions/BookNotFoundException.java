package mk.ukim.finki.eimtlab2183127.model.exceptions;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(Long id) {
        super(String.format("Book with id: %d was not found.", id));
    }
}
