package br.com.claudiobs07.bookpub.repository;

import br.com.claudiobs07.bookpub.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Book findBookByIsbn(String isbn);

}
