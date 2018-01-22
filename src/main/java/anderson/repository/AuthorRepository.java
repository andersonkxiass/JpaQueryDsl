package anderson.repository;

import anderson.domain.Author;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("authorRepository")
public interface AuthorRepository extends CrudRepository<Author, Integer>, QueryDslPredicateExecutor<Author> {
}
