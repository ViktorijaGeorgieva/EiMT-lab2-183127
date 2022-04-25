package mk.ukim.finki.eimtlab2183127.repository;

import mk.ukim.finki.eimtlab2183127.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
