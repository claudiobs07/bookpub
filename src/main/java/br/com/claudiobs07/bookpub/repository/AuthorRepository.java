package br.com.claudiobs07.bookpub.repository;

import br.com.claudiobs07.bookpub.domain.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

}
